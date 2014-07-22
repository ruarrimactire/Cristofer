/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursividad;

import usoComun.usoComun;

/**
 *
 * @author Risto
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = new String();
        String palabra = new String();
        
        System.out.println("Por favor, introduzca una frase.");
        frase = usoComun.leerLinea();
        System.out.println("Por favor, la palabra que desea comprobar.");
        palabra = usoComun.leerLinea();
        
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();
        
        System.out.println("La palabra '" + palabra + "' Esta incluida en '" + frase + "' " + numera(frase, palabra) + " veces.");
    }
    
    public static int numera( String referencia, String comparacion ) {
        int [] removidas = new int[0];
        char [] remLetras = new char[0];
        
        return numera(referencia, comparacion, removidas, 0, remLetras);
        
    }

    public static int numera( String referencia, String comparacion, int[] removidas, int n, char[] remLetras ) {
        
        if (referencia.length() != comparacion.length()) {
            
            int count = 0;
            int[] removidas2 = new int[removidas.length+1];
            for (int i = 0; i < removidas.length; i++){
                removidas2[i] = removidas[i];
            }
            
            char[] remLetras2 = new char[remLetras.length+1];
            for (int i = 0; i < remLetras.length; i++){
                remLetras2[i] = remLetras[i];
            }
            
            for (int i = n ; i < referencia.length() ; i++) {
                removidas2[ removidas2.length-1 ] = i+removidas.length;
                remLetras2[ remLetras2.length-1 ] = referencia.charAt(i);
                
                count += numera( referencia.substring(0, i) + referencia.substring(i+1), comparacion, removidas2, i, remLetras2);
            }
            return count;
        }
        else {
            if (referencia.equals(comparacion)){
                for (int k = 0 ; k < remLetras.length ; k++) {
                    System.out.print(remLetras[k] + "  "); 
                }
                System.out.println();

                for (int k = 0 ; k < removidas.length ; k++) {
                    String format = String.format("%%0%dd", 2);
                    String result = String.format(format, removidas[k]);
                    System.out.print(result + " "); 
                }
                System.out.println();
                System.out.println();

                return 1;
            }
            else {
                return 0;
            }
            
        }
    }
}

