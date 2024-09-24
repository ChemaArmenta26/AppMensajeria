/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PedidoBuilder;

import com.mycompany.Paquete.Paquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.Servicio.TipoServicio;

/**
 * Director que utiliza un PedidoBuilder para construir objetos Pedido. Esta
 * clase proporciona métodos para crear pedidos de diferentes tipos (EXPRESS y
 * ESTANDAR) configurando los atributos necesarios.
 *
 * @author Armenta Baca José María 247641
 */
public class PedidoDirector {

    private PedidoBuilder builder;

    public PedidoDirector(PedidoBuilder builder) {
        this.builder = builder;
    }

    /**
     * Crea un pedido de tipo EXPRESS utilizando el builder configurado.
     *
     * @param paquete El paquete asociado al pedido.
     * @param distancia La distancia para la entrega del pedido.
     * @return El pedido de tipo EXPRESS construido.
     */
    public Pedido crearPedidoExpress(Paquete paquete, double distancia) {
        builder.setTipoServicio(TipoServicio.EXPRESS);
        builder.setPaquete(paquete);
        builder.setDistancia(distancia);
        return builder.build();
    }

    /**
     * Crea un pedido de tipo ESTANDAR utilizando el builder configurado.
     *
     * @param paquete El paquete asociado al pedido.
     * @param distancia La distancia para la entrega del pedido.
     * @return El pedido de tipo ESTANDAR construido.
     */
    public Pedido crearPedidoEstandar(Paquete paquete, double distancia) {
        builder.setTipoServicio(TipoServicio.ESTANDAR);
        builder.setPaquete(paquete);
        builder.setDistancia(distancia);
        return builder.build();
    }
}
