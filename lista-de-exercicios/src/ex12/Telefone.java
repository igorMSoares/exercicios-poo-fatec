package ex12;

public class Telefone {
    private String ddd, numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String obterNumero() {
        return this.numero;
    }

    public String obterDDD() {
        return this.ddd;
    }
}
