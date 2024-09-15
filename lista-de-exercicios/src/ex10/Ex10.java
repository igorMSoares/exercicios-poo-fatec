package ex10;

import ex8.Porta;

public class Ex10 {
    /*
     * Usando o exercıcio 8, faca uma classe Casa com que represente uma casa.
     * A casa tem uma cor, uma porta de entrada e pode ter ate tres portas
     * (considere que todas as portas podem ser abertas ou fechadas
     * independentemente).
     * Implemente os metodos para abrir e fechar as portas, e um metodo que retorne
     * quantas portas estao abertas.
     */
    public static void main(String[] args) {
        Porta[] portas = { new Porta(), new Porta(), new Porta() };
        Casa c = new Casa("Amarela", portas);

        c.abrirPorta(0);
        c.fecharPorta(0);
        c.abrirPorta(1);
        System.out.printf("\n>> Total de portas abertas: %d\n", c.totalPortasAbertas());
        c.abrirPorta(2);
        c.abrirPorta(1);
        System.out.printf("\n>> Total de portas abertas: %d\n", c.totalPortasAbertas());
        c.fecharPorta(0);
        c.fecharPorta(1);
        c.fecharPorta(2);
        System.out.printf("\n>> Total de portas abertas: %d\n", c.totalPortasAbertas());
    }
}
