package ServerSide;
import javax.xml.ws.Endpoint;

public class ProductPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:9090/soap";
        Endpoint.publish(url, new ProductIMPL());
        System.out.println("Service started @ " + url);
    }

}

// note: service wsdl can be accessed after publishing the service and running the Product class; access wsdl through http://localhost:8080/soap/prod?wsdl
