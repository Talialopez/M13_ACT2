package com.mycompany.mobileworldcongres;

public abstract class Dispositivo{
    
    private String marca;
    private String modelo;
    private double precioBase;
    
    public  Dispositivo(String marca, String modelo, double precioBase){
        if (precioBase < 0){
            throw new IllegalArgumentException("El precio no es correcto");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "marca=" + marca + ", modelo=" + modelo + ", precioBase=" + precioBase + "€" + '}';
    }
    
    public abstract double preuFinal();
}