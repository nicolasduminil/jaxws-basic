
package org.grdf.poc.wsdl.auto.index;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CreerIndexAutoReleveService", targetNamespace = "com.grdf.poc.CreerIndexAutoReleveService:1", wsdlLocation = "file:/home/nicolas/eclipse-workspace/create-auto-statement-index/ws/src/main/resources/wsdl/create-auto-statement-index.wsdl")
public class CreerIndexAutoReleveService
    extends Service
{

    private final static URL CREERINDEXAUTORELEVESERVICE_WSDL_LOCATION;
    private final static WebServiceException CREERINDEXAUTORELEVESERVICE_EXCEPTION;
    private final static QName CREERINDEXAUTORELEVESERVICE_QNAME = new QName("com.grdf.poc.CreerIndexAutoReleveService:1", "CreerIndexAutoReleveService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/nicolas/eclipse-workspace/create-auto-statement-index/ws/src/main/resources/wsdl/create-auto-statement-index.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CREERINDEXAUTORELEVESERVICE_WSDL_LOCATION = url;
        CREERINDEXAUTORELEVESERVICE_EXCEPTION = e;
    }

    public CreerIndexAutoReleveService() {
        super(__getWsdlLocation(), CREERINDEXAUTORELEVESERVICE_QNAME);
    }

    public CreerIndexAutoReleveService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CREERINDEXAUTORELEVESERVICE_QNAME, features);
    }

    public CreerIndexAutoReleveService(URL wsdlLocation) {
        super(wsdlLocation, CREERINDEXAUTORELEVESERVICE_QNAME);
    }

    public CreerIndexAutoReleveService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CREERINDEXAUTORELEVESERVICE_QNAME, features);
    }

    public CreerIndexAutoReleveService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreerIndexAutoReleveService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CreerIndexAutoReleveServicePort
     */
    @WebEndpoint(name = "CreerIndexAutoReleveServiceSOAPPort")
    public CreerIndexAutoReleveServicePort getCreerIndexAutoReleveServiceSOAPPort() {
        return super.getPort(new QName("com.grdf.poc.CreerIndexAutoReleveService:1", "CreerIndexAutoReleveServiceSOAPPort"), CreerIndexAutoReleveServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreerIndexAutoReleveServicePort
     */
    @WebEndpoint(name = "CreerIndexAutoReleveServiceSOAPPort")
    public CreerIndexAutoReleveServicePort getCreerIndexAutoReleveServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("com.grdf.poc.CreerIndexAutoReleveService:1", "CreerIndexAutoReleveServiceSOAPPort"), CreerIndexAutoReleveServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREERINDEXAUTORELEVESERVICE_EXCEPTION!= null) {
            throw CREERINDEXAUTORELEVESERVICE_EXCEPTION;
        }
        return CREERINDEXAUTORELEVESERVICE_WSDL_LOCATION;
    }

}
