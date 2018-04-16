import Server_Service.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import java.util.*;

@WebService
@SOAPBinding(style = Style.RPC)
public class Products {

    private ArrayList<Product> products;

    public Products() {
        products = new ArrayList<>();
        products.add(new Product(1, "skirt", 8.00));
        products.add(new Product(2, "Jeans", 20.45));
        products.add(new Product(3, "blouse", 15.50));
    }

    // returns the list of all products
    public Product[] getProductList() {
        Product[] order = products.toArray(new Product[products.size()]);
        return order;
    }

    // returns the product object whose id is given
    public Product getProduct(int productID) {
        for (Product prd : products) {
            if (prd.getProductID() == productID)
                return prd;
        }
        return null;
    }
    // returns true if the order is successful, otherwise returns false
    @WebMethod
    public boolean order(int productID, int quantity) {
        if(quantity <0) {
            if (getProduct(productID) != null) {
                return true;
            }
        }
        else{
            return false;
        }
    }
}
