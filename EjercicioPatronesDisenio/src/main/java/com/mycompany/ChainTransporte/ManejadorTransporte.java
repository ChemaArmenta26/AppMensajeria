/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ChainTransporte;

import com.mycompany.MedioTransporte.Transporte;
import com.mycompany.Pedido.Pedido;

/**
 * Interfaz para manejar el transporte de pedidos. Permite establecer un
 * manejador siguiente en la cadena y procesar pedidos para determinar el medio
 * de transporte adecuado.
 *
 * @author Armenta Baca José María 247641
 */
public interface ManejadorTransporte {

    /**
     * Establece el siguiente manejador en la cadena de responsabilidad.
     *
     * @param next El siguiente manejador a establecer.
     */
    void setNext(ManejadorTransporte next);

    /**
     * Maneja un pedido y determina qué medio de transporte utilizar.
     *
     * @param pedido El pedido que se desea manejar.
     * @return El medio de transporte seleccionado o null si no se puede manejar
     * el pedido.
     */
    Transporte manejar(Pedido pedido);
}
