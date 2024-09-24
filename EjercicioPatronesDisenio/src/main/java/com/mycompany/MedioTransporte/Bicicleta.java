/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.MedioTransporte;

/**
 * Clase que representa una bicicleta como medio de transporte. Extiende la
 * clase abstracta Transporte.
 *
 * @author Armenta Baca José María 247641
 */
public class Bicicleta extends Transporte {

    public Bicicleta() {
        this.costoExtra = 5;
    }

    /**
     * Calcula el tiempo de entrega para la bicicleta basado en la distancia.
     *
     * @param distancia Distancia en kilómetros.
     * @return Tiempo de entrega en horas.
     */
    @Override
    public double calcularTiempoEntrega(double distancia) {
        return distancia / 20;
    }

    /**
     * Representación en cadena del medio de transporte.
     *
     * @return Descripción de la bicicleta.
     */
    @Override
    public String toString() {
        return "Bicicleta";
    }
}
