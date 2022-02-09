/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.col.ej.pkg1.Perros;

/**
 *
 * @author Usuario
 */
public class Perros {
    
      private String nombre;
      private String raza;
      private int edad;

    public Perros() {
    }

    public Perros(String raza) {
        this.raza = raza;
    }
    
    

    public Perros(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perros{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + '}';
    }
      
      
    
}
