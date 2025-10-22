package com.figuras;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract double determinarPerimetro();

    public void mostrarFigura()
    {
        System.out.println("com.figuras.Figura: " + nombre);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + determinarPerimetro());
        System.out.println(" ");
    }

}