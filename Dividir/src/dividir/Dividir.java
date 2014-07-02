/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dividir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Risto
 */
public class Dividir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double x = 0;
        double z = 0;

        System.out.println ("Por favor, introduce el primer numero.");
        x = leerDouble();

        System.out.println ("Por favor, introduce el segundo numero.");
        z = leerDouble();

        System.out.println ("A continuación se muestra el resultado de la division "+(x/z) );
    }
  
    public static double leerDouble () {
        double x = 0;
        String numero = new String ();
        numero = leerLinea();
        while(!isDoubleNumber(numero)) {
            System.out.println ("Por favor, vuelve a intentarlo");
            numero = leerLinea();
        }
        x = Double.parseDouble(numero);
        return x;
    }
    
    public static String leerLinea () {
        String numero = new String();
        try {
                BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
                numero = leer.readLine();
            } catch (IOException e) {}
        return numero;
    }
    
    public static boolean isDoubleNumber(String numero) {

        try {
            Double.parseDouble(numero);
            return true;
            }
        catch(Exception e){return false;}

    }
    
}
