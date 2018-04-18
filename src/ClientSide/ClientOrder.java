package ClientSide;

import ws.Product;
import ws.ProductIMPL;
import ws.ProductIMPLService;

import java.util.*;

public class ClientOrder {

    public static void main(String[] args) throws Exception {
        int id, amount,desicion;

        Scanner scanner = new Scanner(System.in);

        // create service
        ProductIMPLService service = new ProductIMPLService();
        ProductIMPL p = service.getProductIMPLPort();

        while(true) {
            System.out.println("All products in our range:");
            System.out.println(p.getProduct(2).getProductName());
            for (int i=0; i< p.getProductList().getItem().size(); i++) {
                Product prod = p.getProductList().getItem().get(i);
                System.out.println("id:" + prod.getProductID() + " name:" + prod.getProductName() + " price:" + prod.getProductPrice());
            }
            System.out.println("Please type in the product id of the product you want to buy and how much");
            System.out.println("Enter the id: ");
            id = scanner.nextInt();
            System.out.println("Enter the quantity: ");
            amount = scanner.nextInt();
            if (p.order(id, amount)) {
                System.out.println("order accepted");
            } else {
                System.out.println("order declined");
            }
            System.out.println("Do you want to place another order  Yes..1/No...0");
            desicion = scanner.nextInt();
            if (desicion==0) {
                break;
            }
        }
    }
}