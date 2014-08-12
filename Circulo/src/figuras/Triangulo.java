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
public class Triangulo extends Fig2D {
    
    protected static int numTriangulos = 0;
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected final static double lado1Default = 5.0;
    protected final static double lado2Default = 6.0;
    protected final static double lado3Default = 6.0;
            
    public Triangulo(){
        this(lado1Default, lado2Default, lado3Default, colorDefault);
    }
    
    public Triangulo (String color){
        this(lado1Default, lado2Default, lado3Default, color);
    }
    
    public Triangulo (double lado){
        this(lado, lado, lado, colorDefault);
    }

    public Triangulo(double lado1, double lado2, double lado3, String color){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.color = color;
        numObjetos ++;
        numTriangulos ++;
    }
    
    public static int numObjetos(){        
        return numTriangulos;
    }
    
    public void finalize(){
        numObjetos--;
        numTriangulos--;
        System.out.println("Objetos actualmente declarados = " + numObjetos);
        System.out.println("Triangulos actualmente declarados = " + numTriangulos);
    }
    
    public double area(){
        double semiPerimetro = (lado1 + lado2 + lado3 / 2);
        return (Math.sqrt(semiPerimetro) * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        // El metodo 'sqrt' de 'Math' (Math.sqrt()) se usa para hacer raices cuadradas.
    }
    
    public double[] getLados(){
        double[] lados = {lado1,lado2,lado3}; // Esta manera de inicializar datos solo es valida para los arrays.
        return lados;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean equals(Object comparacion){
       // Si el objeto es nulo return dara false y se cierra el metodo.
       if (comparacion == null) return false;
       // Si comparacion no es una instancia de lista se cierra el metodo y devulve false.
       if (!(comparacion instanceof Triangulo)) return false;
       // se compara si son el mismo objeto, y en tal caso devuelve true.
       if (this == comparacion) return true;

       // para comparar el contenido primero hay que convertir los objetos de manera
       // que el toString vaya a crear cadenas de texto que sean comparables.
       Triangulo otro = (Triangulo) comparacion;
       if (this.lado1 == otro.lado1 && 
               this.lado2 == otro.lado2 && 
               this.lado3 == otro.lado3 && 
               this.color == otro.color)
           return true;
       else return false;
       /*
       todo esto es equivalente a:
       return (this.lado1 == otro.lado1 && this.lado2 == otro.lado2 && this.lado3 == otro.lado3 && this.color == otro.color);
       */
    }
    
    /*
    Sobreescribimos el metodo toString heredado de object.
    */
    public String toString() {
        String s = "Esto es un Triangulo de lados: ";
        s += "a= " + lado1 + "b= " + lado2 + "c= " + lado3;
        return s;
    }
}