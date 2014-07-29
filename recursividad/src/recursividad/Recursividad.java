/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursividad;

import usoComun.usoComun;
import usoComun.numera;

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
        String frase;
        String palabra;
        
        System.out.println("Por favor, introduzca una frase.");
        frase = usoComun.leerLinea();
        System.out.println("Por favor, la palabra que desea comprobar.");
        palabra = usoComun.leerLinea();
        
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();
        
        System.out.println("La palabra '" + palabra + "' Está incluida en '" + frase + "' " + numera.numera(frase, palabra) + " veces.");
    } 
}
