package ex8;

public class Porta {
    private boolean isOpen = false;
    private static int numAberturas;

    public void abrir() {
        if (isOpen) {
            System.out.println(">> Porta já está aberta.\n");
            return;
        }

        isOpen = true;
        Porta.numAberturas++;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void fechar() {
        if (!isOpen) {
            System.out.println(">> Porta já está fechada.\n");
            return;
        }

        isOpen = false;
    }

    public static int numAberturas() {
        return Porta.numAberturas;
    }
}
