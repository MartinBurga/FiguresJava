public class Triangulo extends Figura{
    private int base;
    private int altura;
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo( int base, int altura, int lado1, int lado2, int lado3) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) * 0.5;
    }

    @Override
    public double determinarPerimetro() {
        return lado1+lado2+lado3;
    }
}
