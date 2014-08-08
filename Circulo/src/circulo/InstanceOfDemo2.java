/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circulo;

import figuras.*;
import java.util.ArrayList;

/**
 *
 * @author Risto
 */
class InstanceOfDemo2 {
    public static void main (String[] args) {
        int contTriangulos, contCirculos, contNulos;
        // Se declara un ArrayList en llugar de un array nomal ya que este se puede modificar.
        ArrayList<Fig2D> lista = new ArrayList<Fig2D>(); 
        Triangulo t1, t2, t3, t4;
        Circulo c1, c2, c3, c4;
        
        // Creamos 3 triangulo y 3 circulo
        t1 = new Triangulo();
        t2 = new Triangulo();
        t3 = new Triangulo();
        t4 = null; // no creado.
        c1 = new Circulo();
        c2 = new Circulo();
        c3 = new Circulo();
        c4 = null; // no creado.
       
        
        lista.add(t1); //Asignamos un objeto
        lista.add(t2); //Asignamos un objeto
        lista.add(t3); //Asignamos un objeto
        lista.add(t4); //Asignamos un objeto
        lista.add(c1); //Asignamos un objeto
        lista.add(c2); //Asignamos un objeto
        lista.add(c3); //Asignamos un objeto
        lista.add(c4); //Asignamos un objeto

        /**
         * El operador instanceof daria error si se intenta comparar dos objetos que no son compatibles.
         * Para que no de error se pueden añadir varios objetos a un array de
         * objetos que pertenecen a la superclase de todos los objetos.
         * La superclase, ya sea de triangulos o de circulos es la de Fig2D,
         * por eso a un array de Fig2D se podran añadir tanto Triangulos como Circulos.
         * Mostramos y contamos los objetos de la ista
        */
        contTriangulos = contCirculos = contNulos = 0;
        // ArrayList no tiene el metodo .length(), en su lugar se usa .size().
        for (int i = 0; i < lista.size(); i++){
            System.out.println("Objeto " + (i+1) + " = " + lista.get(i));
            if(lista.get(i) instanceof Triangulo) {
                contTriangulos++;
            } 
            else if (lista.get(i) instanceof Circulo){
                contCirculos++;
            } else {
                contNulos++;
            }
        }
        System.out.println("Total " + contTriangulos + " triangulos, " + contCirculos + " Circulos, y " + contNulos + " Nulos.");
        System.out.println("Total " + Triangulo.numObjetos() + " triangulos, " + Circulo.numObjetos() + " Circulos, y " + Fig2D.numObjetos() + " Totales.");
        
    }
}
