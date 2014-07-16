/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nombreinvertido;

import usoComun.*;

/**
 *
 * @author Risto
 */
public class NombreInvertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca su nombre por favor, ");
        String nombre = new String(usoComun.leerLinea());
        
        String invertido = new String();
        for (int i = (nombre.length()-1); i >= 0; i--){
            invertido += nombre.substring(i,i+1);
        }
        
        System.out.println ("A continuacion se muestra su nombre al reves: \n" + invertido); 
        
        System.out.println ("A continuacion se muestra su nombre con saltos de letra: \n");
        for (int i = 0; i < nombre.length(); i+=2){
            System.out.print(nombre.charAt(i));
        }
        System.out.println ("");
        System.out.print ("\n");
        
    }
    
}
