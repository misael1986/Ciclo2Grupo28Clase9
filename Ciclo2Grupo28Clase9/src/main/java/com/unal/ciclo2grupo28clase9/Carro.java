package com.unal.ciclo2grupo28clase9;

/**
 *
 * @author Usuario
 */
public class Carro {

    public String marca;
    public int modelo;
    public double cilindraje;
    public String color;
    public String placa;
    public String cajaCambios;

    public String tipo;

    public int valor;
    protected int nroAccidentes;

    public int nroLote;

    private String VIN;
    

    public Carro() {
    }

    public Carro(String marca, int modelo, double cilindraje, String color, String placa, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.color = color;
        this.placa = placa;
        this.tipo = tipo;
    }

    public double calcularImpuesto() {
        double valorImp;
        if (this.tipo.equals("Sedan")) {
            valorImp = this.valor * 0.015;
        } else if (this.tipo.equals("Campero")) {
            valorImp = this.valor * 0.025;
        } else {
            valorImp = this.valor * 0.035;
        }
        return valorImp;
    }

    public void imprimirImpuesto() {
        System.out.println("Marca: " + this.marca
                + "\nModelo: " + this.modelo
                + "\nTipo: " + this.tipo
                + "\nValor comercial: " + this.valor);
        System.out.println(this.calcularImpuesto());

    }

}
