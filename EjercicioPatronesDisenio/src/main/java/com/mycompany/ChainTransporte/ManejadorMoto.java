/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ChainTransporte;

import com.mycompany.MedioTransporte.Moto;
import com.mycompany.MedioTransporte.Transporte;
import com.mycompany.Paquete.TipoPaquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.Servicio.TipoServicio;

/**
 * Manejador de transporte que selecciona una moto para entregar pedidos 
 * bajo ciertas condiciones.
 * 
 * @author Armenta Baca José María 247641
 */
public class ManejadorMoto extends ManejadorTransporteBase {

    @Override
    public Transporte manejar(Pedido pedido) {
        // Si el paquete es un sobre o una caja pequeña y la distancia es mayor a 1 km y el servicio es Express
        if ((pedido.getPaquete().getTipo().equals(TipoPaquete.SOBRE) || pedido.getPaquete().getTipo().equals(TipoPaquete.CAJA_PEQUENA))
                && pedido.getDistancia() > 1
                && pedido.getTipoServicio().equals(TipoServicio.EXPRESS)) {
            return new Moto();  // Selecciona la moto si el servicio es Express y la distancia es > 1 Km
        }

        // Si el paquete es mediano y la distancia es mayor a 5 km o el servicio es Express
        if (pedido.getPaquete().getTipo().equals(TipoPaquete.CAJA_MEDIANA)
                && (pedido.getDistancia() > 5 || pedido.getTipoServicio().equals(TipoServicio.EXPRESS))) {
            return new Moto();  // Selecciona la moto si la distancia es > 5 Km o el servicio es Express
        }

        // Delegar al siguiente manejador en la cadena si no se cumplen las condiciones de la moto
        if (next != null) {
            return next.manejar(pedido);
        }

        return null; // Si no hay más manejadores y no cumple ninguna condición, retornar null
    }
}
