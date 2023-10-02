package com.mycompany.mobileworldcongres;

public class Dispositivo {
    private String sistemaOperatiu;
    private boolean accelerometre;
    private boolean gps;

    public Dispositivo(String sistemaOperatiu, String marca, String model, double preuBase, boolean accelerometre, boolean gps) {
        this.sistemaOperatiu = sistemaOperatiu;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.accelerometre = accelerometre;
        this.gps = gps;
    }

    // Getters i setters per cada atribut
    public String getSistemaOperatiu() {
        return sistemaOperatiu;
    }

    public void setSistemaOperatiu(String sistemaOperatiu) {
        this.sistemaOperatiu = sistemaOperatiu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    public boolean isAccelerometre() {
        return accelerometre;
    }

    public void setAccelerometre(boolean accelerometre) {
        this.accelerometre = accelerometre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Sistema Operatiu: " + sistemaOperatiu + "\nMarca: " + marca + "\nModel: " + model + "\nPreu Base: " + preuBase +
               "\nAcceleròmetre: " + (accelerometre ? "Sí" : "No") + "\nGPS: " + (gps ? "Sí" : "No");
    }
}


