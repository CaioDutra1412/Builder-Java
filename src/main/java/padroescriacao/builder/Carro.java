package padroescriacao.builder;

public class Carro {

    private int ano;
    private String modelo;
    private String marca;
    private String chassi;
    private String renavan;

    public Carro() {
        this.ano = 0;
        this.modelo = "";
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


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }
}
