
package org.grdf.poc.wsdl.auto.index;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CreerIndexAutoReleveServicePort", targetNamespace = "com.grdf.poc.CreerIndexAutoReleveService:1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreerIndexAutoReleveServicePort {


    /**
     * 
     * 				Creer Index AutoReleve service.
     * 			
     * 
     * @param parameters
     * @return
     *     returns org.grdf.poc.wsdl.auto.index.IndexAutoReleveResponseType
     */
    @WebMethod(action = "http://com.grdf.poc/ticc/CreerIndexAutoReleveService/CreerIndexAutoReleve")
    @WebResult(name = "indexAutoReleveResponse", targetNamespace = "com.grdf.poc.IndexAutoReleveResponse-v1.2", partName = "parameters")
    public IndexAutoReleveResponseType creerIndexAutoReleve(
        @WebParam(name = "indexAutoReleveRequest", targetNamespace = "com.grdf.poc.IndexAutoReleveRequest-v1.2", partName = "parameters")
        IndexAutoReleveRequestType parameters);

}
