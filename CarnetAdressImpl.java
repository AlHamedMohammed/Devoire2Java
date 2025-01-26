
import java.util.List;
import java.util.ArrayList; 
import java.rmi.RemoteException ;
import java.rmi.server.UnicastRemoteObject; 



public class CarnetAdressImpl extends UnicastRemoteObject implements IcarnetAdresse {
  
        private List<String> contacts ; 
  
        CarnetAdressImpl() throws RemoteException {
            contacts = new ArrayList<>() ; 
            contacts.add("Alhamed     :     152656 ") ; 
            contacts.add("Salem     :    8978653 ") ; 
            contacts.add("Mohammed      :   89652 ") ; 
        }


    @Override 
        public void ajouterContact(String nom , String telephone){
                contacts.add(nom + "    :    " + telephone ) ; 
            }
    @Override 
        public String rechercheContact(String nom ) {
          for (String contact : contacts ){

            if(contact.startsWith(nom)){
                System.out.println("la nom est exist ");
                return "Exit " + contact ; 
            }
          }
        return nom +" n'est exist pas au  list  " ;   
        }

    @Override 
        public List<String> afficheToutesContact() {
            return contacts  ; 
        }


}
