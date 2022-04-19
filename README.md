# JAX-WS Basic
Ce projet est un prototype qui démontre l'utilisation du client asynchrone JAX-WS (*Java API for XML Services*). Cette fonctionalité est requise de manière à éviter les appels bloquants à des services web externes, appels qui exposent l'appelant à des lenteurs et des risques de *time-out*. 

## Le contexte

Notre organisation maintien une base assez importante de services web JAX-WS. Ces services web, dont une bonne partie sont regroupé dans le cadre du projet OSE, sont eux même des clients des services web SAP. Ils invoquent les services SAP en mode synchrone, c'est à dire qu'ils attendent les réponses à leur requêytes avant de continuer les traitememnts. Tant que les réponses aux requêtes n'ont pas été reçues, les services web appelants restent en attente, bloquant ainsi la queue d'exécution et empêchant les autres requêtes de s'exécuter. 

Ce problème a été mis en évidence récemment, en production, lorsq'une évolution appliquée auprès d'un des services web SAP a eu comme impact l'augmentation du temps de traitement de ce dernier. Le service web SAP en question est devenu moins responsif et, par conséquent, le service web OSE appelant est sorti sur *time-out* privant ainsi ses utilisateurs du résultat des traitements.

PLusieurs solutions ont été proposées à fin d'adresser ce problème. D'abord, l'idée d'une augmentation du *time-out* associé au service OSE a été écartée, car pas une véritable solution. Ensuite, nous avions considéré la possibilité d'utiliser des *work managers* dédiés. Le concept de *work manager* est un concept spécifique propriétaire d'Oracle WebLogic.

Oracle WebLogic est une plateforme compatible Jakarta EE 8 et, comme tel, ce serveur d'application permet le déploiement de services que des clients externes peuvent consomer. Les requêtes sont reçues par un composant dédié, appelé *socket muxe*. Une fois des requêtes reçues par le *socket muxe*, elles sont rangées dans une structure séquentielle appelée *queue d'exécution*. Là, un autre composant dédié, le *self tuned thread*, maintient un *thread pool* et associe chaque requête dans la *queue d'exécution* à un *thread* disponible dans le *thread pool*. Cette opération est basée sur un ensemble de règles définies sous forme de *work managers*. Un *work manager* est donc un ensemble de règles permettant de prioriser les montées en charge et de maintenir le nombre de *threads* disponible à des valeurs correcte, en adéquation avec la charge du travail du moment.

Ainsi, le *self tuned thread* associe les requêtes de la *queue d'exécution* à des *threads* disponibles comme suit:

- si le composant qui sert la requête courante est associé à un *work manager* dédié, alors le *self tuned thread* utilise les règles définies dans le cadre de ce *work manager* pour extraire cette requête depuis la *queue d'exécution* et de la planifier en exécution en lui affectant un *thread* disponible dans le *thread pool*;
- dans le cas contraire, le *work manager* global par défaut est utilisé, ce qui revient à traiter les requêtes une par une, dans l'ordre de leur arrivé.

Ainsi, pour que l'utilisation des *work managers* dédiés puissent constituer une solution à notre problème, il faudrait pouvoir définir des *profils d'exécution* spécifiques aux requêtes associées. Car définir des *work managers* dédiés ayant le même *profil d'exécution* que d'autres revient à utiliser le *work manager* par défaut. Mais définir des tels *profils d'exécution* nécessite de pouvoir classifier les requêtes et établir des règles indiquant que, par exemple, telle requête est plus prioritaire q'une autre et d'estimer le pourcentage des ressources utilisées qui devrait leur être alloué. Et au-delà du caractère complèxe de ce processus de définition, pour lequel il est très incertain que nous disposions des données de production requises, ont voit bien que, quelque soit le jeux des priorités et autres stratégies, il est toujours probable que le temps de traitememnt nécessaire au service web appelé soit supérieur à la capacité d'attente de l'appelant, qui finira par sortir sur *time-out*.

Sur la base de ces considérations, il a été décidé d'adopter la règle suivante: 

>Un web service client d'un autre web service externe doit toujours consommer de manière asynchrone les services exposés par ce dernier.

Les spécifications JAX-WS offre cette possibilité d'implémenter des client asynchrones, comme explique ci-dessous.

## La solution proposée
Les spécificatioins JAX-WS permettent aux services web étant eux même des clients d'autres services web d'invoquer ces derniers de manière asynchrone. Ces clients asynchrones peuvent être implémentés de deux manières: à base de *polling* ou à base de *callback*. Avec la méthode du *polling*, le client dort et se réveille de temps en temps pour vérifier la disponibilité de la réponse. Ce modèle de traitememnt n'est pas adapté à des applications comme les nôtres où le *thread* principal doit être libre de manière à assurer le caractère responsif. Avec la méthode du *callback*, les clients passent la référence d'un *handler* au service web appelé et cet objet sera peuplé avec la réponse, lorsqu'elle sera disponible. Ce modèle de traitememnt permet au client de continuer à effectuer des opérations métier pendant que le service web appelé est en train de traiter la requête et de préparer la réponse.

## Exécution du prototype.
Ce prototype a été développé sur la base d'un cas d'utilisation extrait depuis OSE. Ce cas d'utilisation, nomé `CreerIndexAutoReleve`, a été choisi à cause du fait qu'il expose un contrat WSDL un peu moins complèxe que les autres. Néanmoins, la grammaire associée consiste en plusieurs milliers de lignes de code.

Le prototype consiste dans un paojet pricipal maven, ayant deux modules: un JAR pour héberger les artéfacts Java qui résultent de l'exécution de la commande `wsimport`, et un WAR qui contient l'implémentation du SEI (*Service Endpoint Interface*) ainsi que des tests unitaires.

Il y a deux branches GIT: `master` qui contien le cas d'utilisation nominal synchrone et `async` qui démontre le cas d'utilisation du client asynchrone.  

Pour faire tourner le prototype:

1. Clonee le repository GIT avec la commande suivante:
2. Assurez vous que vous soyez sur la branche `master` ainsi:
3. Compilez et packagez l'archive déployable:
4. Assurez vous que le serveur WebLogic 12c est actif et déployez le WAR:
5. Exécutez les tests unitaires:

Une fois avoir testé le cas nominal, celui du client synchrone, vous pouvez faire pareil pour celui du client asynchrone:

    >git checkout async

Effectuez maintenant les mêmes opérations ci-dessous. Vous pouvez ainsi vérifier le fonctionnememnt du client asynchrone JAX-WS. Le codse source est à votre disposition pour comparer les deux cas.