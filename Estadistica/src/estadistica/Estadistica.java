/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estadistica;

import usoComun.*;

/**
 *
 * @author Risto
 */
public class Estadistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        while(1 == 1){
            int opcion;
            do{
                System.out.println("1. Introducir datos.");
                System.out.println("2. Calcular media.");
                System.out.println("3. Calcular suma.");
                System.out.println("4. Calcular desviación estandar.");
                System.out.println("5. Imprimir lista de datos.");
                System.out.println("0. Salir del programa.");
                opcion = (int)usoComun.leerDouble();
            }while(opcion<=5 && opcion >= 0);
            
            /**
             * switch se usa para establecer las opciones del menu.
             * Cada opción del menu se debe declarar en un case y un break.
             * Por último la opción de salida se declara simplemente entre un
             * case y return.
             */
            switch (opcion){
                case 1:
                    
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 0:
                    return;

            }
        }
    }
    
}
