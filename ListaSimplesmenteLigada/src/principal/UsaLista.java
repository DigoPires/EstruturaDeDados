package principal;

import modelo.Carro;
import lista.Lista;

public class UsaLista {
    public static void main(String[] args) {

        int id = 0;

        Lista lista = new Lista();
        lista.inserir(new Carro("Fox", 2014));
        lista.inserir(new Carro("Jetta", 2015));
        lista.inserir(new Carro("Nivus", 2022));
        lista.inserir(new Carro("Polo", 2023));

        lista.exibir();
        
        // boolean teste = lista.remover(id);
        // System.out.println("\n==== Removendo ====");
        // if(teste){
        //     lista.exibir();
        // }
        // else{
        //     System.out.println("ID não encontrado!");
        // }

        Carro carro = lista.pesquisar(id);

        System.out.println("\n==== Pesquisa ====");
        if(carro != null){
            System.out.println(carro);
        }
        else{
            System.out.println("Carro não encontrado!");
        }


        System.out.println("\n==== Atualizar ====");
        if(lista.atualizar(id, 2016)){
            System.out.println(lista.pesquisar(id));
        }
        else{
            System.out.println("Carro não encontrado!");
        }
        // Método Atualizar - atualizar o ano do carro
    }
}
