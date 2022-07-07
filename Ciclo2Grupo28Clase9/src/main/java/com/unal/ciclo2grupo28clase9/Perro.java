package com.unal.ciclo2grupo28clase9;

/**
 *
 * @author Usuario
 */
public class Perro {
// Atributos

    public int edad;
    public String nombre;
    public String colorOjos;
    // Constructor

    public Perro(int edad, String nombre, String colorOjos) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorOjos = colorOjos;
    }
    // Metodos

    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre);
    }

    public void quienEsMayor(Perro otroPerro) {
        if (this.edad > otroPerro.edad) {
            System.out.println("Soy mayor que" + otroPerro.nombre);
        } else if (this.edad == otroPerro.edad) {
            System.out.println("Tenemos la misma edad");
        } else {
            System.out.println(otroPerro.nombre + " es mayor que yo");
        }
    }
}
