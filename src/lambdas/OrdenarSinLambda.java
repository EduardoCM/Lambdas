package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarSinLambda {    
   
    public static void main(String[] args) {
        
         List<Persona> clientes = new ArrayList<Persona>();
     
         clientes.add(new Persona("Lety"));
         clientes.add(new Persona("Alberto"));
         clientes.add(new Persona("Carlos"));
         clientes.add(new Persona("Yesica"));
         
        
         
         Collections.sort(clientes, (Persona p1, Persona p2) -> p1.nombre.compareTo(p2.nombre));

        
        
    }
   
    
    public void nuevometodo(){
        
    }
   
    
}
