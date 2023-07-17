package br.com.victor;

public class App {

    public static void main(String[] args) {
        Customer clienteToyota = new Customer("Toyota", true);
        Customer clienteRangeRover = new Customer("Range", false);

        Factory factory = getFactory(clienteToyota);
        Factory factory1 = getFactory(clienteRangeRover);

        Car hiluxComplete = factory.create(clienteToyota.getMarca());
        Car rangeRoverBasic = factory1.create(clienteRangeRover.getMarca());

        hiluxComplete.ligar();
        rangeRoverBasic.ligar();
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.isVersaoCompleta()) {
            return new CompleteVersion();
        } else {
            return new BasicVersion();
        }
    }


}
