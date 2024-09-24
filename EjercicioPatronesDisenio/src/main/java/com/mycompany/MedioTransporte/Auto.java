/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.MedioTransporte;

/**
 * Clase que representa un auto como medio de transporte. Extiende la clase
 * abstracta Transporte.
 *
 * @author Armenta Baca José María 247641
 */
public class Auto extends Transporte {

    public Auto() {
        this.costoExtra = 30;
    }

    /**
     * Calcula el tiempo de entrega para el auto basado en la distancia.
     *
     * @param distancia Distancia en kilómetros.
     * @return Tiempo de entrega en horas.
     */
    @Override
    public double calcularTiempoEntrega(double distancia) {
        return distancia / 40;
    }

    /**
     * Representación en cadena del medio de transporte.
     *
     * @return Descripción del auto.
     */
    @Override
    public String toString() {
        return "Auto";
    }
}
