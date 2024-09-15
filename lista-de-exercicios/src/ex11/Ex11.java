package ex11;

public class Ex11 {
    /*
     * Usando o exercıcio anterior, implemente a classe Edificio que possui varios
     * apartamentos.
     * Suponhamos, por simplicidade, que cada edifıcio possui apenas 3 apartamentos.
     * Crie uma classe Apartamento que possui um numero identificador.
     * A classe Edificio deve ser capaz de adicionar apartamentos, listar todos os
     * apartamentos e buscar um apartamento pelo seu identificador.
     */
    public static void main(String[] args) {
        Edificio e = new Edificio();

        e.listarTodosAps();
        e.adicionarAp(new Apartamento(74));
        e.listarTodosAps();

        e.adicionarAp(new Apartamento(42));
        e.adicionarAp(new Apartamento(17));
        e.listarTodosAps();

        e.adicionarAp(new Apartamento(21));

        e.buscarAp(42);
        e.buscarAp(77);
    }
}
