/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ChainTransporte;

import com.mycompany.MedioTransporte.Bicicleta;
import com.mycompany.MedioTransporte.Transporte;
import com.mycompany.Paquete.TipoPaquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.Servicio.TipoServicio;

/**
 * Manejador de transporte que selecciona una bicicleta para entregar pedidos
 * bajo ciertas condiciones.
 *
 * @author PC
 */
public class ManejadorBicicleta extends ManejadorTransporteBase {

    @Override
    public Transporte manejar(Pedido pedido) {
        // Si el paquete es un sobre o una caja pequeña
        if (pedido.getPaquete().getTipo().equals(TipoPaquete.SOBRE) || pedido.getPaquete().getTipo().equals(TipoPaquete.CAJA_PEQUENA)) {
            if (pedido.getDistancia() <= 1 && pedido.getTipoServicio().equals(TipoServicio.ESTANDAR)) {
                return new Bicicleta(); // Selecciona la bicicleta si la distancia es <= 1 Km y el servicio es Estándar
            } else if (pedido.getDistancia() > 1 && pedido.getTipoServicio().equals(TipoServicio.ESTANDAR)) {
                return new Bicicleta(); // Selecciona la bicicleta si la distancia es > 1 Km y el servicio es Estándar
            }
        }
        // Si el paquete es mediano, distancia <= 5 Km y servicio Estándar
        if (pedido.getPaquete().getTipo().equals(TipoPaquete.CAJA_MEDIANA) && pedido.getDistancia() <= 5 && pedido.getTipoServicio().equals(TipoServicio.ESTANDAR)) {
            return new Bicicleta();
        }

        // Delegar al siguiente manejador en la cadena si no se cumple ninguna condición
        if (next != null) {
            return next.manejar(pedido);
        }

        return null; // Si no hay más manejadores y no cumple ninguna condición, retornar null
    }
}
