package principal;

import modelo.*;
public class CadastroPessoas {

    public static void main(String[] args) {
        Array lista=new Array();
        lista.inserir(new Pessoa("Mel",12));
        lista.inserir(new Pessoa("Ronda",4));
        lista.inserir(new Pessoa("Gaia",4));
        lista.inserir(new Pessoa("Musta",6));
        lista.inserir(new Pessoa("Tonica",12));

        lista.exibir();

        System.out.println("===Exibir após remover===");

        if(lista.remover(50)){
            lista.exibir();
        }else{
            System.out.println("Não achou!");
        }

        System.out.println("Apresetação do cadastro");
        Pessoa p=lista.pesquisar(new Pessoa(3));
        if(p!=null){
            System.out.println(p);
        }else{
            System.out.println("Não achou!");
        }
    }

}
