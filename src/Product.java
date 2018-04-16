import javax.jws.WebService;

import java.lang.*;
import java.util.List;

@WebService(endpointInterface = "IProductService")
public class Product implements IProductService
{
    int productID;
    String productName;
    double productPrice;

    public Product(int id, String name, double price)
    {
        productID = id;
        productName = name;
        productPrice = price;
    }

    // TODO: implement
    public List<Product> getProductList() {
        return null;
    }

    // TODO: implement
    public Product getProduct(int productID) {
        return null;
    }

    // TODO: implement
    public boolean order(int productID, int quantity) {
        return false;
    }
}
