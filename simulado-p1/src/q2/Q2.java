package q2;

import q1.Acao;
import q1.Comando;

public class Q2 {
    public static void main(String[] args) {
        Comando[] contadores = {
                new Comando(11, Acao.DECREMENTAR),
                new Comando(3, Acao.INCREMENTAR),
                new Comando(0, Acao.DUPLOINCROMENTO)
        };

        Fita f = new Fita();

        System.out.printf(">> Soma total: %d\n", f.somaTotal());
        System.out.printf(">> Total de ímpares: %d\n", f.imparesCount());
        System.out.printf(">> Total de zerados: %d\n", f.zeradosCount());
        System.out.println();

        for (Comando c : contadores) {
            f.inserirContador(c);
        }

        f.inserirContador(new Comando(100, Acao.ZERAR));

        System.out.printf(">> Soma total: %d\n", f.somaTotal());
        System.out.printf(">> Total de ímpares: %d\n", f.imparesCount());
        System.out.printf(">> Total de zerados: %d\n", f.zeradosCount());
    }
}
