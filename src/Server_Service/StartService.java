package Server_Service;
import javax.xml.ws.Endpoint;

public class StartService {
    public static void main(String[] args) {
        String url = "http://localhost:2222/assignment3";
        Endpoint.publish(url, new Products());
        System.out.println("Service started @ " + url);

    }

}