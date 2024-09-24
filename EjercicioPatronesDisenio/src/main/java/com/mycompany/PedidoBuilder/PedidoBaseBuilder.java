/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PedidoBuilder;

import com.mycompany.Paquete.Paquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.Servicio.TipoServicio;

/**
 * Esta clase permite establecer el tipo de servicio, paquete y distancia del
 * pedido. Implementa la interfaz PedidoBuilder
 *
 * @author Armenta Baca José María 247641
 */
public class PedidoBaseBuilder implements PedidoBuilder {

    private TipoServicio tipoServicio;
    private Paquete paquete;
    private double distancia;

    /**
     * Establece el tipo de servicio para el pedido.
     *
     * @param tipoServicio El tipo de servicio a establecer.
     */
    @Override
    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    /**
     * Establece el paquete para el pedido.
     *
     * @param paquete El paquete a establecer.
     */
    @Override
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    /**
     * Establece la distancia para el pedido.
     *
     * @param distancia La distancia a establecer.
     */
    @Override
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * Construye y devuelve el objeto Pedido configurado con los valores
     * establecidos.
     *
     * @return El pedido construido con el tipo de servicio, paquete y distancia
     * especificados.
     */
    @Override
    public Pedido build() {
        Pedido pedido = new Pedido();
        pedido.setTipoServicio(tipoServicio);
        pedido.setPaquete(paquete);
        pedido.setDistancia(distancia);
        return pedido;
    }
}
