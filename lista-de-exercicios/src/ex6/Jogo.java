package ex6;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private int n;

    private void sortear() {
        Random rand = new Random();
        n = rand.nextInt(100);
    }

    public void adivinhar() {
        sortear();

        int x;

        System.out.print(">> De 0 a 99, um número foi sorteado 🎲\n>> Adivinhe o número: ");
        Scanner s = new Scanner(System.in);

        while (true) {
            x = s.nextInt();

            if (x == n) {
                System.out.println(">> PARABÉNS!! Você acertou! 😎");

                s.close();
                return;
            }

            if (x < 0 || x > 99) {
                System.out.printf(">> Número inválido: deve ser de 0 a 99 apenas.\n\n> ");
                continue;
            }

            if (n > x) {
                System.out.printf(">> NOPE!! Dica: é um número maior que %d\n\n> ", x);
                continue;
            }

            System.out.printf(">> NOPE!! Dica: é um número menor que %d\n\n> ", x);
        }
    }
}
