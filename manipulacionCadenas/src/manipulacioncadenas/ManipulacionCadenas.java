/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manipulacioncadenas;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        // La funcion del bucle es imprimir la cadena al reves.
        for(int i = s2.length()-1, j = 0; i >= 0; i--, j++ ){
            lugar3[j] = s2.charAt(i);
        }
        System.out.println("Array3: " + Arrays.toString(lugar3) + " Longitud: " + lugar3.length);
    

        System.out.println("Contenido del String s1: " + s1);
        
        // Separamos la cadena
        // (El espacion en blanco como delimitador)
        // Se crea el Stringtokenizer asignandole la cadena de 's1' y ' ' como delimitador.
        StringTokenizer palabras = new StringTokenizer(s1, " ");
        
        System.out.println("Numero de palabras " + palabras.countTokens());
        // hasMoreTokens verifica que el contador no este al final.
        while ( palabras.hasMoreTokens()){
            // nextToken devuelve en forma de String lo que hay en la posicion 
            // a la que apunta el contador, y despues incrementa el contador de 1.
            System.out.println(palabras.nextToken());
        }
        
        // El metodo split permite la utilizacion de una expresion regular como delimitador.
        // los [] sirven para enumerar una lista de delimitadores.
        // El doble \\ sirve para que cuando se pase la cadena a split, se imprima en su lugar
        // la singula \.
        // Si no se usan los [] el split usa la cadena entera.
        String[] palabras2 = s1.split("[\\se]");
        System.out.println("Numero de palabras: " + palabras2.length);
        
        for (int i = 0; i < palabras2.length; i++){
            System.out.println(palabras2[i]);
        }
        
        System.out.println();
        Scanner sc = new Scanner(s1).useDelimiter("\\s");
        int i = 0;
        // Scanner funciona muy parecido al StringTokenizer, pero utiliza expresiones
        // regulares tambien tiene los metodos '.hasNext' y '.next'
        while (sc.hasNext()){
            System.out.println(sc.next());
            i++;
        }
        System.out.println("Numero de palabras: " + i);
        // El Scanner siempre se tiene que cerrar al final.
        sc.close();

    }
        
    
    
}