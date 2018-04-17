
package ws;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductIMPLService", targetNamespace = "http://ServerSide/", wsdlLocation = "http://localhost:9000/soap/?wsdl")
public class ProductIMPLService
    extends Service
{

    private final static URL PRODUCTIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTIMPLSERVICE_EXCEPTION;
    private final static QName PRODUCTIMPLSERVICE_QNAME = new QName("http://ServerSide/", "ProductIMPLService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/soap/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTIMPLSERVICE_WSDL_LOCATION = url;
        PRODUCTIMPLSERVICE_EXCEPTION = e;
    }

    public ProductIMPLService() {
        super(__getWsdlLocation(), PRODUCTIMPLSERVICE_QNAME);
    }

    public ProductIMPLService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTIMPLSERVICE_QNAME, features);
    }

    public ProductIMPLService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTIMPLSERVICE_QNAME);
    }

    public ProductIMPLService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTIMPLSERVICE_QNAME, features);
    }

    public ProductIMPLService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductIMPLService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductSEI
     */
    @WebEndpoint(name = "ProductIMPLPort")
    public ProductSEI getProductIMPLPort() {
        return super.getPort(new QName("http://ServerSide/", "ProductIMPLPort"), ProductSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductSEI
     */
    @WebEndpoint(name = "ProductIMPLPort")
    public ProductSEI getProductIMPLPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ServerSide/", "ProductIMPLPort"), ProductSEI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTIMPLSERVICE_EXCEPTION!= null) {
            throw PRODUCTIMPLSERVICE_EXCEPTION;
        }
        return PRODUCTIMPLSERVICE_WSDL_LOCATION;
    }

}
