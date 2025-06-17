package com.objetos;

public class Coche {

    private String marca;
    private String modelo;
    protected int velocidad;
    protected int velocidadMax;
    public boolean cocheArrancado;

    public Coche(String marca, String modelo){
        this.velocidad = 0;
        this.velocidadMax = 180;
        this.cocheArrancado = false;
        this.marca = marca;
        this.modelo = modelo;
        
    }


    @Override
    public String toString() {
        return "El coche: " + this.marca + " " + this.modelo + 
                 " y la velocidad actual: " + this.velocidad;
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

    public void arrancar() {
        if(this.cocheArrancado) {
            System.out.println("El coche ya está arrancado!");
        }else {
            this.cocheArrancado = true;
            System.out.println("El coche ha arancado");
        }
    }

    public void acelerar() {
        if(!cocheArrancado) {
            System.out.println("Arranca el coche, luego acelera!!");
        }else {
            this.velocidad += 20;
            if(this.velocidad >= this.velocidadMax) {
                this.velocidad = this.velocidadMax;
                System.out.println("Conduces con max velocidad " + this.velocidadMax + " km/h.");
            }else {
                System.out.println("Accelerando " + this.velocidad + " km/h.");
            }
        }
    }



    public void frenar() {
        if(this.velocidad == 0) {
            System.out.println("El coche ya está parado!");
        }else {
            this.velocidad -= 10;
            System.out.println("La velocidad ha bajado a " + this.velocidad + " km/h.");
        }
    }
    
}
