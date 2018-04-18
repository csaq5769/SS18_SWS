
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Product_QNAME = new QName("http://ServerSide/", "product");
    private final static QName _SOAPException_QNAME = new QName("http://ServerSide/", "SOAPException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link SOAPException }
     * 
     */
    public SOAPException createSOAPException() {
        return new SOAPException();
    }

    /**
     * Create an instance of {@link ProductArray }
     * 
     */
    public ProductArray createProductArray() {
        return new ProductArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerSide/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerSide/", name = "SOAPException")
    public JAXBElement<SOAPException> createSOAPException(SOAPException value) {
        return new JAXBElement<SOAPException>(_SOAPException_QNAME, SOAPException.class, null, value);
    }

}
