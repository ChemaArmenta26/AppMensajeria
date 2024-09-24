/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ChainTransporte;

import com.mycompany.MedioTransporte.Dron;
import com.mycompany.MedioTransporte.Transporte;
import com.mycompany.Paquete.TipoPaquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.Servicio.TipoServicio;

/**
 * Manejador de transporte que selecciona un dron para entregar pedidos 
 * bajo ciertas condiciones.
 * 
 * @author Armenta Baca José María 247641
 */
public class ManejadorDron extends ManejadorTransporteBase {
    @Override
    public Transporte manejar(Pedido pedido) {
        // Si el paquete es un sobre o una caja pequeña, la distancia es <= 1 Km y el servicio es Express
        if ((pedido.getPaquete().getTipo()==(TipoPaquete.SOBRE) || pedido.getPaquete().getTipo()==(TipoPaquete.CAJA_PEQUENA)) 
            && pedido.getDistancia() <= 1 
            && pedido.getTipoServicio()==(TipoServicio.EXPRESS)) {
            return new Dron();  // Selecciona el dron 
        } 
        
        // Delegar al siguiente manejador en la cadena si no se cumplen las condiciones del dron
        if (next != null) {
            return next.manejar(pedido);
        }
        
        return null; // Si no hay más manejadores y no cumple ninguna condición, retornar null
    }
}
