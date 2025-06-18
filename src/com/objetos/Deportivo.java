package com.objetos;

public class Deportivo extends Coche {

    public Deportivo() {
        
        this.setVelocidadMax(super.getVelocidadMax() + 140);
    }

    public int turbo() {
        
        this.setVelocidad(this.getVelocidad() + 40);
        if(this.getVelocidad() >= this.getVelocidadMax()) {
            this.setVelocidad(this.getVelocidadMax());
        }
        return this.getVelocidad();
    }


    @Override
    public int acelerar() {
        if(this.cocheArrancado == false) {
            System.out.println("Debe arrancar el coche primero");
            return 0;
        }else {
            this.setVelocidad(this.getVelocidad() + 50);      
            if(this.getVelocidad() >= this.getVelocidadMax()) {
                this.setVelocidad(getVelocidadMax());
            }
            return this.getVelocidad();
        }
    }
    

    
}
