package ex2;

public class Lampada {
    private StatusLampada estado = StatusLampada.APAGADA;
    private int count = 0;

    public void click() {
        if (estado == StatusLampada.APAGADA) {
            estado = StatusLampada.ACESA;
            count++;
        } else {
            estado = StatusLampada.APAGADA;
        }

        System.out.println("*click!*");
        System.out.printf("Agora a lâmpada está %s\n", estado == StatusLampada.ACESA ? "acesa" : "apagada");
        System.out.printf("A lâmpada foi acessa %d vezes.\n\n", qtdAcendimentos());

    }

    public int qtdAcendimentos() {
        return count;
    }

    public StatusLampada checaEstado() {
        return estado;
    }
}
