package com.mycompany.ejerciciopatronesdisenio;

import com.mycompany.ChainTransporte.ManejadorAuto;
import com.mycompany.ChainTransporte.ManejadorBicicleta;
import com.mycompany.ChainTransporte.ManejadorDron;
import com.mycompany.ChainTransporte.ManejadorMoto;
import com.mycompany.ChainTransporte.ManejadorTransporte;
import com.mycompany.MedioTransporte.Transporte;
import com.mycompany.Paquete.Paquete;
import com.mycompany.Paquete.TipoPaquete;
import com.mycompany.Pedido.Pedido;
import com.mycompany.PedidoBuilder.PedidoBaseBuilder;
import com.mycompany.PedidoBuilder.PedidoBuilder;
import com.mycompany.PedidoBuilder.PedidoDirector;
import com.mycompany.Strategy.CalculadorCosto;
import com.mycompany.Strategy.CalculadorCostoEstandar;
import com.mycompany.Strategy.CalculadorCostoExpress;
import java.util.Scanner;

public class EjercicioPatronesDisenio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PedidoBuilder builder = new PedidoBaseBuilder();
        PedidoDirector director = new PedidoDirector(builder);
        Pedido pedido = new Pedido();

        // Menú interactivo
        System.out.println("Seleccione el tipo de servicio:");
        System.out.println("1. Servicio Estandar");
        System.out.println("2. Servicio Express");
        int tipoServicio = scanner.nextInt();
        System.out.println();

        System.out.println("Seleccione el tipo de paquete:");
        System.out.println("1. Sobre");
        System.out.println("2. Caja pequeña");
        System.out.println("3. Caja mediana");
        System.out.println("4. Caja grande");
        int tipoPaquete = scanner.nextInt();
        System.out.println();

        Paquete paqueteSeleccionado; // Variable para el paquete seleccionado

        // Seleccionar el paquete basado en la opción del usuario
        switch (tipoPaquete) {
            case 1:
                paqueteSeleccionado = new Paquete(TipoPaquete.SOBRE);
                break;
            case 2:
                paqueteSeleccionado = new Paquete(TipoPaquete.CAJA_PEQUENA);
                break;
            case 3:
                paqueteSeleccionado = new Paquete(TipoPaquete.CAJA_MEDIANA);
                break;
            case 4:
                paqueteSeleccionado = new Paquete(TipoPaquete.CAJA_GRANDE);
                break;
            default:
                System.out.println("Opción no válida. Se seleccionará paquete pequeño por defecto.");
                paqueteSeleccionado = new Paquete(TipoPaquete.CAJA_PEQUENA);
                break;
        }
        System.out.print("Ingrese la distancia del pedido (en km): ");
        double distancia = scanner.nextDouble();

        if (tipoServicio == 1) {
            pedido = director.crearPedidoEstandar(paqueteSeleccionado, distancia);
        } else {
            pedido = director.crearPedidoExpress(paqueteSeleccionado, distancia);
        }

        ManejadorTransporte manejadorMoto = new ManejadorMoto();
        ManejadorTransporte manejadorDron = new ManejadorDron();
        ManejadorTransporte manejadorBicicleta = new ManejadorBicicleta();
        ManejadorTransporte manejadorAuto = new ManejadorAuto();

        manejadorDron.setNext(manejadorBicicleta);
        manejadorBicicleta.setNext(manejadorMoto);
        manejadorMoto.setNext(manejadorAuto);

        Transporte transporteSeleccionado = manejadorDron.manejar(pedido);

        if (transporteSeleccionado != null) {
            pedido.asignarTransporte(transporteSeleccionado);
        } else {
            System.out.println("No se pudo determinar un medio de transporte para el pedido.");
        }

        double tiempoEstimado = pedido.calcularTiempoEntrega();

        // Crear la estrategia de cálculo de costo
        CalculadorCosto calculadorCosto;
        if (tipoServicio == 1) {
            calculadorCosto = new CalculadorCostoEstandar();
        } else {
            calculadorCosto = new CalculadorCostoExpress();
        }

        // Calcular el costo usando la estrategia
        double costo = calculadorCosto.calcular(pedido);

        System.out.print("¿Desea ver el resultado en dólares? (s/n): ");
        char verEnDolares = scanner.next().charAt(0);

        // Mostrar resultado
        if (verEnDolares == 's' || verEnDolares == 'S') {
            costo = costo / 20;
        }
        
        String medioTransporte = transporteSeleccionado.toString(); // Obtener el nombre de la clase del medio de transporte
        String tiempoEstimadoStr;
        
        if (tiempoEstimado < 1) {
            // Convertir a minutos
            tiempoEstimado *= 60;
            tiempoEstimadoStr = String.format("%.0f minutos", tiempoEstimado);
        } else {
            tiempoEstimadoStr = String.format("%.2f horas", tiempoEstimado);
        }
        
        System.out.printf("El costo del servicio es de %.2f, se entregará en %s en un tiempo aproximado de %s.\n", costo, medioTransporte, tiempoEstimadoStr);

        scanner.close();
    }

}
