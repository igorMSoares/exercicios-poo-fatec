package ex7;

public class Eq2Grau {
    private double a, b, c;
    private double delta = Double.NaN,
            x1 = Double.NaN,
            x2 = Double.NaN;

    public Eq2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        if (Double.isNaN(delta)) {
            delta = (b * b) - (4 * a * c);
        }

        return delta;
    }

    public double raiz1() {
        if (delta() < 0) {
            return Double.NaN;
        }

        if (Double.isNaN(x1)) {
            x1 = ((-1 * b) + Math.sqrt(delta())) / 2 * a;
        }

        return x1;
    }

    public double raiz2() {
        if (delta() < 0) {
            return Double.NaN;
        }

        if (Double.isNaN(x2)) {
            x2 = ((-1 * b) - Math.sqrt(delta())) / 2 * a;
        }

        return x2;
    }

    public String toString() {
        return String.format("y = %.2fx² + %.2fx + %.2f\n", a, b, c);
    }
}
