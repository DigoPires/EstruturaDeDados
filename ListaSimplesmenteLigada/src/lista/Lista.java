package lista;

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
}
