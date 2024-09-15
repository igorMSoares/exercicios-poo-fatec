package ex12;

public class Ex12 {
    /*
     * Implemente a classe Cliente que contenha os atributos: nome, cpf (Strings) e
     * telefone (Telefone).
     * E que contenha os m ́etodos: mostrarDados() e adicionarTelefone() o primeiro
     * deve mostrar todos os dados do cliente incluindo o telefone e o ́ultimo deve
     * associar um novo telefone ao cliente.
     * Implemente a classe Telefone que possua os atributos: ddd e n ́umero
     * (Strings) e os metodos: obterNumero() e obterDDD().
     */
    public static void main(String[] args) {
        Cliente c = new Cliente("Jão", "123.456.789-00");

        c.mostrarDados();

        System.out.println();
        c.adicionarTelefone(new Telefone("13", "987654321"));
        c.mostrarDados();
    }
}
