package br.com.victor;

public class Customer {

    private String marca;

    private boolean isVersaoCompleta;

    public Customer (String marca, boolean isVersaoCompleta) {
        this.marca = marca;
        this.isVersaoCompleta = isVersaoCompleta;
    }

    public boolean isVersaoCompleta() {
        return isVersaoCompleta;
    }

    public String getMarca() {
        return marca;
    }
}
