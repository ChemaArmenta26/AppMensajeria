/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.MedioTransporte;

/**
 * Clase que representa una motocicleta como medio de transporte. Extiende la
 * clase abstracta Transporte.
 *
 * @author Armenta Baca José María 247641
 */
public class Moto extends Transporte {

    public Moto() {
        this.costoExtra = 15;
    }

    /**
     * Calcula el tiempo de entrega para la motocicleta basado en la distancia.
     *
     * @param distancia Distancia en kilómetros.
     * @return Tiempo de entrega en horas.
     */
    @Override
    public double calcularTiempoEntrega(double distancia) {
        return distancia / 45;
    }

    /**
     * Representación en cadena del medio de transporte.
     *
     * @return Descripción de la motocicleta.
     */
    @Override
    public String toString() {
        return "Motocicleta";
    }
}
