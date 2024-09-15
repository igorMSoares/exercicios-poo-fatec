package ex5;

public class Equilatero {
    private double lado, perimetro, area;

    public Equilatero(double lado) {
        this.lado = Math.max(lado, 0);
        perimetro = -1;
        area = -1;
    }

    public double lado() {
        return this.lado;
    }

    public double perimetro() {
        if (perimetro == -1) {
            calcPerimetro();
        }

        return this.perimetro;
    }

    public double area() {
        if (area == -1) {
            calcArea();
        }

        return this.area;
    }

    private void calcArea() {
        area = (lado * Math.sqrt(3)) / 2;
    }

    private void calcPerimetro() {
        perimetro = 3 * lado;
    }
}
