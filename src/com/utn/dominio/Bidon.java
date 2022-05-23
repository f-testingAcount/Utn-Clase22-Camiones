/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.dominio;

/**
 *
 * @author user
 */
public class Bidon extends Carga {
    
    private float litros;
    private float densidad;

    public Bidon(float litros, float densidad, String contenido) {
        super(contenido);
        this.litros = litros;
        this.densidad = densidad;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getDensidad() {
        return densidad;
    }

    public void setDensidad(float densidad) {
        this.densidad = densidad;
    }
    
    @Override
    public float calcularPeso() {
//        float aux = litros * densidad;
//        return aux;
        return litros * densidad; //Forma simplificada de las dos lineas anteriores
    }

    @Override
    public String toString() {
        return super.toString() + " Litros: " + litros + " Densidad: " + densidad;
    }   
}
