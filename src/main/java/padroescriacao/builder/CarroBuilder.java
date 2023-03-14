package padroescriacao.builder;

import java.util.Date;

public class CarroBuilder {

    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public Carro build() {
        if (carro.getAno() == 0) {
            throw new IllegalArgumentException("Ano inválido");
        }
        if (carro.getModelo().equals("")) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        return carro;
    }

    public CarroBuilder setAno(int ano) {
        carro.setAno(ano);
        return this;
    }

    public CarroBuilder setModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setMarca(String marca) {
        carro.setMarca(marca);
        return this;
    }

    public CarroBuilder setChassi(String chassi) {
        carro.setChassi(chassi);
        return this;
    }

    public CarroBuilder setRenavam(String renavam) {
        carro.setRenavan(renavam);
        return this;
    }
}
