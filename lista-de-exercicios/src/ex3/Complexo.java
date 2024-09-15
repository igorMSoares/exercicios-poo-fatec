package ex3;

public class Complexo {
    private double a, b;

    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double a() {
        return a;
    }

    public double b() {
        return b;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(a + c.a(), b + c.b());
    }

    public Complexo multiplica(Complexo c) {
        double a1 = a * c.a() - b * c.b();
        double b1 = a * c.b() + b * c.a();

        return new Complexo(a1, b1);
    }

    public String toString() {
        return String.format("%.2f + %.2fi\n", a, b);
    }

    public double modulo() {
        return Math.sqrt((a * a + b * b));
    }

    public double argumentoPrincipal() {
        return 1 / Math.tan(b / a);
    }
}
