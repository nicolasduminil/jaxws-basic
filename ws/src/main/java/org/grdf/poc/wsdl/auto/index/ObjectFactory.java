
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.grdf.poc.wsdl.auto.index package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IndexAutoReleveRequest_QNAME = new QName("com.grdf.poc.IndexAutoReleveRequest-v1.2", "indexAutoReleveRequest");
    private final static QName _IndexAutoReleveResponse_QNAME = new QName("com.grdf.poc.IndexAutoReleveResponse-v1.2", "indexAutoReleveResponse");
    private final static QName _PocHdr_QNAME = new QName("com.grdf.poc.header.v1.1", "pocHdr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.grdf.poc.wsdl.auto.index
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndexAutoReleveRequestType }
     * 
     */
    public IndexAutoReleveRequestType createIndexAutoReleveRequestType() {
        return new IndexAutoReleveRequestType();
    }

    /**
     * Create an instance of {@link IndexAutoReleve }
     * 
     */
    public IndexAutoReleve createIndexAutoReleve() {
        return new IndexAutoReleve();
    }

    /**
     * Create an instance of {@link PCETypeLocal }
     * 
     */
    public PCETypeLocal createPCETypeLocal() {
        return new PCETypeLocal();
    }

    /**
     * Create an instance of {@link TIndex }
     * 
     */
    public TIndex createTIndex() {
        return new TIndex();
    }

    /**
     * Create an instance of {@link CompteurTypeLocal }
     * 
     */
    public CompteurTypeLocal createCompteurTypeLocal() {
        return new CompteurTypeLocal();
    }

    /**
     * Create an instance of {@link IndexAutoReleveResponseType }
     * 
     */
    public IndexAutoReleveResponseType createIndexAutoReleveResponseType() {
        return new IndexAutoReleveResponseType();
    }

    /**
     * Create an instance of {@link ErreurType }
     * 
     */
    public ErreurType createErreurType() {
        return new ErreurType();
    }

    /**
     * Create an instance of {@link TpocHdr }
     * 
     */
    public TpocHdr createTpocHdr() {
        return new TpocHdr();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexAutoReleveRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexAutoReleveRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "com.grdf.poc.IndexAutoReleveRequest-v1.2", name = "indexAutoReleveRequest")
    public JAXBElement<IndexAutoReleveRequestType> createIndexAutoReleveRequest(IndexAutoReleveRequestType value) {
        return new JAXBElement<IndexAutoReleveRequestType>(_IndexAutoReleveRequest_QNAME, IndexAutoReleveRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexAutoReleveResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IndexAutoReleveResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "com.grdf.poc.IndexAutoReleveResponse-v1.2", name = "indexAutoReleveResponse")
    public JAXBElement<IndexAutoReleveResponseType> createIndexAutoReleveResponse(IndexAutoReleveResponseType value) {
        return new JAXBElement<IndexAutoReleveResponseType>(_IndexAutoReleveResponse_QNAME, IndexAutoReleveResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TpocHdr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TpocHdr }{@code >}
     */
    @XmlElementDecl(namespace = "com.grdf.poc.header.v1.1", name = "pocHdr")
    public JAXBElement<TpocHdr> createPocHdr(TpocHdr value) {
        return new JAXBElement<TpocHdr>(_PocHdr_QNAME, TpocHdr.class, null, value);
    }

}
