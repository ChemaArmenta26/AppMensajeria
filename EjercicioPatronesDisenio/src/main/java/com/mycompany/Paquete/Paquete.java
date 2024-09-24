/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Paquete;

/**
 * Clase que representa un paquete, el cual tiene un tipo asociado. Proporciona
 * métodos para obtener el costo adicional basado en el tipo de paquete.
 *
 * @author Armenta Baca José María 247641
 */
public class Paquete {

    private TipoPaquete tipo;

    public Paquete() {
    }

    /**
     * Constructor que inicializa el paquete con un tipo específico.
     *
     * @param tipo El tipo de paquete a asignar.
     */
    public Paquete(TipoPaquete tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve el costo adicional según el tipo de paquete.
     *
     * @return El costo adicional asociado al tipo de paquete.
     */
    public double getCostoAdicional() {
        switch (tipo) {
            case SOBRE:
                return 5.0;
            case CAJA_PEQUENA:
                return 10.0;
            case CAJA_MEDIANA:
                return 20.0;
            case CAJA_GRANDE:
                return 50.0;
            default:
                return 0.0;
        }
    }

    /**
     * Getter para el tipo de paquete.
     *
     * @return El tipo de paquete.
     */
    public TipoPaquete getTipo() {
        return tipo;
    }
}
