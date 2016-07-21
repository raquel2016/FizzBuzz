/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlAplicacion;

/**
 *
 * @author Raquel Lugo
 */
public class Ventana {
    
    public Ventana( ControlAplicacion nuevoGestor) {
        gestor = nuevoGestor;
    }
    
    public void jugar() { 
      gestor.jugar();
    }

    private final ControlAplicacion gestor;  
    
}
