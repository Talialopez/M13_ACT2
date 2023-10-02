package com.mycompany.mobileworldcongres;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author talia y maria
 */
public class Main {
    public static void main(String[] args) {
        List <Dispositivo> dispositivos = new ArrayList<>();
    
        dispositivos.add(new OtrosDispositivos("Apple", "Clásico", 100, "Reloj"));
        dispositivos.add(new Smartphone("Android", "Samung", "S20FE", 300));
        dispositivos.add(new Smartphone("IOS", true, true, "Iphone", "7", 500));
        dispositivos.add(new Tablets("Huawei", "Clásico", 400, 10.15));
        dispositivos.add(new OtrosDispositivos("Samsung", "15S", 750, "Reloj"));
        
        System.out.println("Apartado 1: ");
        for(Dispositivo d : dispositivos){
            System.out.println(d);
        }
  
        System.out.println("\nApartado 2: ");
        for(Dispositivo d : dispositivos){
            System.out.println("Precio final " + d.precioFinal() + " " + d);
        }
        
        System.out.println("\nApartado 3: ");
        for(Dispositivo d : dispositivos){
            if(d instanceof GamaAlta){
                System.out.println("Dispositivo: " + d + "Gama alta: " + ((GamaAlta) d).esGamaAlta());
            }
        }
    }
    
    
}
