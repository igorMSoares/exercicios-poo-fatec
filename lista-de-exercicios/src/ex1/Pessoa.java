package ex1;

public class Pessoa {
    private String nome, sexo;
    private int idade;
    private boolean vegetariana;

    public Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = Math.max(idade, 0);
        this.vegetariana = vegetariana;
    }

    public String nome() {
        return nome;
    }

    public int idade() {
        return idade;
    }

    public boolean vegetariana() {
        return vegetariana;
    }
}
