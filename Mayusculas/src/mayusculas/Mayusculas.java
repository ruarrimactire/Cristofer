/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mayusculas;

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
        
        String [] letras = new String [20];
        for (int i = 0; i<20; i++){
            letras[i] = new String();
        }
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
                while (i< nombre.length() && nombre.charAt(i) != ' ' && 
                        nombre.charAt(i) != '\t' ){
                    letras[j] += nombre.charAt(i);
                    i++;
                }
                j++;
            }
        }
        
        System.out.println("dimension del array letras: " + letras.length);
        System.out.println("celdas rellenadas del array letras: " + j);
        
        for (int i = 0; i < j; i++ ){
            System.out.print( letras[i].substring(0,1).toUpperCase() +
                    letras[i].substring(1).toLowerCase() + " " );
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
