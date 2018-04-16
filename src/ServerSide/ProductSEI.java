// TODO: delete annotation descriptions

package ServerSide;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService // defines that this interface is a service endpoint
@SOAPBinding(style = Style.RPC) // defines to use RPC for our request messages
public interface ProductSEI {

    // returns the list of all products
    @WebMethod // defines the method as a web service operation
    public Product[] getProductList();

    // returns the product object whose id is given
    @WebMethod
    public Product getProduct(int productID);

    // returns true if the order is successful, otherwise returns false
    @WebMethod
    public boolean order(int productID, int quantity);
}
