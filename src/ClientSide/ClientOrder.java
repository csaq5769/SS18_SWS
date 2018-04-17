package ClientSide;

import ws.Product;
import ws.ProductIMPLService;
import ws.ProductSEI;

import java.util.*;

// TODO: in order to access our product service we need to parse the wsdl file; this is done with 'wsimport -keep http://localhost:8080/soap/prod?wsdl' (or wsimport productservice.xml)
// NOTE: the above command will generate the service code in i. e. ProductIMPLService.java which then is the service we need to access below
// NOTE: unfortunately parsing the wsdl with wsimport tool returned some errors, thus below is the client created without the wsimport tool
public class ClientOrder {

    public static void main(String[] args) throws Exception {

        String desicion;
        int id, amount;

        Scanner scanner = new Scanner(System.in);

        // create service
        ProductIMPLService service = new ProductIMPLService();
        ProductSEI p = service.getProductIMPLPort(); // NOTE: when using wsimport: call productService.getProductIMPLPort();

        while(true) {
            System.out.println("All products in our range:");
            for (int i=0; i<p.getProductList().getItem().size(); i++) {
                Product prod = p.getProductList().getItem().get(i);
                System.out.println("id:" + prod.getProductID() + " name:" + prod.getName() + " price:" + prod.getPrice());
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
                break;
            }
        }
    }
}