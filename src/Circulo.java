
public class Circulo extends Figura{
    private int radio;

    public Circulo(int radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (radio*radio);
    }

    @Override
    public double determinarPerimetro() {
        return 2*Math.PI*radio;
    }
}
