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
    protected int lado1;
    protected int lado2;
    protected int lado3;
    protected final static int lado1Default = 5;
    protected final static int lado2Default = 6;
    protected final static int lado3Default = 6;
            
    public Triangulo(){
        this(lado1Default, lado2Default, lado3Default, colorDefault);
    }
    
    public Triangulo (String color){
        this(lado1Default, lado2Default, lado3Default, color);
    }
    
    public Triangulo (int lado){
        this(lado, lado, lado, colorDefault);
    }

    public Triangulo(int lado1, int lado2, int lado3, String color){
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
    
    public int[] getLados(){
        int[] lados = {lado1,lado2,lado3}; // Esta manera de inicializar datos solo es valida para los arrays.
        return lados;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean equals(Object otro){
    int[] lados = {lado1, lado2, lado3};
    return (
        lados.equals(((Triangulo)otro).getLados())  // convierte el objeto otro a Triangulo, ya que al principio no sabemos que tipo de objeto es otro.
            &&
        this.color == ((Triangulo)otro).color // convierte el objeto otro a Triangulo, ya que al principio no sabemos que tipo de objeto es otro.
        );
    }
}