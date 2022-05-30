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
    
    //Atributos
    
    private float peso;
    
    //Inicializacion de atributos
    
    public Caja(String contenido, float peso) {
        super(contenido);
        this.peso = peso;
    }
    
    //Getters y setters (En este caso un setter)
    public void setPeso(float peso) {
        this.peso = peso;
    }    

    //Metodo sobreescrito de clase abstracta
    @Override
    public float calcularPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return super.toString() + " Peso: " + peso;
    }   
}
