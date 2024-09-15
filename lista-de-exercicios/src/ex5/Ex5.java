package ex5;

public class Ex5 {
    /*
    Implemente uma classe que modele um triˆangulo equilatero (lados iguais).
    Atributos: lado, perımetro, ́area. Metodos: calcArea(), calcPerımetro e seus gets.
    O lado dever ́a ser o  ́unico atributo inicializado via construtor.
    */
    public static void main(String[] args) {
        Equilatero e = new Equilatero(3);

        System.out.printf("Lado do Triângulo Equilátero: %.2f cm\n", e.lado());
        System.out.printf("Perímetro:\t%.2f cm\n", e.perimetro());
        System.out.printf("Área:\t\t%.2f cm\n", e.area());
    }
}
