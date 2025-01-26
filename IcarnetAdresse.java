

import java.rmi.Remote ; 
import java.rmi.RemoteException ;
import java.util.List; 

public interface IcarnetAdresse extends Remote {
    void ajouterContact(String nom , String telephone ) throws RemoteException ; 
    String rechercheContact(String nom ) throws RemoteException ; 
    List<String> afficheToutesContact() throws RemoteException ; 
    
}
