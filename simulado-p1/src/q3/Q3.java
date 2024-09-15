package q3;

public class Q3 {
    public static void main(String[] args) {
        double a = -1, b = 1, n = 0.33;
        Intervalo i = new Intervalo(a, b);

        try {
            n = Double.parseDouble(args[0]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println(">> Argumento inválido ou não informado.");
            System.out.printf(">> Utilizando valor default %.2f\n", n);
        }

        System.out.printf("%.2f %c [%.2f, %.2f]\n",
                n,
                i.pertence(n) ? '∈' : '∉',
                a,
                b);
    }
}
