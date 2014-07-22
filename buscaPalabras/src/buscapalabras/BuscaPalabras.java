/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buscapalabras;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;
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
                System.out.println("3. Imprimir lista.");
                System.out.println("0. Salir");
                opcion = (int)usoComun.leerDouble();
            }while( !(opcion <= 3 && opcion >= 0) );
        
            switch (opcion){
                case 1:
                    System.out.println("Por favor, introduzca una palabra y se añadira a la lista.");
                    palabras.add((String)usoComun.leerLinea());
                    break;

                case 2:
                    System.out.println("Por favor, introduzca una palabra y se comprobara si esta en la lista.");
                    /**
                    * El flag toma un "apunte" dentro de un bucle cuando pasa algo 
                    * que halla que evaluar mas tarde.
                    */
                    boolean flag = false;
                    String buscar = usoComun.leerLinea();
                    for(int i = 0; i < palabras.size(); i++){
                        // el metodo objeto.equals comprueba similitudes entre dos strings.
                        if (buscar.equals(palabras.get(i))){
                            System.out.println("Su palabra ya esta en la lista en la posición: " + (i+1) );
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        System.out.println("Su palabra no esta incluida en la lista.");
                    }
                    break;
                    
                case 3:
                    for(int i = 0; i < palabras.size(); i++){
                        System.out.println(palabras.get(i));
                    }
                    break;
                    
                case 0:
                    return;
            }
        
        }
    }
    
}
