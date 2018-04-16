import javax.xml.ws.Endpoint;

import java.lang.*;

public class ProductPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9090/soap/prod", new Product(1, "test", 20.0));
    }
}

// note: service wsdl can be accessed after publishig the service and running the Product class; access wsdl through "http://localhost:9090/soap/prod?wsdl