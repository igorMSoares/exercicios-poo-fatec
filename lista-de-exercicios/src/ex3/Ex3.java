package ex3;

public class Ex3 {
    /*
     * Implemente uma classe chamada Complexo para representar
     * n ́umeros imagin ́arios e esta deve possuir:
     * • Atributos: dois doubles a (Parte real) e b (Parte imagin ́aria).
     * • M ́etodos:
     * 1. Construtor;
     * 2. soma();
     * 3. multiplica();
     * 4. toString();
     * 5. modulo();
     * 6. argumentoPrincipal();
     */
    public static void main(String[] args) {
        Complexo c1 = new Complexo(2, 3);
        Complexo c2 = new Complexo(3, 4);

        System.out.printf("Soma: (%s) + (%s) = %s\n\n", c1.toString(), c2.toString(), c1.soma(c2).toString());

        System.out.printf("Multiplica: (%s) * (%s) = %s\n\n", c1.toString(), c2.toString(),
                c1.multiplica(c2).toString());

        System.out.printf("Módulo de %s = %.2f\n\n", c1.toString(), c1.modulo());

        System.out.printf("Argumento principal de %s = %.2f\n\n", c1.toString(), c1.argumentoPrincipal());
    }
}
