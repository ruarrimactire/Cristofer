/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estadistica;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
        List<Float> numeros = new ArrayList<Float>();
        
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
            }while( !(opcion <= 5 && opcion >= 0) );
            
            // System.out.println("Opción " + opcion);
            
            /**
             * switch se usa para establecer las opciones del menu.
             * Cada opción del menu se debe declarar en un case y un break.
             * Por último la opción de salida se declara simplemente entre un
             * case y return.
             */
            switch (opcion){
                case 1:
                    System.out.println("Introduzca un número");
                    numeros.add((float)usoComun.leerDouble());
                    break;

                case 2:
                    {float resultado = 0;
                        for (int i = 0; i < numeros.size(); i++) {
                            resultado += numeros.get(i);
                        }
                        System.out.println("A continuacion se mostrara la media \n" + resultado/numeros.size());
                    }   
                    break;

                case 3:
                    {float resultado = 0;
                        for (int i = 0; i < numeros.size(); i++) {
                            resultado += numeros.get(i);
                        }
                        System.out.println("A continuacion se mostrara la suma \n" + resultado);
                    }
                    break;

                case 4:
                    {float resultado = 0;
                        for (int i = 0; i < numeros.size(); i++) {
                            resultado += numeros.get(i);
                        }
                        resultado /= numeros.size();
                        float resultado2 = 0;
                        for (int i = 0; i < numeros.size(); i++){
                            resultado2 += Math.pow(resultado-numeros.get(i),2);
                        }
                        System.out.println("A continuacion se mostrara la desviacion estandar \n"
                                + Math.sqrt(resultado2/numeros.size()) );
                    }    
                    break;

                case 5:
                    {float resultado = 0;
                        for (int i = 0; i < numeros.size(); i++) {
                            System.out.println( numeros.get(i));
                        }
                    }
                    break;

                case 0:
                    return;

            }
            
            System.out.println("pulse envio ...");
            try {
                System.in.read();
            } catch (IOException ex) {
                Logger.getLogger(Estadistica.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print("\u001b[2J");
            System.out.flush();
            
        }
    }
    
    
}
