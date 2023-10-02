package com.mycompany.mobileworldcongres;


public class Smartphone extends Dispositivo implements GamaAlta {
    private String sistemaOperativo;
    private boolean acelerometro;
    private boolean gps;
    
    public Smartphone(String sistemaOperativo, boolean acelerometro, boolean gps, String marca, String modelo, double precioBase) {
        super(marca, modelo, precioBase);
        this.sistemaOperativo = sistemaOperativo;
        this.acelerometro = acelerometro;
        this.gps = gps;
    }

    public Smartphone(String sistemaOperativo, String marca, String modelo, double precioBase) {
        this(sistemaOperativo, false, true, marca, modelo, precioBase);
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public boolean isAcelerometro() {
        return acelerometro;
    }

    public void setAcelerometro(boolean acelerometro) {
        this.acelerometro = acelerometro;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "sistemaOperativo=" + sistemaOperativo + ", acelerometro=" + acelerometro + ", gps=" + gps + super.toString()
                + '}';
    }

    @Override
    public double precioFinal() {
        double precioBase = getPrecioBase();
        double precioFinal = 0;
        if(this.isAcelerometro()){
            precioBase = precioBase * 1.1;
            if(isGps()){
                precioBase = precioBase * 1.05;
            }
        }
        
        precioFinal = precioBase * 2;
        return precioFinal;
    }

    @Override
    public boolean esGamaAlta() {
        return this.precioFinal() > 700;
    }
 
}