/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ChainTransporte;

import com.mycompany.MedioTransporte.Transporte;
import com.mycompany.Pedido.Pedido;

/**
 * Clase base para los manejadores de transporte, que implementa la interfaz
 * ManejadorTransporte y maneja la referencia al siguiente manejador.
 *
 * @author Armenta Baca José María 247641
 */
public abstract class ManejadorTransporteBase implements ManejadorTransporte {

    protected ManejadorTransporte next;

    @Override
    public void setNext(ManejadorTransporte next) {
        this.next = next;
    }

    @Override
    public abstract Transporte manejar(Pedido pedido);
}
