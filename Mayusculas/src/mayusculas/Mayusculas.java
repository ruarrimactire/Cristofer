/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mayusculas;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Risto
 */
public class Mayusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println ("Por favor, introduzca su nombre y apellido.");
        String nombre = usoComun.leerLinea();
        
        List<String> letras = new ArrayList<String>();
        
        /**
         * En un string no se pueden modificar los elementos, solo añadir mas.
         * Un array separa la cadena en celdas y se pueden modificar los elementos.
         */
        int j = 0;
        for (int i = 0; i< nombre.length(); i++ ){
            if (nombre.charAt(i) == ' ' || nombre.charAt(i) == '\t'){
                continue;
            }
            else {
                String temp = "";
                while (i< nombre.length() && nombre.charAt(i) != ' ' && 
                        nombre.charAt(i) != '\t' ){
                    temp += nombre.charAt(i);
                    i++;
                }
                letras.add(temp);
                j++;
            }
        }
        
        String[] arrayLetras = new String[letras.size()];
        letras.toArray(arrayLetras);
        
        System.out.println("dimension del array letras: " + arrayLetras.length);
        System.out.println("celdas rellenadas del array letras: " + j);
        
        for (int i = 0; i < arrayLetras.length; i++ ){
            System.out.print( arrayLetras[i].substring(0,1).toUpperCase() +
                    arrayLetras[i].substring(1).toLowerCase() + " " );
        }
        System.out.print('\n');
        
       /**
        * toUpperCase es un metodo de la clase String, que cambia por mayusculas
        *       las letras de las posiciones indicadas.
        * toLowerCase es un metodo de la clase String, cambia a minusculas las 
        *       letras de las posiciones indicadas.
        */
    }
    
}
