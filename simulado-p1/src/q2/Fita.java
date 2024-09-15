package q2;

import q1.Comando;

/*
 * Uma classe chamada Fita possuir ́a v ́arios contadores. Implemente m ́etodos para inserir um contador,
retornar a soma do estado atual de todos os contadores. Um m ́etodo para retornar quantos contadores s ̃ao  ́ımpares
e um m ́etodo para saber quantos contadores est ̃ao zerados. Fa ̧ca um teste com 3 contadores contendo as a ̧c ̃oes
necess ́arias e mostre, por exemplo, a soma deles.
 */

public class Fita {
    private Comando[] contadores;

    public Fita() {
        contadores = new Comando[3];
    }

    public void inserirContador(Comando c) {
        if (contadores[contadores.length - 1] != null) {
            System.out.println("Não é possível inserir mais contadores: limite máximo atingido.");
            return;
        }

        int i;
        for (i = 0; i < contadores.length; i++) {
            if (contadores[i] == null) {
                break;
            }
        }

        contadores[i] = c;
    }

    public int somaTotal() {
        int soma = 0;

        for (Comando c : contadores) {
            if (c == null) {
                break;
            }

            soma += c.getValor();
        }

        return soma;
    }

    public int imparesCount() {
        int count = 0;

        for (Comando c : contadores) {
            if (c == null) {
                break;
            }

            if (c.getValor() % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public int zeradosCount() {
        int count = 0;

        for (Comando c : contadores) {
            if (c == null) {
                break;
            }

            if (c.getValor() == 0) {
                count++;
            }
        }

        return count;
    }
}
