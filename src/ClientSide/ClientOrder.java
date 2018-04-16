package ClientSide;

import ServerSide.Product;
import ServerSide.ProductIMPL;
import ServerSide.ProductSEI;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.util.Scanner;

// TODO: in order to access our product service we need to parse the wsdl file; this is done with 'wsimport -keep http://localhost:8080/soap/prod?wsdl' (or wsimport productservice.xml)
// NOTE: the above command will generate the service code in i. e. ProductIMPLService.java which then is the service we need to access below
// NOTE: unfortunately parsing the wsdl with wsimport tool returned some errors, thus below is the client created without the wsimport tool
public class ClientOrder {

    public static void main(String[] args) throws Exception {

        String desicion;
        int id, amount;

        Scanner scanner = new Scanner(System.in);

        // create service
        // NOTE: if we create the service using wsimport the generation below would not be needed
        URL url = new URL("http://localhost:8080/soap/prod?wsdl");
        QName qname = new QName("http://ServerSide/", "ProductIMPLService");
        Service service = Service.create(url, qname); // NOTE: when using wsimport: call ProductIMPLService productService = new ProductIMPLService();

        ProductSEI p = service.getPort(ProductSEI.class); // NOTE: when using wsimport: call productService.getProductIMPLPort();

        while(true) {
            System.out.println("All products in our range:");
            for (Product prod : p.getProductList()) {
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