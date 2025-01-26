import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List ; 
import java.util.Scanner;

public class Client {


    
        public static void main(String []args )  {
        try{
    
            Registry registry = LocateRegistry.getRegistry("localhost" , 3335) ; 
            IcarnetAdresse stub = (IcarnetAdresse) registry.lookup("rmi://localhost:1125/RMI") ; 

            Scanner scanner = new Scanner(System.in) ; 
            boolean running = true ;
          
          
            while (running ) {
                choisirTonChois() ; 
                System.out.println("\nTapez votre chois : ");
                String chois = scanner.nextLine() ; 
               
               
                switch (chois) {
                   case "1": 

                            System.out.println("\nAjouter les information :");
                            System.out.println("Nom :");  String nomNouvel = scanner.nextLine()  ; 
                            System.out.println("Telephone :");
                            String telephoneNouvel = scanner.nextLine()  ; 
                            stub.ajouterContact(nomNouvel,telephoneNouvel); 
                            break ; 
                            
                   case "2" : 
                            System.out.println("Taper  le nom qui vous voluez rechercher :");
                            String nomRechercher = scanner.nextLine()  ; 
                            System.out.println(stub.rechercheContact(nomRechercher)) ;
                            break ; 


                   case "3" : 
                           List<String> listOfContacts = new ArrayList<>() ; 
                           listOfContacts = stub.afficheToutesContact();
                           int i = 1 ;
                           String line = "|--------------------------------|" ;
                           System.out.println(line); 
                           System.out.println("|     Nom     |   Telephone      |"); 
                           System.out.println(line); 
                           
                           for (String contact : listOfContacts ) {
                               System.out.println("| " + i + "   " + contact );
                               System.out.println("|--------------------------------|"); 

                               i+=1 ; 
                           }
                           break; 
                   case "q" : 
                            System.out.println("A Bientot ");
                            running = false ; 
                            break ; 
                   case "Q" :
                            System.out.println("A Bientot "); 
                            running = false ; 
                            break ; 
                   
                   default:
                        System.out.println("|--------------------------------------|");
                        System.out.println("| chois Invalid ! Tapez une chois valid  |");
                        System.out.println("|--------------------------------------|");

                }
            } 
            scanner.close() ; 
        
    } catch(Exception e ) {e.printStackTrace();}

    }
  
  
  
    static void choisirTonChois() {
    
        System.out.println("\n  Tapez ton chois : \n" +
                            "   1 - Ajouter un nouvel contact \n" + 
                            "   2 - Rechercher Contacte par le nom  \n" +
                            "   3 - Affiche toutes les Contactes \n" +
                            "   q/Q - Quite la programme \n" 
        );

    }



}


