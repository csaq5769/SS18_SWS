package Server_Service;
import javax.xml.ws.Endpoint;

public class ProductPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:9090/soap/prod";
        Endpoint.publish(url, new Products());
        System.out.println("Service started @ " + url);

    }

}

// note: service wsdl can be accessed after publishig the service and running the Product class; access wsdl through "http://localhost:9090/soap/prod?wsdl
