/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.dominio;

/**
 *
 * @author user
 */
public class Packing extends Carga {

    private float pesoCaja;
    private int cantidad;
    private float pesoEstructura;
    
    public Packing(String contenido, float pesoCaja, int cantidad, float pesoEstructura) {
        super(contenido);
        this.pesoCaja = pesoCaja;
        this.cantidad = cantidad;
        this.pesoEstructura = pesoEstructura;        
    }

    public float getPesoCaja() {
        return pesoCaja;
    }

    public void setPesoCaja(float pesoCaja) {
        this.pesoCaja = pesoCaja;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPesoEstructura() {
        return pesoEstructura;
    }

    public void setPesoEstructura(float pesoEstructura) {
        this.pesoEstructura = pesoEstructura;
    }   
    
    @Override
    public float calcularPeso() {
        float aux = pesoCaja * cantidad + pesoEstructura;
        return aux;        
    }

    @Override
    public String toString() {
        return super.toString() + " Peso caja: " + pesoCaja + " Cantidad: " 
                + cantidad + " Peso estructura: " + pesoEstructura;
    }
    
    
    
}
