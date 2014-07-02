/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nombre;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Filippo
 */
public class nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        String nombre = new String();
//        
//        System.out.println("Escribe tu nombre");
//        try {
//                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); 
//                nombre = entrada.readLine();
//            }
//        catch (IOException e) {}
//        System.out.println("Hola "+ nombre + "!");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        
//          System.out.println("Escribe un número");
//          int entero = sc.nextInt();
        String cadena;
        do{
            System.out.println("Escribe un número");
            cadena = sc.nextLine();
        }while(!isIntNumber(cadena));
        int entero = Integer.parseInt(cadena);

        System.out.println("Hola "+ nombre + " " + entero + "!");
    }
    
    public static boolean isIntNumber(String num){
        try{
            Integer.parseInt(num);
            return true;
        }catch(Exception e){return false;}
    }
}
