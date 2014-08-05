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
            
    public Triangulo(){
        this(lado1Default, lado2Default, lado2Default, colorDefault);
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
        System.out.println("Circulos actualmente declarados = " + numTriangulos);
    }
    

}