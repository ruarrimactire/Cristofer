/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mayusculas;

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
        // Aqui se declara un variante del tipo array.
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
/** arrayList no se puede apuntar de la manera normal con [], por eso se utiliza
         un String temporal, que al estar declarado dentro del else, se borrara
         cada vez que se acabe el else. Esto sirve para ver el concepto de alcance
         y visivilidad de variables.
**/
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
        /**
         * El arrayList se puede modificar la longitud y añadir cosas nuevas.
         */
        String[] arrayLetras = new String[letras.size()];
        letras.toArray(arrayLetras);
        
        System.out.println("dimension del array letras: " + arrayLetras.length);
        System.out.println("celdas rellenadas del array letras: " + j);
        // La longitud del arrayLetras coincide con j.
        
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
