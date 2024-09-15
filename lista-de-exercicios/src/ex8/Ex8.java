package ex8;

public class Ex8 {
    /*
     * Implemente a classe Porta que possua:
     * Atributos: isOpen(boolean), numAberturas(int);
     * Ḿetodos:
     * - abrir(): abre a porta e conta 1 na contagem de aberturas;
     * - fechar(): fecha a porta.
     * OBS: O atributo numAberturas deve contar o total de aberturas de todas as
     * portas possıveis.
     */
    public static void main(String[] args) {
        Porta p1 = new Porta();
        Porta p2 = new Porta();

        System.out.println(">> Abrindo porta 1...");
        p1.abrir();
        System.out.println(">> Abrindo porta 2...");
        p2.abrir();

        System.out.println();
        System.out.println(">> Abrindo porta 1...");
        p1.abrir();
        System.out.println(">> Abrindo porta 2...");
        p2.abrir();

        System.out.println(">> Fechando porta 1...");
        p1.fechar();
        System.out.println(">> Fechando porta 2...");
        p2.fechar();

        System.out.println();
        System.out.println(">> Abrindo porta 1...");
        p1.abrir();
        System.out.println(">> Abrindo porta 2...");
        p2.abrir();

        System.out.println();
        System.out.printf(">> Total de aberturas de todas as portas: %d\n", Porta.numAberturas());
    }
}
