# JAX-WS Basic
This is a prototype wihch aims at demonstrating the use of the JAX-WS (*Java API for XML Services*) asynchronous client feature. This feature is required such that to avoid executing blocking calls to web services and exposing the caller to slownesses or timeouts risks. 

## The context

Our organization maintains a quite large base of JAX-WS web services. These web services, most of which are grouped in the OSE application, are themself clients of of SAP web services. They currently invoke these SAP web services in a synchrounous way, meaning that they are waiting the reponses to their requests. As long as the responses to the requestes aren't received, the web services are waiting, blocking this way the execution queue and preventing the subsequent requests to be executed.

This issue has been highlighted recently, in production, when a correction applied to one of the SAP web services had a considerable impact on its responsivness. Accordingly, the SAP web service response time of has increased and, consequently, the OSE web service has time-out, thus preventing the users from regularly getting the exepected processing results.

Several solutions have been proposed in order to address this issue. First, the idea of increasing the OSE web service time-out has been dismissed as it couldn't be considered a real solution. Then, we have considered the possibility of using dedicated *work managers*. The concept of *work manager* is an Oracle WebLogic vendor specific one.

Oracle WebLogic is a Jakarta EE 8 compliant application server and, as such, it allows applications and services to be deployed into and it serves external consumers requesting these applications and services execution. The requests are received by a dedicated component, named *the socket muxe*. Once a request is received by the *socket muxe*, it is stored in a sequential *execution queue*. Then, another dedicated component, named *the self tuned thread*, maintains a *thread pool* and associates each request in the *execution queue* with a spare thread in the *thread pool*. This operation is based on a set of rules called *work managers*. A *work manager* is a set of policies aiming at prioritizing work and maintaining threads. Accordingly, the *self tuned thread* associates requests from the *execution queue* to spare threads in the *thread pool* as follows:

- if the component serving a given request has a dedicated *work manager* associated to it, then the *self tuned thread* uses the defined set of policies in order to extract the request from the *execution queue* and to schedule it for execution;
- otherwise the system wide default *work manager* is used, which boils down to process one by one requests in the *execution queue*, in the order they came. 

Hence, in order that dedicated *work managers* could solve the presented issue, it would have been necessary that we could define specific execution profiles for them. As a matter of fact, defining dedicated *work managers* having the same set of policies as existent ones boils down to having only one, the default *work manager*. But defining such specific execution profiles for the OSE web services isn't a trivial task and, additionally, even if we succeed, this is not a real solution either, as whatever the priorities associated to request might be, it may happen anyway that the processing time be superior to the waiting capacity of the consumer.

Based on these considerations, it was decided to adopt the following rule of thumb: 

>A web service consumer calling an external endpoint shall never do it synchronously.

The JAX-WS specifications offer provisions for the asynchronous client implementation, as explained further.

## Solution overview
The JAX-WS specifications allow web services clients to asynchronously invoke endpoints. Asynchronous web service clients may be constructed in one of two ways: with polling or with a callback. With the polling method, the client sleeps and checks time to time for the response availability. This is not suitable for applications like ours where the main thread needs to be free in order to keep responsiveness. With the call back method, clients pass a handler reference to the web service and this object will be populated when the response is ready. This allows the client thread to continue with other business operation while the web service is processing the request and providing the response.

## Running the prototype.
The current prototype has been developed based on an use case extracted form OSE. This use case, named `CreerIndexAutoReleve`, has been chosen due to its less complex WSDL contract.

The prototype consists in a maven master project, having two modules: a JAR one hosting the Java artifacts resultinng from the `wsimport` command and a WAR one hosting the SEI implementation as well as a couple of unit tests.

There are two GIT branches: the `master` one with the nominal synchronous case and the `async` one showing the asynchronous client case.  

In order to run the prototype, do the following:

1. Clone the git repository using the following command:
2. Make sure you're on the `master`branch running the following command:
3. Build the deployable archive by running the following command:
4. Make sure that the WebLogic server is running and then deploy the WAR by running the following command:
5. Run the unit tests

You just experienced the standard nominal case of the synchronous call. Now, in order to see how the asynchronous case works, checkout the `async` branch by running the following command:

    >git checkout async

Then execute the same operations sequence as above. You'll see how the unit tests asynchronously call the deplyed web service. Now, look at the source code and compare the two cases. Enjoy !