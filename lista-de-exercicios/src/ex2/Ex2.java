package ex2;

public class Ex2 {
    /*
    Implemente uma classe Lampada com os seguintes componentes
    e faça um teste ao final: Atributos: estado(Enum) Metodos:

    • click(): ao chamar este metodo a lampada  ́e colocada no estado ”apa-
    gada” caso esteja ”acesa” e  ́e colocado no estado ”acesa” caso esteja ”apa-
    gada”.

    • qtdAcendimentos(): retorna quantas vezes a lampada foi acesa (DICA:
    este metodo deve ser chamada no metodo acima).
    • checaEstado(): retorna o estado atual da Lampada.
    */
    public static void main(String[] args) {
        Lampada l = new Lampada();

        System.out.printf("A lâmpada está %s\n\n", l.checaEstado() == StatusLampada.ACESA ? "acesa" : "apagada");
        l.click();
        l.click();
        l.click();
        l.click();
    }
}
