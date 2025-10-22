package com.figuras;

import java.awt.event.PaintEvent;

public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(2);
        Rectangulo rectangulo = new Rectangulo(4, 5);
        Triangulo triangulo = new Triangulo(4,5,2,2,2);
        Circulo circulo = new Circulo(5);
        Figura pentagono = ExternalFigure.crearFigura("Pentagono", 4);

        cuadrado.mostrarFigura();
        rectangulo.mostrarFigura();
        triangulo.mostrarFigura();
        circulo.mostrarFigura();
        pentagono.mostrarFigura();

    }
}