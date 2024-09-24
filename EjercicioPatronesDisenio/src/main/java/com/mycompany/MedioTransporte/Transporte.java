/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.MedioTransporte;

/**
 * Clase abstracta que representa un medio de transporte. Contiene la lógica
 * común para calcular el costo extra y el tiempo de entrega.
 *
 * @author Armenta Baca José María 247641
 */
public abstract class Transporte {

    protected double costoExtra;

    /**
     * Obtiene el costo extra asociado al medio de transporte.
     *
     * @return Costo extra del transporte.
     */
    public double getCostoExtra() {
        return costoExtra;
    }

    /**
     * Método abstracto para calcular el tiempo de entrega basado en la
     * distancia.
     *
     * @param distancia Distancia en kilómetros.
     * @return Tiempo de entrega en horas.
     */
    public abstract double calcularTiempoEntrega(double distancia);

    /**
     * Representación en cadena del medio de transporte.
     *
     * @return Descripción del transporte.
     */
    @Override
    public abstract String toString();
}
