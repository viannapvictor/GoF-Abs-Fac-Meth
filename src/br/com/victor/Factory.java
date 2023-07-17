package br.com.victor;

public abstract class Factory {

    public Car create(String marca) {
        Car car = retornaCarro(marca);
        return car;
    }

    private Car prepararCarro(Car car) {
        car.limpar();
        car.inspecao();
        car.encherOTanque();
        return car;
    }

    abstract Car retornaCarro (String marca);

}
