package ClientSide;

import Server_Service.Product;
import Server_Service.Products;

import java.util.Scanner;

public class ClientOrder {
    public static void main(String[] args) {
        String desicion;
        int id, amount;

        Scanner scanner = new Scanner(System.in);
        // hier muss der service angepingt werden
        Products p = service.getProdutcsPort();
        while(true) {
            System.out.println("All products in our range:");
            for (Product prod : p.getProductList()) {
                System.out.println("id:" + prod.productID + " name:" + prod.productName + " price:" + prod.productPrice);
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
            System.out.println("Do you want to place anoher order  Yes/No");
            desicion = scanner.nextLine();
            if (desicion.equals("No")) {
                break
            }
        }
    }
}