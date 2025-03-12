package lista;

import modelo.Carro;

public class Lista {

    private No inicio, atual, aux;

    public void inserir(Object objeto){
        if(inicio == null){
            inicio = new No(objeto, null);
            aux = inicio;
        }
        else{
            atual = new No(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir(){
        No ref = inicio;
        while(ref!=null){
            System.out.println(ref.getDados());
            ref = ref.getProx();
        }
    }

    /**
     * Realizar a pesquisa linear na lista.
     * @param id int
     * @return No
     */

    public Carro pesquisar(int id){
        No ref = inicio;
        Carro carro;
        while(ref!=null){
            carro = (Carro)ref.getDados(); // Cating - Conversão temporária
            if(id==carro.getId()){
                return carro;
            }
            ref=ref.getProx();
        }

        return null;
    }

    public boolean remover(int id){
        No ref = inicio;
        No refAnterior=inicio;  
        Carro carro;
        while(ref!=null){
            carro = (Carro)ref.getDados(); // Cating - Conversão temporária
            if(id==carro.getId()){
                break;
            }
            refAnterior = ref;
            ref = ref.getProx();
        }

        if(ref!=null){
            //remover
            if(ref==inicio){ // Remove o primeiro Nó
                inicio = inicio.getProx();
                ref.setProx(null);
            }
            else if(ref==atual){ // Remove o último Nó
                aux = refAnterior;
                atual = aux;
                aux.setProx(null);
            }
            else{
                refAnterior.setProx(ref.getProx());
                ref.setProx(null);
            }
            return true;
        }

        return false;
    }

    public void atualizar(int id){
        
    }
}
