public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo( int base, int altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double determinarPerimetro() {
        return 2*(base * altura);
    }
}
