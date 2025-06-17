package com.objetos;

public class Deportivo extends Coche {

    public Deportivo(String marca, String modelo) {
        super(marca, modelo);
        this.velocidadMax = super.velocidadMax + 140;
    }

    public void turbo() {
        this.velocidad += 40;
        if(this.velocidad == this.velocidadMax) {
            this.velocidad = this.velocidadMax;
            System.out.println("Conduces con velocidad Max: " + this.velocidad + " km/h");
        }else {
            System.out.println("Con turbo!! " + this.velocidad + "km/h");
        }
    }


    @Override
    public void acelerar() {
        this.velocidad += 50;
        if(this.velocidad >= this.velocidadMax) {
            this.velocidad = this.velocidadMax;
            System.out.println("Conduces con la velocidad Max: " + this.velocidad + " km/h");
        }else {
            System.out.println("Accelerando " + this.velocidad + " km/h");
        }
    }
    

    
}
