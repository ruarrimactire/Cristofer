/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repeticiones;
import usoComun.usoComun;
/**
 *
 * @author Risto
 */
public class Repeticiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = new String();
        System.out.println("Por favor introduce tu nombre.");
        nombre = usoComun.leerLinea();
        
        int repeticiones = 0;
        System.out.println("Por favor introduce el numero de veces que quieres que se repita tu nombre.");
        repeticiones = ((int)usoComun.leerDouble());
        
            
        
        System.out.println(nombre);
    }
    
}
