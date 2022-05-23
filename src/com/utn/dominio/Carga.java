/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.dominio;

/**
 *
 * @author user
 */
public abstract class Carga implements Comparable<Carga> {

    private final String contenido;

    public Carga(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public abstract float calcularPeso();

    @Override
    public String toString() {
        return "Carga con: [" + contenido + "]";
    }

    @Override //Generamos un criterio de comparacion
    public int compareTo(Carga o) {        
        int criterio = 0;
        if (this.calcularPeso() > o.calcularPeso()) {
            criterio = 1;
        } else if (this.calcularPeso() < o.calcularPeso()) {
            criterio = -1;
        }
        return criterio;
    }
}
