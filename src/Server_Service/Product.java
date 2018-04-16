package Server_Service;

import javax.jws.WebService;

import java.lang.*;
import java.util.List;

@WebService(endpointInterface = "Products")
public class Product {
    private Integer productID;
    private String productName;
    private Double productPrice;

    public Product()
    {
        this.productID = null;
        this.productName = null;
        this.productPrice = null;
    }
    public Product(Integer productID, String name, Double price) {
        this.productID = productID;
        this.productName = name;
        this.productPrice = price;
    }

    public Integer getProductID() {
        return productID;
    }

    public String getName() {
        return productName;
    }

    public Double getPrice() {
        return productPrice;
    }
}
