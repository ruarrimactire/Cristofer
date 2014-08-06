/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursividad;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.SortedMap;
import usoComun.numera;
import usoComun.usoComun;

/**
 *
 * @author Risto
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        String palabra;
        
        System.out.println("Por favor, introduzca una frase.");
        frase = usoComun.leerLinea();
        System.out.println("Por favor, la palabra que desea comprobar.");
        palabra = usoComun.leerLinea();
        
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();
        
        String out = "La palabra '" 
            + palabra 
            + "' Esta incluida en '" 
            + frase 
            + "' " 
            + numera.numera(frase, palabra) 
            + " veces.\n\n";
        
        System.out.println(out);
        
        SortedMap mappa = Charset.availableCharsets();
        CharSequence out2 = (CharSequence)mappa.toString().replace(",", "\n") + "\n";
        
        String out3 = numera.getResult();

        Path file2 = Paths.get("./secondo.txt");
        Charset charset = Charset.forName("UTF-16");

        try (BufferedWriter writer = Files.newBufferedWriter(file2, charset)) {
            writer.write(out, 0, out.length());
//            writer.append(out2, 0, out2.length());
            writer.append(out3, 0, out3.length());
            writer.close();
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        
    }
}
