package q1;

/*
 * Implemente uma classe Comando que ser ́a respons ́avel por manipular o contador de pessoas. A classe deve conter:
• Dois atributos privados:
– valor (int): Representa o contador computacional.
– acao (Acao): Define a a ̧c ̃ao a ser realizada no contador.
• Um construtor que inicializa os atributos valor e acao. O valor deve ser inicializado com 0 e acao com
Acao.ZERAR por padr ̃ao.
• M ́etodos getters para ambos os atributos.
• Um m ́etodo executar() que altera o valor do contador de acordo com a acao atual:
– Se a a ̧c ̃ao for INCREMENTAR, o contador aumenta em 1.
– Se a a ̧c ̃ao for DECREMENTAR, o contador diminui em 1, mas n ̃ao pode ser menor que 0.
– Se a a ̧c ̃ao for DUPLOINCREMENTO, o contador aumenta em 2.
– Se a a ̧c ̃ao for ZERAR, o contador retorna a 0.
• Um m ́etodo mostrar() para imprimir o estado atual do contador e a a ̧c ̃ao correspondente na tela.
 */
public class Comando {
    private int valor;
    private Acao acao;

    public Comando(int valor, Acao acao) {
        this.valor = valor;
        this.acao = acao;
    }

    public int getValor() {
        return valor;
    }

    public Acao getAcao() {
        return acao;
    }

    public void executar() {
        switch (acao) {
            case INCREMENTAR:
                valor++;
                break;
            case DECREMENTAR:
                valor = Math.max(--valor, 0);
                break;
            case DUPLOINCROMENTO:
                valor += 2;
                break;
            default:
                valor = 0;
        }
    }

    public void mostrar() {
        System.out.printf(">> Ação: %s\n>> Contador: %d\n", getAcao(), getValor());
    }
}
