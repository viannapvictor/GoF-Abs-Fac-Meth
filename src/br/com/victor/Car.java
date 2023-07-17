package br.com.victor;

public class Car {

    private int potencia;
    private String tanque;
    private String cor;

    public Car(int potencia, String tanque, String cor) {
        this.potencia = potencia;
        this.tanque = tanque;
        this.cor = cor;
    }

    public void ligar(){
        System.out.println(getClass().getSimpleName());
        System.out.println("A ignição foi dada e ele possui " + potencia +
                " cavalos de potencia" );
    }
    public void limpar(){
        System.out.println("O carro está um brinco! Enfim podemos ver sua cor, ele é " + cor.toLowerCase());
    }
    public void inspecao(){
        System.out.println("Check realizado e tudo OK!");
    }
    public void encherOTanque() {
        System.out.println("Tanque está sendo cheio " + tanque.toLowerCase());
    }

}
