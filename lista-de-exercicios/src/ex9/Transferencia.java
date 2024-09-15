package ex9;

import ex4.Cliente;

public class Transferencia {
    public static void transferir(double quantia, Cliente c1, Cliente c2) {
        System.out.printf(">> Iniciando transferência no valor de R$ %.2f de %s para %s\n", quantia, c1.checarNome(),
                c2.checarNome());

        if (quantia > c1.checarSaldo()) {
            System.out.printf(">> Transferência cancelada por falta de saldo.\n> Saldo atual: R$ %.2f\n",
                    c1.checarSaldo());

            return;
        }

        c1.sacar(quantia);
        c2.depositar(quantia);

        System.out.println(">> Transferência concluída com sucesso!");
    }
}
