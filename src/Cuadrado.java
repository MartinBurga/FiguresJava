public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        int area;
        area= lado*lado;
        return area;
    }

    @Override
    public double determinarPerimetro() {
        int perimetro;
        perimetro = lado+lado+lado+lado;
        return perimetro;
    }

}