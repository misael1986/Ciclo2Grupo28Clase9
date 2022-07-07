package com.unal.ciclo2grupo28clase9;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase9 {

    public static void main(String[] args) {

        Pelicula p1 = new Pelicula();
        p1.titulo = "Armados y Peligrosos";
        p1.anho = 2012;
        p1.genero = "Accion";
        p1.duracion = 120;

        Pelicula p2 = new Pelicula();
        p2.titulo = "La noche de Demonio";
        p2.genero = "Terror";
        p2.duracion = 90;
        p2.anho = 2010;

        Pelicula p3 = new Pelicula();
        p3.titulo = "Pain & Gain";
        p3.anho = 2012;
        p3.genero = "Accion";
        p3.duracion = 130;

        p1.verPelicula();
        p3.verPelicula();
        p2.verPelicula();

        Pelicula p4 = new Pelicula("Ouija", 2014);
        p4.verPelicula();
        Pelicula p5 = new Pelicula();
        // p5.llenarPelicula();
        // p5.verPelicula();

        Carro logan = new Carro();
        logan.marca = "Renault";
        logan.modelo = 2012;
        logan.valor = 27000000;
        logan.tipo = "Sedan";

        Carro c1 = new Carro();
        c1.modelo = 2022;
        Perro miPerro1 = new Perro(5, "Toby", "Azul");
        Perro miPerro2 = new Perro(7, "Vainilla", "Negro");
        Perro miPerro3 = new Perro(5, "Bony", "Amarillo");
        System.out.println(miPerro1.edad);
        miPerro1.saludar();
        miPerro1.quienEsMayor(miPerro2);

        /*
        System.out.println("Marca: " + logan.marca
                + "\nModelo: " + logan.modelo
                + "\nTipo: " + logan.tipo
                + "\nValor comercial: " + logan.valor);
        System.out.println(logan.calcularImpuesto());
         */
        logan.imprimirImpuesto();

    }
}
