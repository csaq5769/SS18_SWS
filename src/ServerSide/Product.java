package ServerSide;

import java.lang.*;

// Product type def
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

    public void setProductID(Integer productID) { this.productID = productID; }

    public String getName() {
        return productName;
    }

    public void setName(String name) { this.productName = name; }

    public Double getPrice() {
        return productPrice;
    }

    public void setPrice(Double price) { this.productPrice = price; }
}
