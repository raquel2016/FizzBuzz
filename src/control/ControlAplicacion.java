
package control;

import modelo.Modelo;

/**
 *
 * @author Raquel Lugo
 */
public class ControlAplicacion {
    public ControlAplicacion(Modelo nuevosDatos) {
        datos = nuevosDatos;
    }

    public ControlAplicacion() {
        this(new Modelo());
    }
    
    public void jugar(){
      datos.fizzBuzz();
    }
    
    private Modelo datos;
}
