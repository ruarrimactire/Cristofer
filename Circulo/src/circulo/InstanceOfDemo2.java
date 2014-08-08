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
class InstanceOfDemo2 {
    public static void main (String[] args) {
        int contTriangulos, contCirculos, contNulos;
        Fig2D[] lista; 
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
        
        lista = new Fig2D[8];
        lista [0] = t1; //Asignamos un objeto triangulo
        lista [1] = t2; //Asignamos un objeto triangulo
        lista [2] = t3; //Asignamos un objeto triangulo
        lista [3] = t4; //Asignamos un objeto nulo
        lista [4] = c1; //Asignamos un objeto circulo
        lista [5] = c2; //Asignamos un objeto circulo
        lista [6] = c3; //Asignamos un objeto circulo
        lista [7] = c4; //Asignamos un objeto nulo
        // El ooperador instanceof daria error si se intenta comparar dos objetos que no son compatibles.
        // Para que no de error se pueden añadir varios objetos a un array de objetos que pertenecen a la superclase de todos los objetos.
        // La superclase, ya sea de triangulos o de circulos es la de Fig2D, por eso a un array de Fig2D se podran añadir tanto Triangulos como Circulos.
        // Mostramos y contamos los objetos de la ista
        contTriangulos = contCirculos = contNulos = 0;
        for (int i = 0; i < lista.length; i++){
            System.out.println("Objeto " + i + " = " + lista[i]);
            if(lista[i] instanceof Triangulo) {
                contTriangulos++;
            } 
            else if (lista[i] instanceof Circulo){
                contCirculos++;
            } else {
                contNulos++;
            }
        }
        System.out.println("Total " + contTriangulos + " triangulos, " + contCirculos + " Circulos, y " + contNulos + " Nulos.");
        System.out.println("Total " + Triangulo.numObjetos() + " triangulos, " + Circulo.numObjetos() + " Circulos, y " + Fig2D.numObjetos() + " Totales.");
        
    }
}
