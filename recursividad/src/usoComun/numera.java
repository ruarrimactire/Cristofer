/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usoComun;

/**
 *
 * @author Risto
 */
public class numera {
    
    /**
     * Este es un ejemplo de sobrecarga de metodo. Son dos metodos con un nombre
     * comun, con diferente numero de argumentos aceptados y con diferentes
     * trabajos que tienen que realizar.
     * 
     * @param referencia es un String que contiene la frase en la que hay que
     *                   buscar las combinaciones de palabras.
     * @param comparacion es un String que contiene la palabra que hay que comparar.
     * @return devuelve un entero con las conbinaciones posibles en referencia de la palabra comparacion.
     */
    public static int numera( String referencia, String comparacion ) {
        int [] removidas = new int[0];
        char [] remLetras = new char[0];
        
        return numera(referencia, comparacion, removidas, 0, remLetras);
        
    }

    /**
     * Este es un ejemplo de funcion recursiva, ya que en el cuerpo de la funcion
     * se va a llamar a si misma.
     * 
     * @param referencia
     * @param comparacion
     * @param removidas es un array de numeros que contiene las letras que se han quitado.
     * @param n es un entero que indica en que letra has empezado a quitar.
     * @param remLetras es un array de char que contiene las letras que se han quitado.
     * @return
     */
    static int numera( String referencia, String comparacion, int[] removidas, int n, char[] remLetras ) {
        
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
                
                // la funcion se llama a si misma
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
                    /**Este String.format(); modifica la cadena "%%0%dd" de manera
                     * que vaya a sustituir [%%]0[%d]d con %02d
                     */
                    String format = String.format("%%0%dd", 2);
                    /** Para hacer que un numero sea imprimido con minimo dos
                    * caracteres y que vaya rellenando de 0 a la izquierda, hay
                    * que utilizar, el metodo String.format(); que tomara como
                    * primer parametros la cadena "%02d"  y como segundo parametro
                    * la variable original que contiene los numeros y devolvera un
                    * String formateado de esta manera.
                    * docs.oracle.com/javase/1.5.0/docs/api/java/util/Formatter.html#syntax
                    */
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
