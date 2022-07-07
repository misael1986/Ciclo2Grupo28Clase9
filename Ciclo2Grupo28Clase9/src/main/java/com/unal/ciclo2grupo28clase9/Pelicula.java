package com.unal.ciclo2grupo28clase9;

import java.sql.Time;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pelicula {//NOMBRE
    
    //ATRIBUTOS
    String titulo;
    int anho;
    String genero;
    int duracion;
    
    public Pelicula(){
    }
    
    public Pelicula(String nom, int anio){
        this.titulo=nom;
        this.anho=anio;
    }

    public Pelicula(String titulo, int anho, String genero, int duracion) {
        this.titulo = titulo;
        this.anho = anho;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    
    //METODOS
    public void verPelicula(){
        System.out.println("Reproduciendo: "+this.titulo);
    }
    
    public void llenarPelicula(){
    
        Scanner sc= new Scanner(System.in);
        System.out.println("Nombre de la pelicula:");
        this.titulo=sc.nextLine();
        System.out.println("Anio de Salida de Pelicula:");
        this.anho=Integer.parseInt(sc.nextLine());
        System.out.println("Genero de la pelicula:");
        this.genero= sc.nextLine();
        System.out.println("Duracion en minutos:");
        this.duracion=Integer.parseInt(sc.nextLine());

    
    }
    
}
