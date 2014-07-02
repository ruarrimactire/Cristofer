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
        
        System.out.println(
                nombre.substring(0, 1).toUpperCase() +
                        nombre.substring(1).toLowerCase()
        );
       /**
        * toUpperCase es un metodo de la clase String, que cambia por mayusculas
        *       las letras de las posiciones indicadas.
        * toLowerCase es un metodo de la clase String, cambia a minusculas las 
        *       letras de las posiciones indicadas.
        */
    }
    
}
