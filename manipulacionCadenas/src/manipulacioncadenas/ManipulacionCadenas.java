/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manipulacioncadenas;

import java.util.Arrays;

/**
 *
 * @author Risto
 */
public class ManipulacionCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1, s2;
        char[] lugar1 = { 'e', 'n', ' ', 'u', 'n', ' ',
                          'l', 'u', 'g', 'a', 'r', ' ',
                          'd', 'e', ' ', 'l', 'a', ' ',
                          'm', 'a', 'n', 'c', 'h', 'a'};
        char[] lugar2, lugar3;
       
        //Creacion de un String desde un array de char.
        System.out.println("Array1: " + Arrays.toString(lugar1) + " Longitud: " + lugar1.length);
        s1 = new String(lugar1);
        System.out.println("Array1: " + s1 + " Longitud: " + s1.length());
        
        //Sustituimos todas las 'u' y las 'a' por la letra 'e'.
        s2 = s1.replace ('u', 'e');     s2 = s2.replace('a', 'e');
        System.out.println("Cadena nueva: " + s2 + " Longitud: " + s2.length());
        
        //Transformamos el String a un Array (2 formas)
        lugar2 = s2.toCharArray();
        System.out.println("Array2: " + Arrays.toString(lugar2) + " Longitud: " + lugar2.length);
        
        lugar3 = new char[s2.length()];
        // Ejemplo de bucle for con dos indices, dentro de la instruccion del bucle las ','
        // separan las instrucciones de los dos indices.
        for(int i = s2.length()-1, j = 0; i >= 0; i--, j++ ){
            lugar3[j] = s2.charAt(i);
        }
        System.out.println("Array3: " + Arrays.toString(lugar3) + " Longitud: " + lugar3.length);
    }
    
}