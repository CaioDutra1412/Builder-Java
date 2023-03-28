package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {

    @Test
    void excecaoCarroSemAno() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Compass")
                    .setMarca("Jeep")
                    .setChassi("1G8ZK5277WZ313629")
                    .setRenavam("J65432198765")
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ano inválido", e.getMessage());
        }
    }

    @Test
    void excecaoParaCarroSemModelo() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setAno(2023)
                    .setMarca("Jeep")
                    .setChassi("1G8ZK5277WZ313629")
                    .setRenavam("J65432198765")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido", e.getMessage());
        }
    }

    @Test
    void retornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setAno(2023)
                .setModelo("Compass")
                .setMarca("Jeep")
                .setChassi("1G8ZK5277WZ313629")
                .setRenavam("J65432198765")
                .build();

        assertNotNull(carro);
    }
}
