package modelo;

public class Pessoa {//Tipo Abstrato de Dados
    private String nome;
    private int idade;
    private int id;
    private static int valor=1;

    public Pessoa(){}

    public Pessoa(int id){
        this.id=id;
    }

    public Pessoa(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
        this.id=valor++;
    }

    //Métodos acessores
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+" Idade: "+idade+" ID: "+id;
    }

}
