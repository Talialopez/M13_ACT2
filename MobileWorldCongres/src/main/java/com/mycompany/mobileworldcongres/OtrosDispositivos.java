package com.mycompany.mobileworldcongres;

/**
 *
 * @author María
 */
public class OtrosDispositivos extends Dispositivo{
    
    private String descripcion;

    public OtrosDispositivos(String marca, String modelo, double precioBase, String descripcion) {
        super(marca, modelo, precioBase);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "OtrosDispositivos{" + "descripcion=" + descripcion + '}';
    }
    
    @Override
    public double preuFinal() {
        double precioBase;
        double precioFinal;
        
        precioBase = getPrecioBase();
        precioFinal = (precioBase * 2);
        
        return precioFinal;
    }
        
}
