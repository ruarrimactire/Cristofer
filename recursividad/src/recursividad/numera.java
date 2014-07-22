/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursividad;

/**
 *
 * @author Filippo
 */
public class numera {
        public static int numera( String referencia, String comparacion ) {
        lista ref = new lista(referencia);        
        return numera(ref, comparacion, 0 );        
    }

    /**
     *
     * @param referencia  frase en la cual hay que buscar
     * @param comparacion palabra que hay que buscar
     * @param n starting point initially set as 0, internally used
     * @return numero de veces que se encuentra una combinación de letras de "referencia" igual a "comparacion"
     */
    static int numera( lista referencia, String comparacion, int n ) {
        if (referencia.dimension() > comparacion.length()) {  
            int count = 0;
            for (int i = n ; i < referencia.dimension() ; i++) {
                count += numera( referencia.remove(i), comparacion, i );
            }
            return count;
        } else {
            if ( comparacion.equals(referencia.getString()) ) {
                System.out.println(referencia.getPositions());
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////

class lista {
    private char[] letras;
    private int[]  posicion;
    private int dimension;

    public int dimension(){
        return dimension;
    }
    
    lista(int dim){
        letras = new char[dim];
        posicion = new int[dim];
        dimension = dim;
    }

    lista(String frase){
        letras = new char[frase.length()];
        posicion = new int[frase.length()];
        dimension = frase.length();

        for(int i = 0; i < frase.length(); i++) {
            letras[i] = frase.charAt(i);
            posicion[i] = i+1;
        }
    }

    public lista subLista (int inicio, int fine) {
        lista nueva = new lista(fine-inicio+1);
        
        for(int i = inicio ; i < fine; i++){
            nueva.letras[i] = letras[i];
            nueva.posicion[i] = posicion[i];
        }

        return nueva;
    }
    
    public lista subLista (int inicio) {
        return subLista(inicio, dimension-1);
    }
    
    public lista add (lista addendum) {
        lista nueva = new lista(dimension+addendum.dimension);
        // implementare
        
        return nueva;
    }

    public lista remove (int element) {
        lista nueva = new lista(dimension-1);

        for(int i = 0; i < element; i++){
            nueva.letras [i] = letras[i];
            nueva.posicion[i] = posicion[i];
        }
        for(int i = element+1; i < dimension; i++){
            nueva.letras[i-1] = letras[i];
            nueva.posicion[i-1] = posicion[i];
        }
        
        return nueva;
    }

    public String getPositions () {
        String temp = new String();
            for (int k = 0 ; k < posicion.length ; k++) {
                String format = String.format("%%0%dd", 2);
                String result = String.format(format, posicion[k]);
                temp += result + " ";
            }
        return temp;
    }

    public String getString () {
        String temp = new String();
            for (int k = 0 ; k < letras.length ; k++) {
                temp += letras[k];
            }
        return temp;
    }
}
