package ex4;

public class Ex4 {
    /*
    Implemente a classe Cliente que possua os atributos nome,
    saldo, e limite. Esta deve possuir tamb ́em os m ́etodos sacar(), depositar(),
    checarSaldo(), e obterNome(). Sabe-se que s ́o  ́e poss ́ıvel sacar se o saldo+limite
    forem superiores `a quantia. Os m ́etodos sacar() e depositar() necessitam de
    parˆametros. O m ́etodo checarSaldo deve retornar o valor saldo+limite. O
    m ́etodo obterNome() deve retornar o nome do Cliente.
    */
    public static void main(String[] args) {
        Cliente c = new Cliente("Jão", 100, 500);

        System.out.printf("Nome do Cliente: %s\n", c.checarNome());

        System.out.printf("Saldo atual: R$ %.2f\n\n", c.checarSaldo());

        c.sacar(700);
        c.sacar(500);
        c.sacar(100);

        c.depositar(300);
    }
}
