package ex10;

import ex8.Porta;

public class Casa {
    private String cor;
    private Porta[] portas;

    public Casa(String cor, Porta[] portas) {
        this.cor = cor;

        if (portas.length == 0) {
            System.err.println(">> A casa deve ter pelo menos uma porta de entrada. Incluindo porta...");

            this.portas = new Porta[1];
            this.portas[0] = new Porta();
            return;
        }

        if (portas.length > 3) {
            System.err.println(">> A casa pode ter no máximo 3 portas. Reduzindo quantidade de portas para 3...");

            this.portas = new Porta[3];
            for (int i = 0; i < 3; i++) {
                this.portas[i] = portas[i];
            }
            return;
        }

        this.portas = portas;
    }

    public void abrirPorta(int i) {
        if (i >= portas.length) {
            System.out.printf(">> Porta número %d não existe.\n", i);
            return;
        }

        System.out.printf(">> Abrindo porta número %d\n", i);
        portas[i].abrir();
    }

    public void fecharPorta(int i) {
        if (i >= portas.length) {
            System.out.printf(">> Porta número %d não existe.\n", i);
            return;
        }

        System.out.printf(">> Fechando porta número %d\n", i);
        portas[i].fechar();
    }

    public int totalPortasAbertas() {
        int count = 0;

        for (Porta p : portas) {
            if (!p.isOpen()) {
                continue;
            }

            count++;
        }

        return count;
    }
}
