/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Pedido;

import com.mycompany.Servicio.TipoServicio;
import com.mycompany.MedioTransporte.Transporte;
import com.mycompany.Paquete.Paquete;
import com.mycompany.Paquete.TipoPaquete;

/**
 * Clase que representa un pedido que incluye un tipo de servicio, un paquete,
 * la distancia de entrega y el medio de transporte utilizado.
 *
 * @author Armenta Baca José María 247641
 */
public class Pedido {

    private TipoServicio tipoServicio;
    private Paquete paquete;
    private double distancia;
    private Transporte transporte;

    public Pedido() {
    }

    /**
     * Método para asignar el transporte al pedido.
     *
     * @param transporte El medio de transporte a asignar.
     */
    public void asignarTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    /**
     * Calcula el tiempo de entrega basado en la distancia y el transporte
     * asignado.
     *
     * @return El tiempo estimado de entrega.
     */
    public double calcularTiempoEntrega() {
        return transporte.calcularTiempoEntrega(this.distancia);
    }

    /**
     * Getter para obtener el tipo de paquete del pedido.
     *
     * @return El tipo de paquete asociado al pedido.
     */
    public TipoPaquete getTipoPaquete() {
        return paquete.getTipo();
    }

    /**
     * Getter para obtener la distancia de entrega.
     *
     * @return La distancia del pedido.
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Setter para establecer la distancia de entrega.
     *
     * @param distancia La distancia a establecer.
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * Getter para obtener el tipo de servicio del pedido.
     *
     * @return El tipo de servicio asociado al pedido.
     */
    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    /**
     * Setter para establecer el tipo de servicio del pedido.
     *
     * @param tipoServicio El tipo de servicio a establecer.
     */
    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    /**
     * Getter para obtener el paquete asociado al pedido.
     *
     * @return El paquete del pedido.
     */
    public Paquete getPaquete() {
        return paquete;
    }

    /**
     * Setter para establecer el paquete del pedido.
     *
     * @param paquete El paquete a establecer.
     */
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    /**
     * Getter para obtener el transporte asignado al pedido.
     *
     * @return El medio de transporte del pedido.
     */
    public Transporte getTransporte() {
        return transporte;
    }

}
