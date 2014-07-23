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
   
   lista(int dim){
       letras = new char [dim];
       posicion = new int [dim];
       dimension = dim;
   }
   
   lista(String frase){
       letras = new char [frase.length()];
       posicion = new int [frase.length()];
       dimension = frase.length();
       
       for (int i = 0; i < frase.length(); i++){
           letras[i] = frase.charAt(i);
           posicion[i] = i+1;
       }
       
   }
   
   public lista remove(int columna){
       lista nueva = new lista(dimension-1);
       
       for (int i = 0; i < columna; i++){
           nueva.letras[i] = letras[i];
           nueva.posicion[i] = posicion[i];
       }
       
       for(int i = columna+1; i < dimension; i++){
           nueva.letras[i-1] = letras[i];
           nueva.posicion[i-1] = posicion[i];
       }
       
       return nueva;
   }
   
    public String getPosiciones(){
        String temp = new String();
        for (int i = 0; i < dimension; i++){
            /** Este String.format(); modifica la cadena "%%0%dd" de manera
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
            String result = String.format(format, posicion[i]);
            temp += result + " ";       
        }
        return temp;
    }
   
    public String getString(){
        String temp = new String();
        for (int i = 0; i < dimension; i++){
            temp += letras[i];
        }
        return temp;
    }

    public String getString2(){
        String temp = new String();
        for (int i = 0; i < dimension; i++){
            temp += letras[i];
            for(int j = 0 ; j < 3; j++){
                temp += " ";
            }
        }
        return temp;
    }

}
