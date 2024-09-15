package ex12;

public class Cliente {
    private String nome, cpf;
    private Telefone tel;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostrarDados() {
        System.out.println("-----Cadastro de Cliente-----");
        System.out.printf("Nome:\t\t%s\n", nome);
        System.out.printf("CPF:\t\t%s\n", cpf);

        if (tel == null) {
            System.out.println("Telefone:\t----");
        } else {
            System.out.printf("Telefone:\t(%s) %s\n", tel.obterDDD(), tel.obterNumero());
        }
    }

    public void adicionarTelefone(Telefone tel) {
        this.tel = tel;
    }
}
