/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circulo;

/**
 *
 * @author Risto
 */
public class Circulo {
    /** 
    * numObjetos es una variable de clase, su valor sera igual en todos los objetos.
    * Este valor se podra modificar desde los metodos del programa, cada vez que se
    * modifique se modificara en todos los metodos en los que aparezca.
    */
    static int numObjetos = 0;
    // color y radio son variables de instancia, su valor puede ser diferente en
    // las varias instancias/objetos declarados.
    String color;
    double radio;
    // Esta es una constante al ser declarada como "final".
    final static double PI = 3.14159265D;
    final static String colorDefault = "verde";
    final static double radioDefault = 5.0D;
    
    // Constructor vacio.
    public Circulo(){
        this(colorDefault, radioDefault);
    }
    
    public Circulo(String color){
        this(color, radioDefault);
    }
    
    public Circulo(double radio){
        this(colorDefault, radio);
    }
    
    public Circulo (String color, double radio){
        this.color = color;
        if (radio >= 0){
            this.radio = radio;
            numObjetos++;
        }
        System.out.println("Objetos actualmente declarados = " + numObjetos);
    }
    
    public static int numObjetos(){
        
        return numObjetos;
    }
    
    public void finalize(){
        numObjetos--;
        System.out.println("Objetos actualmente declarados = " + numObjetos);
    }
    
    public double area(){
        return (PI*radio*radio);
    }
    
    public boolean equals(Object otro){
        return (
            this.radio == ((Circulo)otro).radio // convierte el objeto otro a Circulo, ya que al principio no sabemos que tipo de objeto es otro.
                &&
            this.color == ((Circulo)otro).color // convierte el objeto otro a Circulo, ya que al principio no sabemos que tipo de objeto es otro.
            );
    }
    
}
