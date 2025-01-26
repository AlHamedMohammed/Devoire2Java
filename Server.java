
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String []args ) throws RemoteException , MalformedURLException{ 
        CarnetAdressImpl serverRMI = new CarnetAdressImpl() ; 
        Registry registry = LocateRegistry.createRegistry(3335) ; 
        registry.rebind("rmi://localhost:1125/RMI", serverRMI);
        System.out.println("Server running ");

    }

    
}
