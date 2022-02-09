/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.col.ej.pkg1;

import guia.col.ej.pkg1.Perros.Serviciosperros.Serviciosperros;

/**
 *
 * @author Usuario
 */
public class GuiaCOLEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Serviciosperros llenarlista = new Serviciosperros();
        
       // llenarlista.crearMascota();
        
        llenarlista.guardarRazas();
        llenarlista.mostrarPerrolista();
        llenarlista.eliminar();
        llenarlista.mostrarPerrolista();
    }
    
}
