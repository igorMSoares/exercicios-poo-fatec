package ex1;

public class Churrasco {
    private double qtdCarne;

    public Churrasco(double qtdCarne) {
        this.qtdCarne = Math.max(qtdCarne, 0);
    }

    public double verificarConsumo(Pessoa p) {
        if (p.vegetariana() || (p.idade() >= 0 && p.idade() <= 3)) {
            return .0;
        }

        if (p.idade() >= 4 && p.idade() <= 12) {
            return 1.0;
        }

        return 2.0;
    }
}
