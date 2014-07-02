/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package letrascomunes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Risto
 */
public class usoComun {
    
    // Comprueba que lo introducido sea un valor válido y de no ser así envía un mensaje de error.
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
    
    // Metodo que pide al usuario introducir datos.
    public static String leerLinea () {
        String numero = new String();
        try {
                BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
                numero = leer.readLine();
            } catch (IOException e) {}
        return numero;
    }
    
    // Metodo que comprueba que lo introducido sea un numero.
    public static boolean isDoubleNumber(String numero) {

        try {
            Double.parseDouble(numero);
            return true;
            }
        catch(Exception e){return false;}

    }

}
