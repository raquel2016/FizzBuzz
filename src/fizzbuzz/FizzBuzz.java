
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
            aplicacion.mostrar();
    }
    
     public void mostrar(){
        ControlAplicacion gestorPrincipal
                = new ControlAplicacion();
        Ventana vistaPrincipal
                = new Ventana( gestorPrincipal);
        vistaPrincipal.jugar();
    }
    
    
}
