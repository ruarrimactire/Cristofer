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
        lista referencia2 = new lista(referencia);
        return numera(referencia2, comparacion, 0);
        
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
    static int numera( lista referencia, String comparacion, int n ) {
        
        if (referencia.dimension() != comparacion.length()) {
            
            int count = 0;
            for (int i = n ; i < referencia.dimension() ; i++) {
                lista nueva = referencia.remove(i);
                // la funcion se llama a si misma
                count += numera( nueva, comparacion, i);
            }
            return count;
        }
        else {
            if ( comparacion.equals(referencia.getString(0)) ){
                System.out.println( referencia.getString(5) );
                System.out.println( referencia.getPosiciones(5) );
                System.out.println( "-----" );
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
