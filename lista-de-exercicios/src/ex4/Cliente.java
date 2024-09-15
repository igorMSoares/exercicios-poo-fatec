package ex4;

public class Cliente {
    private String nome;
    private double saldo, limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = Math.max(limite, 0);
    }

    public String checarNome() {
        return this.nome;
    }

    public double checarSaldo() {
        return saldo + limite;
    }

    public void sacar(double quantia) {
        if (checarSaldo() < quantia) {
            System.out.printf("Saque no valor de R$ %.2f falhou.\n", quantia);
            System.out.printf("Saldo insuficiente.\nSaldo atual: R$ %.2f\n\n", checarSaldo());
            return;
        }

        if (saldo < quantia) {
            limite -= quantia - saldo;
            saldo = 0;
        } else {
            saldo -= quantia;
        }

        System.out.printf("Saque efetuado no valor de R$ %.2f\nSaldo atual: R$ %.2f\n\n", quantia, checarSaldo());
    }

    public void depositar(double quantia) {
        saldo += quantia;
        System.out.printf("R$ %.2f depositados com sucesso.\nSaldo atual: R$ %.2f\n\n", quantia, checarSaldo());
    }
}
