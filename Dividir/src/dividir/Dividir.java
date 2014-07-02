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
        
        String numero = new String();
        double x = 0;
        double z = 0;

        System.out.println ("Por favor, introduce el primer numero.");
        numero = leerDouble();
        x = Double.parseDouble(numero);

        System.out.println ("Por favor, introduce el segundo numero.");
        numero = leerDouble();
        z = Double.parseDouble(numero);

        System.out.println ("A continuación se muestra el resultado de la division "+(x/z) );
    }
  
    public static String leerDouble () {
        String numero = new String ();
        numero = leerLinea();
        while(!isDoubleNumber(numero)) {
            System.out.println ("Por favor, vuelve a intentarlo");
            numero = leerLinea();
        }
        return numero;
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
