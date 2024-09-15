package ex1;

public class Ex1 {
    public static void main(String[] args) {
        /*
        Exercício 1. Dada a classe Pessoa que possui os atributos: String nome,
        String sexo, int idade, boolean vegetariana. Fa ̧ca agora uma classe Chur-
        rasco que possua: Atributos: qtdCarne(double); M ́etodo: verificarConsumo():

        Recebe via parˆametro uma Pessoa e com isto define a consumacao media de
        carne (quantidade de carne consumida) pessoas de 0 a 3 anos nao consomem,
        vegetarianos tambem nao. Pessoas de 4 a 12 anos consomem 1 kilo de carne e
        de 13 anos em diante 2 kilos de carne.
        */

        Pessoa p1 = new Pessoa("Jão", "M", 27, false);
        Pessoa p2 = new Pessoa("Maria", "F", 12, false);
        Pessoa p3 = new Pessoa("Zé", "M", 1, false);
        Pessoa p4 = new Pessoa("Toinha", "F", 32, true);

        Churrasco c = new Churrasco(4);

        System.out.printf("%s, %d anos de idade, %s vegetariana. Consome %.2f Kg de carne.\n",
            p1.nome(), p1.idade(), p1.vegetariana() ? "" : "não é", c.verificarConsumo(p1)
        );
        System.out.printf("%s, %d anos de idade, %s vegetariana. Consome %.2f Kg de carne.\n",
            p2.nome(), p2.idade(), p2.vegetariana() ? "" : "não é", c.verificarConsumo(p2)
        );
        System.out.printf("%s, %d anos de idade, %s vegetariana. Consome %.2f Kg de carne.\n",
            p3.nome(), p3.idade(), p3.vegetariana() ? "" : "não é", c.verificarConsumo(p3)
        );
        System.out.printf("%s, %d anos de idade, %svegetariana. Consome %.2f Kg de carne.\n",
            p4.nome(), p4.idade(), p4.vegetariana() ? "" : "não é ", c.verificarConsumo(p4)
        );
    }
}
