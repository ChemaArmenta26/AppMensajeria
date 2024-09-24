/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ChainTransporte;

import com.mycompany.MedioTransporte.Auto;
import com.mycompany.MedioTransporte.Transporte;
import com.mycompany.Paquete.TipoPaquete;
import com.mycompany.Pedido.Pedido;

/**
 * Manejador de transporte que selecciona un auto para entregar pedidos 
 * bajo ciertas condiciones.
 * 
 * @author Armenta Baca José María 247641
 */
public class ManejadorAuto extends ManejadorTransporteBase {

    @Override
    public Transporte manejar(Pedido pedido) {
        // Si el paquete es grande, se selecciona el auto
        if (pedido.getPaquete().getTipo().equals(TipoPaquete.CAJA_GRANDE)) {
            return new Auto(); // Selecciona auto para paquetes grandes sin importar la distancia o tipo de servicio
        }

        // Delegar al siguiente manejador en la cadena si no se cumple la condición del auto
        if (next != null) {
            return next.manejar(pedido);
        }

        return null; // Si no hay más manejadores y no cumple ninguna condición, retornar null
    }
}
