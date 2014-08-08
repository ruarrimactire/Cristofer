/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circulo;

import figuras.*;

/**
 *
 * @author Risto
 */
public class testCirculo {

        /**
     * @param args the command line arguments
     */
    public static void main2(String[] args) {
        // TODO code application logic here
        // Declaracion de tres objetos Circulo.
        Circulo c1, c2, c3;
        // Inicializacion de los tres objetos Circulo.
        c1 = new Circulo("azul", 7.0);
        c2 = new Circulo("verde", 15.0);
        c3 = new Circulo("rojo", 19.0);
        
        System.out.println("El circulo " + c1.getColor() + " tiene un radio de: " + c1.getRadio() + " y un area = " + c1.area());
        System.out.println("El circulo " + c2.getColor() + " tiene un radio de: " + c2.getRadio() + " y un area = " + c2.area());
        System.out.println("El circulo " + c3.getColor() + " tiene un radio de: " + c3.getRadio() + " y un area = " + c3.area());
        // Destruccion de los tres objetos Circulo.
        c1 = null;
        c2 = null;
        c3 = null;
        
        // System.runFinalizersOnExit(true);
        System.out.println("numObjetos = " + Circulo.numObjetos());
        
        System.gc(); // Esta instruccion fuerza al recolector de basura y lo que hace es llamar al metodo
        // finalize para cada uno de los bojetos marcasdos como null.
        // Despues de forar el recolector de basura el valor de numObjetos deveria ser diferente.

        System.runFinalization();
        
        System.out.println("numObjetos = " + Circulo.numObjetos());
        
    }
}