/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package figuras;

/**
 *
 * @author Risto
 */
public class Circulo extends Fig2D {
    /** 
    * numObjetos es una variable de clase, su valor sera igual en todos los objetos.
    * Este valor se podra modificar desde los metodos del programa, cada vez que se
    * modifique se modificara en todos los metodos en los que aparezca.
    */
    protected static int numCirculos = 0;
    // radio es una variable de instancia, su valor puede ser diferente en
    // las varias instancias/objetos declarados.
    protected double radio;
    // Esta es una constante al ser declarada como "final".
    final static double PI = 3.14159265D;
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
            numCirculos++;
        }
//        System.out.println("Objetos actualmente declarados = " + numObjetos);
    }
    
    public static int numObjetos(){        
        return numCirculos;
    }
    
    public void finalize(){
        numObjetos--;
        numCirculos--;
        System.out.println("Objetos actualmente declarados = " + numObjetos);
        System.out.println("Circulos actualmente declarados = " + numCirculos);
    }
    
    public double area(){
        return (PI*radio*radio);
    }
    
    public boolean equals(Object comparacion){
       // Si el objeto es nulo return dara false y se cierra el metodo.
       if (comparacion == null) return false;
       // Si comparacion no es una instancia de lista se cierra el metodo y devulve false.
       if (!(comparacion instanceof Circulo)) return false;
       // se compara si son el mismo objeto, y en tal caso devuelve true.
       if (this == comparacion) return true;

       // para comparar el contenido primero hay que convertir los objetos de manera
       // que el toString vaya a crear cadenas de texto que sean comparables.
       Circulo otro = (Circulo) comparacion;
       if (this.radio == otro.radio && 
               this.color == otro.color)
           return true;
       else return false;
       /*
       todo esto es equivalente a:
       return (this.radio == otro.radio && this.color == otro.color);
       */
    }
    
    /*
    Sobreescribimos el metodo toString heredado de object.
    */
    public String toString() {
        String s = "Esto es un Circulo de radio: ";
        s += "r= " + radio + "y color " + color;
        return s;
    }
        
    public double getRadio(){       
        return radio;
    }    
    public String getColor(){       
        return color;
    }    
}
