/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objectdemo;

import figuras.Circulo;
import figuras.Triangulo;

/**
 *
 * @author Risto
 */
public class ObjectDemo {
    public static void main ( String args []) {
        Circulo c1 , c2;
        Triangulo t1 , t2;

        // Creamos dos circulos con identicos valores
        c1 = new Circulo (20.0) ;
        c2 = new Circulo (20.0) ;

        // Mostramos y comparamos los circulos
        System .out. println ("El objeto c1 es: " + c1); // c1. toString ()
        System .out. println ("El objeto c2 es: " + c2); // c2. toString ()
        System .out. println (" Comparacion con equals (): " + c1. equals (c2));
        System .out. println (" Comparacion con oper . ==: " + (c1 == c2));

        // Creamos dos triangulos con identicos valores
        t1 = new Triangulo (10.0);
        t2 = new Triangulo (10.0);

        // Mostramos y comparamos los triangulos
        System .out. println ("El objeto t1 es: " + t1); // t1. toString ()
        System .out. println ("El objeto t2 es: " + t2); // t2. toString ()
        System .out. println (" Comparacion con equals (): " + t1. equals (t2));
        System .out. println (" Comparacion con oper . ==: " + (t1 == t2));
    }
}
