/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Strategy;

import com.mycompany.Pedido.Pedido;

/**
 * Interfaz que define la base para las estrategias de calculo de costo de
 * pedidos.
 *
 * @author Armenta Baca José María 247641
 */
public interface CalculadorCosto {

    double calcular(Pedido pedido);
}
