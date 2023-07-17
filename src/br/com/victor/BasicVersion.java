package br.com.victor;

public class BasicVersion extends Factory{
    @Override
    Car retornaCarro(String marca) {
        if ("toyota".equalsIgnoreCase(marca)) {
            return new Hilux(400, "Cheio", "Prata");
        } else {
            return new RangeRover(450, "Cheio", "Black");
        }
    }
}
