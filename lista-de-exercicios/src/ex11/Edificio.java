package ex11;

public class Edificio {
    private Apartamento[] apartamentos;

    public Edificio() {
        apartamentos = new Apartamento[3];
    }

    public void adicionarAp(Apartamento ap) {
        if (apartamentos[apartamentos.length - 1] != null) {
            System.out.println(">> O edíficio já está lotado. Não é possível adicionar mais apartamentos.");
            return;
        }

        int i;
        for (i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i] == null) {
                break;
            }
        }

        apartamentos[i] = ap;
        System.out.printf(">> Apartamento #%d adicionado ao edifício\n", ap.id());
    }

    public void listarTodosAps() {
        if (apartamentos[0] == null) {
            System.out.println(">> O edifício não possui nenhum apartamento...");
            return;
        }

        System.out.println(">> Listando apartamentos...");

        for (Apartamento ap : apartamentos) {
            if (ap == null) {
                break;
            }

            System.out.printf("> Apartamento #%d\n", ap.id());
        }
    }

    public Apartamento buscarAp(int id) {
        if (apartamentos[0] == null) {
            System.out.println(">> O edifício não possui nenhum apartamento...");
            return null;
        }

        for (Apartamento ap : apartamentos) {
            if (ap.id() == id) {
                System.out.printf(">> Apartamento #%d encontrado.\n", id);
                return ap;
            }
        }

        System.out.printf(">> Apartamento #%d não encontrado.\n", id);
        return null;
    }
}
