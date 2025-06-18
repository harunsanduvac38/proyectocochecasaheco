package com.objetos;

public class Coche {

    public Coche() {
        this.velocidad = 0;
        this.cocheArrancado = false;
        this.velocidadMax = 180;
        
    }

    

    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMax;
    protected boolean cocheArrancado;

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadMax() {
        return this.velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }


    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "El coche: " + this.marca + " " + this.modelo + 
                 " y la velocidad actual: " + this.velocidad;
    }


    public void arrancar() {
        if(this.cocheArrancado) {
            System.out.println("El coche ya está arrancado!");
        }else {
            this.cocheArrancado = true;
            System.out.println("El coche ha arancado");
        }
    }

   
    public int acelerar() {
        //No podemos acelerar si el coche no ha arrancado
        if (this.cocheArrancado == false){
            System.out.println("Debe arrancar el coche primero");
            return 0;
        }else {
            this.velocidad += 20;
            if (this.velocidad > this.velocidadMax){
                this.velocidad = this.velocidadMax;
            }
            return this.velocidad;
        }
    }




    public int frenar() {
        this.velocidad -= 10;
        if(this.getVelocidad() <= 0) {
            this.setVelocidad(0);
            System.out.println("El coche ya está parado!");
        }
        return this.velocidad;
    }

    public int frenar(boolean atopoe) {
        System.out.println("Frenado a tope y apagado!");
        this.velocidad = 0;
        this.cocheArrancado = false;
        return 0;
    }
    
}
