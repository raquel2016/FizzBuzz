/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import control.ControlAplicacion;
import vista.Ventana;

/**
 *
 * @author Raquel Lugo
 */
public class FizzBuzz {

    public static void main(String[] args) {
       FizzBuzz aplicacion = new FizzBuzz();
         
        ControlAplicacion gestorPrincipal
                = new ControlAplicacion();
        Ventana vistaPrincipal
                = new Ventana( gestorPrincipal);
        vistaPrincipal.jugar();
    }
    
    
}
