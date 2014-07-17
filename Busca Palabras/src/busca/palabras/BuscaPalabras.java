/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package busca.palabras;

import java.util.ArrayList;
import java.util.List;
import usoComun.usoComun;

/**
 *
 * @author Risto
 */
public class BuscaPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> palabras = new ArrayList<String>();
        
        while(1 == 1){
            int opcion;
            do{
                System.out.println("1. Introducir palabra.");
                System.out.println("2. Buscar palabra.");
                System.out.println("0. Salir");
                opcion = (int)usoComun.leerDouble();
            }while( !(opcion <= 2 && opcion >= 1) );
        
            switch (opcion){
                case 1:
                    System.out.println("Por favor, introduzca una palabra y se añadira a la lista.");
                    palabras.add((String)usoComun.leerLinea());
                    break;

                case 2:
                    System.out.println("Por favor, introduzca una palabra y se comprobara si esta en la lista.");
                    String buscar = new String();
                    buscar = usoComun.leerLinea();
                    for(int i = 0; i < palabras.size(); i++){
                        palabras.get(i);                        
                        if (buscar == palabras.get(i)){
                            System.out.println("Su palabra ya esta en la lista.");
                        }
                        else {
                            System.out.println("Su palabra no esta incluida en la lista.");
                        }
                    }
                    break;
                    
                case 0:
                    return;
            }
        
        }
    }
    
}
