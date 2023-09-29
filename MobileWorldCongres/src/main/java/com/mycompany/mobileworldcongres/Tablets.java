package com.mycompany.mobileworldcongres;

/**
 *
 * @author yunai
 */
public class Tablets extends Dispositivo implements GamaAlta{
   
    private double pulgadas;
    
    

    public Tablets(String marca, String modelo, double precioBase, double pulgadas) {
        super(marca, modelo, precioBase);
        this.pulgadas = pulgadas;
        
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Tablets{" + "pulgadas=" + pulgadas + '}';
    }
    
    
    
    
    @Override
    public double preuFinal() {
        double precioBase;
        double precioFinal;
        precioBase = getPrecioBase();
        precioFinal = (precioBase * 2);
        
        return precioFinal;
    }

    @Override
    public boolean esGamaAlta() {
       return this.preuFinal() > 900;
    }
}
