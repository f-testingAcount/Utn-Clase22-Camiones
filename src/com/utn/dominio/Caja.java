/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.dominio;

/**
 *
 * @author user
 */
public class Caja extends Carga {
    
    private float peso;
    
    public Caja(String contenido, float peso) {
        super(contenido);
        this.peso = peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }    

    @Override
    public float calcularPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return super.toString() + " Peso: " + peso;
    }   
}
