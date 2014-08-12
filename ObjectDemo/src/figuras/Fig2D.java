/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package figuras;

/**
 *
 * @author Risto
 */
public class Fig2D {

    protected static int numObjetos = 0;
    protected String color;
    final protected static String colorDefault = "verde";

    public static int numObjetos(){        
        return numObjetos;
    }

    public String getColor(){       
        return color;
    }

}
