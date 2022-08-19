/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class ServicioOperacion {

    public Operacion crearOperacion() {
        Operacion aux = new Operacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        aux.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        aux.setNum2(leer.nextInt());
        return aux;
    }

    public int sumar(Operacion a) {
        int resultado = (a.getNum1() + a.getNum2());
        return resultado;
    }

    public int restar(Operacion a) {
        int resultado = (a.getNum1() - a.getNum2());
        return resultado;
    }

    public int multiplicar(Operacion a) {
        if (a.getNum1() != 0 || a.getNum2() != 0) {
            int resultado = (a.getNum1() * a.getNum2());

            return resultado;
        } else {
            System.out.println("ERROR uno de los numeros es 0");
            return 0;
        }

    }
    public double dividir(Operacion a) {
        
        if (a.getNum2() != 0) {
            int resultado = (a.getNum1() / a.getNum2());

            return resultado;
        } else {
            System.out.println("ERROR uno de los numeros es 0");
            return 0;
        }

    }
    public void mostrar(int a, int b, int c, double d){
        System.out.println("Los resultados de las operaciones son");
        System.out.println("Suma: "+a);
        System.out.println("Resta: "+b);
        System.out.println("Multiplicación: "+c);
        System.out.println("División: "+d);
    }

}
