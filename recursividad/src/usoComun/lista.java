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
public class lista {
    
    private char [] letras;
    private int [] posicion;
    private int dimension;
    
   // Normalmente a esto se le llaman getters de la palabra get
    public int dimension(){
       return dimension;
   }
    // Este metodo inicializa las variables en una lista vacia.
   lista(int dim){
       letras = new char [dim];
       posicion = new int [dim];
       dimension = dim;
   }
   
    // Este metodo inicializa una lista con la frase que se introduce.
   lista(String frase){
       letras = new char [frase.length()];
       posicion = new int [frase.length()];
       dimension = frase.length();
       
       for (int i = 0; i < frase.length(); i++){
           letras[i] = frase.charAt(i);
           posicion[i] = i+1;
       }   
   }
    // this.XXX se refiere al valor original de XXX contenido en el objeto original.
    // este metodo recorta la lista desde una posicion de inicio hasta una posicion de fin.
    public lista sublista (int inicio, int fin) {
        lista nueva = new lista(fin - inicio);
       // inicio y fin seran proporcionados por el segmento de programa que llame al metodo sublista.
        for (int i = inicio; i < fin; i++ ){
             nueva.letras[i-inicio] = this.letras[i];
             nueva.posicion[i-inicio] = this.posicion[i];
        }
        return nueva;
    }
    
    // sobrecarga del metodo sublista para generar un atajo.
    // comienza en inicio y sigue hasta fin usando el parametro dimension.
    public lista sublista (int inicio) {
        return this.sublista(inicio, this.dimension());
    }

    // Este metodo coge dos trozos de lista y los une.
    public lista add(lista paraAñadir) {
        lista nueva = new lista(this.dimension() + paraAñadir.dimension());
        // En este bucle se le añade a nueva el primer trozo de lista.
        for (int i = 0; i < this.dimension(); i++){
            nueva.letras[i] = this.letras[i];
            nueva.posicion[i] = this.posicion[i];
        }
        // En este bucle se le añade a nueva el segundo trozo de lista que se escribira
        // a continuacion del primer trozo ya añadido en el bucle anterior.
        for (int i = 0; i < paraAñadir.dimension(); i++){
            nueva.letras[i+this.dimension()] = paraAñadir.letras[i];
            nueva.posicion[i+this.dimension()] = paraAñadir.posicion[i];            
        }
        return nueva;
    }
    // Este metodo es el que se encarga de remover las letras y añadir el resultado
    // a la nueva lista.
   public lista remove(int columna){
       return this.sublista(0, columna).add(this.sublista(columna+1));
   }
   
   // Este metodo devuelve un String con los numeros de las posiciones formateados.
   // int separacion define cuantos caracteres minimos imprimir por columna.
    public String getPosiciones(int separacion){
        String temp = new String();
        for (int i = 0; i < dimension; i++){
            /** Este String.format(); modifica la cadena "%%0%dd" de manera
             * que vaya a sustituir [%%]0[%d]d con %02d
             */
            String format = String.format("%%-%dd", separacion);
            /** Para hacer que un numero sea imprimido con minimo dos
            * caracteres y que vaya rellenando de 0 a la izquierda, hay
            * que utilizar, el metodo String.format(); que tomara como
            * primer parametros la cadena "%02d"  y como segundo parametro
            * la variable original que contiene los numeros y devolvera un
            * String formateado de esta manera.
            * Poniendo un - en lugar del 0 en la cadena de parametros, el numero 
            * sera ajustado a la izquierda.
            * docs.oracle.com/javase/1.5.0/docs/api/java/util/Formatter.html#syntax
            */
            String result = String.format(format, posicion[i]);
            temp += result;       
        }
        return temp;
    }
   // Este metodo devuelve un String con el contenido de las letras.
   // int separacion define cuantos caracteres minimos imprimir por columna.
    public String getString(int separacion){
        String temp = new String();
        for (int i = 0; i < dimension; i++){
            temp += letras[i];
            for(int j = 0 ; j < separacion-1; j++){
                temp += " ";
            }
        }
        return temp;
    }
}
