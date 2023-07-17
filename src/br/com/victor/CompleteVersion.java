package br.com.victor;

public class CompleteVersion extends Factory{
    Car retornaCarro(String marca) {
        if ("toyota".equalsIgnoreCase(marca)) {
            return new Hilux(600, "Cheio", "Diamond");
        } else {
            return new RangeRover(750, "Cheio", "Deluxe");
        }
    }
}
