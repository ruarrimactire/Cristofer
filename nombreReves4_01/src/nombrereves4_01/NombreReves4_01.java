
package nombrereves4_01;
import java.io.*;

public class NombreReves4_01 
{
    public static void main(String[] args)
    {
        String nombre = "";
        String nombreReves = "";
        
        System.out.println("Escriba su nombre");
        try {
                BufferedReader entrada =
                new BufferedReader(new InputStreamReader(System.in)); nombre = entrada.readLine();
            }
            catch (IOException e) {}
        
        for(int i=(nombre.length()-1); i>=0; i--)
        {
             nombreReves += nombre.charAt(i);
        }
        
        System.out.println("su nombre al reves es: " + nombreReves);
        
    }
}
