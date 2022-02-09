/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.col.ej.pkg1.Perros.Serviciosperros;

import guia.col.ej.pkg1.Perros.Perros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Serviciosperros {
    
    private Scanner leer = new Scanner(System.in);
    private ArrayList<String> perros; 

    public Serviciosperros() {
        this.perros = new ArrayList();
    }
    
    
    public void crearMascota () {
       // System.out.println("Ingrese el nombre del perro");
        String nombre = "perro";
        System.out.println("Ingrese la raza");
        String raza = leer.next();
       // System.out.println("Ingrese la edad");
        int edad = 5;
        
       String razaas =raza;
       perros.add(razaas);
    }
    
    public void guardarRazas(){
        int i = 2;
        
        while ( i > 1){
            
            crearMascota();
            System.out.println("desea agregar otra raza? 2 si - 1 salir");
            i = leer.nextInt();
 
        }
  
    }
    
    public void mostrarPerrolista(){
        System.out.println("Las razas actuales de los perros son");
        for (String aux : perros) {
            
            System.out.println(aux); 
            
        }
        
        System.out.println("cantidad = " + perros.size());
        
    }

    public void eliminar(){
        
        for (int i = 0 ; i < perros.size(); i ++){
            
          String r = perros.get(i);
          
          System.out.println("ingrese la raza a buscar");
          
          
          if (r.equals(leer.nextLine())){
              perros.remove(r);
              System.out.println("raza eliminada");
          } else {
              System.out.println("La raza buscada no se encontro");
          }
            
        }
        
    }

    
}
