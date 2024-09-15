package ex7;

public class Ex7 {
    /*
     * Implemente a classe Eq2Grau que possua:
     * Atributos: a, b e c (doubles);
     * Metodos:
     * - delta(): retorna o delta da equação;
     * - raiz1(): retorna a primeira raiz se ∆ ≥ 0, se nao, retorna NaN;
     * - raiz2(): retorna a segunda raiz se ∆ ≥ 0, se nao, retorna NaN.
     */
    public static void main(String[] args) {
        Eq2Grau y = new Eq2Grau(1, -5, 6);

        System.out.println(y.toString());
        System.err.printf("Delta: %.2f\nx1: %.2f\nx2: %.2f\n", y.delta(), y.raiz1(), y.raiz2());
    }
}
