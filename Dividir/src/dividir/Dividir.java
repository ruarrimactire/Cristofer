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
    
    System.out.println ("Por favor, introduce dos numeros.");
    
    try {
            BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
            x = Double.parseDouble (leer.readLine());
    } catch (IOException e) {}
    
    try {
            BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
            z = Double.parseDouble (leer.readLine());
    } catch (IOException e) {}
    
    System.out.println ("A continuación se muestra el resultado de la division "+(x/z) );
    }
    
}
