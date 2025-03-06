package principal;

import modelo.Carro;
import lista.Lista;

public class UsaLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Carro("Fox", 2014));
        lista.inserir(new Carro("Jetta", 2015));

        lista.exibir();
    }
}
