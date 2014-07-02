/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package letrascomunes;


/**
 *
 * @author Risto
 */
public class LetrasComunes {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String palabra1 = "";
        String palabra2 = new String ();

        System.out.println ("Por favor, introduce la primera palabra.");
        palabra1 = usoComun.leerLinea();

        System.out.println ("Por favor, introduce la segunda palabra.");
        palabra2 = usoComun.leerLinea();

        System.out.println ("A continuación se muestran las letras comunes ");

        /** length() metodo de la clase String, que devuelve la longitud de una 
         *      cadena. 
         *  charAt(int i) metodo de la clase String, devuelve el caracter que se
         *      emcuentra en la posición i.
         *  substring(int inicio, int fin) metodo de la clase String que permite
         *      de extraer una subcadena desde un punto inicial hasta un punto
         *      final.
         */
        for (int i = 0; i < palabra1.length(); i++) {
            for (int x = 0; x < palabra2.length(); x++) { 
                if (palabra1.charAt(i) == palabra2.charAt (x)){
                    System.out.println( palabra2.substring(x, x+1)) ;
                }
            }    
        }
    }    
}

