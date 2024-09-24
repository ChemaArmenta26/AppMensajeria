/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Strategy;

import com.mycompany.Pedido.Pedido;

/**
 * Implementación de la interfaz CalculadorCosto para calcular el costo de un
 * pedido con la estrategia de servicio estándar.
 *
 * @author Armenta Baca José María 247641
 */
public class CalculadorCostoEstandar implements CalculadorCosto {

    private static final double COSTO_BASE = 30.0;
    private static final double COSTO_POR_KM = 5.0;

    @Override
    public double calcular(Pedido pedido) {
        double costoTotal = COSTO_BASE;

        // Sumar costo adicional del paquete
        costoTotal += pedido.getPaquete().getCostoAdicional();

        // Sumar costo adicional del transporte
        costoTotal += pedido.getTransporte().getCostoExtra();

        // Sumar costo por distancia si es mayor a 10 km
        if (pedido.getDistancia() > 10) {
            costoTotal += (pedido.getDistancia() - 10) * COSTO_POR_KM;
        }

        return costoTotal;
    }
}
