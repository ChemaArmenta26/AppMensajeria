/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PedidoBuilder;

import com.mycompany.Paquete.Paquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.Servicio.TipoServicio;

/**
 * Interfaz que define los métodos necesarios para construir un objeto Pedido.
 * Esta interfaz permitira la creación de pedidos con diferentes
 * configuraciones.
 *
 * @author Armenta Baca José María 247641
 */
public interface PedidoBuilder {

    /**
     * Establece el tipo de servicio para el pedido.
     *
     * @param tipoServicio El tipo de servicio a establecer.
     */
    void setTipoServicio(TipoServicio tipoServicio);

    /**
     * Establece el paquete para el pedido.
     *
     * @param paquete El paquete a establecer.
     */
    void setPaquete(Paquete paquete);

    /**
     * Establece la distancia para el pedido.
     *
     * @param distancia La distancia a establecer.
     */
    void setDistancia(double distancia);

    /**
     * Construye y devuelve el objeto Pedido configurado.
     *
     * @return El pedido construido.
     */
    Pedido build();
}
