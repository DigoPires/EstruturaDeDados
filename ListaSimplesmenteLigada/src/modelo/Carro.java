package modelo;

public class Carro {
    private int id;
    private String modelo;
    private int ano;
    private static int contador = 0;

    public Carro (String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
        this.id = contador++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "ano='" + ano + '\'' +
                ", modelo='" + modelo + '\'' +
                ", id=" + id +
                '}';
    }
}
