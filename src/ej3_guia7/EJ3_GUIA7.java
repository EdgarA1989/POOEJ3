/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3_guia7;

import Entidad.Operacion;
import Servicio.ServicioOperacion;

/**
 *
 * @author EANDRADA
 */
public class EJ3_GUIA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioOperacion var = new ServicioOperacion();

        Operacion numeros = var.crearOperacion();
        int suma = var.sumar(numeros);
        int resta = var.restar(numeros);
        int multiplicacion = var.multiplicar(numeros);
        double division = var.dividir(numeros);
        var.mostrar(suma,resta,multiplicacion,division);
    }

}
