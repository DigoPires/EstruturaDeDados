package modelo;

public class Array {

    private Pessoa[] lista=new Pessoa[3];
    private int indice=0;

    /**
     * Insere um objeto do tipo Pessoa no
     * array lista.
     * @param pessoa Pessoa
     */
    public void inserir(Pessoa pessoa){
        if(indice==lista.length){
            //Novo array maior
            lista=novoArray();
        }
        lista[indice++]=pessoa;
    }

    /**
     * Exibir o conteúdo do array lista.
     */
    public void exibir(){
        for(int i=0;i<indice;i++){
            System.out.println(lista[i]);
        }
    }

    private Pessoa[] novoArray(){
        Pessoa[] novo=new Pessoa[lista.length+2];

        System.arraycopy(lista, 0, novo, 0, lista.length);

        return novo;
    }

    /**
     *
     * @param id
     * @return
     */
    public boolean remover(int id){
        int ipesq=pesquisar(id);
        if(ipesq>=0){
            //remover
            for(int i=ipesq;i<indice-1;i++){
                lista[i]=lista[i+1];
            }
            indice--;
            return true;
        }
        return false;
    }

    private int pesquisar(int id){
        for(int i=0;i<indice;i++){
            if(id==lista[i].getId()){
                return i;
            }
        }
        return -1;//Se não achar!
    }

    //Dada a assinatura do método, implemente
    //a lógica adequada.
    public Pessoa pesquisar(Pessoa pessoa){
        for(int i=0;i<indice;i++){
            if(pessoa.getId()==lista[i].getId()){
                return lista[i];
            }
        }
        return null;//Se não achar!
    }
}
