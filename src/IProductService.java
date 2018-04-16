import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import java.util.*;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IProductService
{
    // returns the list of all products
    List<Product> getProductList();

    // returns the product object whose id is given
    Product getProduct(int productID);

    // returns true if the order is successful, otherwise returns false
    @WebMethod
    boolean order(int productID, int quantity);
}
