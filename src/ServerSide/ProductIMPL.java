package ServerSide;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

import java.util.*;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ProductIMPL {

    @XmlElement(name="product")
    private ArrayList<Product> products;

    public ProductIMPL() {
        products = new ArrayList<>();
        products.add(new Product(4, "skirt", 8.00));
        products.add(new Product(2, "jeans", 20.45));
        products.add(new Product(3, "blouse", 15.50));
    }

    // returns the list of all products
    @WebMethod
    @XmlElement(name = "product")
    public Product[] getProductList() {
        Product[] order = products.toArray(new Product[products.size()]);
        return order;
    }

    // returns the product object whose id is given
    @WebMethod
    public Product getProduct(int productID) throws SOAPException {
        for (Product prd : products) {
            if (prd.getProductID() == productID)
                return prd;
        }
        SOAPFactory soapFactory = SOAPFactory.newInstance();
        SOAPFault soapFault = soapFactory.createFault("no Product found", new QName("http://schemas.xmlsoap.org/soap/envelope/", "Client"));
        throw new SOAPFaultException(soapFault);
    }
    // returns true if the order is successful, otherwise returns false
    @WebMethod
    public boolean order(int productID, int quantity) throws SOAPException{
        if(quantity >0) {
            if (getProduct(productID) != null) {
                return true;
            }
        }

        return false;
    }
}
