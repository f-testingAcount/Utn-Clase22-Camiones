/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn.dominio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Camion {

    private float cargaMax;
    private int estado;
    private ArrayList<Carga> cargas;

    public Camion() {
        estado = 1; //Disponible
        cargas = new ArrayList<>();
    }

    public Camion(float cargaMax) {
        estado = 1; //Disponible
        cargas = new ArrayList<>();
        this.cargaMax = cargaMax;
    }

    public float getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(float cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getEstado() {
        return estado;
    }

    public float calcularPeso() {
        float aux = 0;
        for (Carga x : cargas) {
            aux += x.calcularPeso();
        }
        return aux;
    }

    public boolean subir(Carga carga) {
        boolean aux = false;

        if (carga != null) {

            float pesoTotal = this.calcularPeso() + carga.calcularPeso();

            if (estado == 1 && pesoTotal <= cargaMax) {
                cargas.add(carga);
                aux = true;
            }
        }
        return aux;
    }

    public int totalCargas() {
        return cargas.size();
    }

    public String mostrarListado() {
        //Collections.sort(cargas, new CriterioPeso()); Si utilizamos la clase CriterioPeso para comparar se agrega el parametro.
        Collections.sort(cargas);
        StringBuilder sb = new StringBuilder("Listado de cargas: \n");        
        for (Carga carga : cargas) {
            sb.append(carga.toString()).append("\n");
        }                   
        return sb.toString();
    }
    
    public boolean estaListoParaSalir() {
//        boolean aux = false;
//        if(estado == 1 && this.calcularPeso() >= (0.75 * cargaMax))
//            aux = true;
//        retrun aux;        
        return (estado == 1 && this.calcularPeso() >= (0.75 * cargaMax)); //Forma simplificada de las lineas de arriba. Devuelve directamente la comparacion
    }
    
    
    
}
