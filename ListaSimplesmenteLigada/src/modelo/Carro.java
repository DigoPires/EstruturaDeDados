package modelo;

public class Carro {
    private int id;
    private String modelo;
    private String ano;
    private static int contador = 1;

    public Carro (int id, String modelo, String ano){
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
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
