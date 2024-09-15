package ex9;

import ex4.Cliente;

public class Ex9 {
    /*
     * Usando o Exercicio 4, implemente a classe Transferencia que possuı o metodo
     * transferir() que recebe via parametro dois Clientes c1 e c2 (ver exercıcio
     * acima) e a quantia (necessita uma verificacao de saldo).
     * Deve ser tirado da conta de c2 e colocado na conta de c1.
     * Exiba tambem uma mensagem de conclusao de transferencia explicitando os nomes
     * dos envolvidos.
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jão", 100, 500);
        Cliente c2 = new Cliente("Zé", 0, 300);

        System.out.printf(">> Saldo atual de Jão: R$ %.2f\n", c1.checarSaldo());
        System.out.printf(">> Saldo atual de Zé: R$ %.2f\n\n", c2.checarSaldo());
        Transferencia.transferir(300, c1, c2);

        System.out.printf(">> Saldo atual de Jão: R$ %.2f\n", c1.checarSaldo());
        System.out.printf(">> Saldo atual de Zé: R$ %.2f\n\n", c2.checarSaldo());
        Transferencia.transferir(500, c1, c2);
    }
}
