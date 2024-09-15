package q3;

public record Intervalo(double min, double max) {
    public boolean pertence(double n) {
        return n >= min && n <= max;
    }
}
