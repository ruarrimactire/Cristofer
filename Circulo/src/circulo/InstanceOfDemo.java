/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circulo;

import figuras.Circulo;
import figuras.Fig2D;
import figuras.Triangulo;

class InstanceofDemo {
    public static void main ( String [] args ) {
    Fig2D f = new Fig2D ();
    Triangulo t = new Triangulo ();
    Circulo c = new Circulo ();
    Circulo n = null ; // No creado
    
    System .out. println ("f instanceof Object    ? : " + (f instanceof Object    ));
    System .out. println ("f instanceof Fig2D     ? : " + (f instanceof Fig2D     ));
    System .out. println ("f instanceof Triangulo ? : " + (f instanceof Triangulo ));
    System .out. println ("f instanceof Circulo   ? : " + (f instanceof Circulo   ));
    
    System .out. println ("t instanceof Fig2D     ? : " + (t instanceof Fig2D     ));
    System .out. println ("t instanceof Triangulo ? : " + (t instanceof Triangulo ));
//    System .out. println ("t instanceof Circulo   ? : " + (t instanceof Circulo   ));
    System .out. println ("t instanceof Object    ? : " + (t instanceof Object    ));
    
    System .out. println ("c instanceof Object    ? : " + (c instanceof Object    ));
    System .out. println ("c instanceof Fig2D     ? : " + (c instanceof Fig2D     ));
//    System .out. println ("c instanceof Triangulo ? : " + (c instanceof Triangulo ));
    System .out. println ("c instanceof Circulo   ? : " + (c instanceof Circulo   ));
    
    System .out. println ("n instanceof Object    ? : " + (n instanceof Object    ));
    System .out. println ("n instanceof Fig2D     ? : " + (n instanceof Fig2D     ));
//    System .out. println ("n instanceof Triangulo ? : " + (n instanceof Triangulo ));
    System .out. println ("n instanceof Circulo   ? : " + (n instanceof Circulo   ));
    
    }
}