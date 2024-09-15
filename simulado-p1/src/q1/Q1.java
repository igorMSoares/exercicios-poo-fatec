package q1;

public class Q1 {
    public static void main(String[] args) {
        Comando zerar = new Comando(10, Acao.ZERAR);
        Comando inc = new Comando(0, Acao.INCREMENTAR);
        Comando dec = new Comando(5, Acao.DECREMENTAR);
        Comando dInc = new Comando(0, Acao.DUPLOINCROMENTO);

        zerar.executar();
        zerar.mostrar();

        inc.executar();
        inc.mostrar();
        inc.executar();
        inc.mostrar();
        inc.executar();
        inc.mostrar();

        dec.executar();
        dec.mostrar();
        dec.executar();
        dec.executar();
        dec.executar();
        dec.executar();
        dec.mostrar();
        dec.executar();
        dec.mostrar();

        dInc.executar();
        dInc.mostrar();
        dInc.executar();
        dInc.mostrar();
        dInc.executar();
        dInc.mostrar();
    }
}
