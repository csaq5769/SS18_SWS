package ServerSide;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.lang.*;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
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
