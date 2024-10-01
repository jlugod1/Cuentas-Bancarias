package com.joselugo;

import com.joselugo.clases.CuentaBancaria;
import com.joselugo.clases.Persona;

public class Aplicacion {
    public static void main(String[] args) {
        // Crear instancias de la clase Persona
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Ana", 25);
        Persona persona3 = new Persona("Carlos", 40);

        // Crear instancias de la clase CuentaBancaria asociadas con las personas
        CuentaBancaria cuenta1 = new CuentaBancaria(5000.0, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(10000.0, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(7500.0, persona3);

        // Realizar algunas operaciones de depósito y retiro
        cuenta1.depositar(2000.0);
        cuenta2.retirar(3000.0);
        cuenta3.depositar(1000.0);

        // Imprimir el saldo actual de cada cuenta bancaria
        System.out.println("Información de las cuentas después de las operaciones:");
        cuenta1.despliegaInformacion();
        cuenta2.despliegaInformacion();
        cuenta3.despliegaInformacion();

        // Imprimir la información de todas las cuentas
        System.out.println("Información de todas las cuentas bancarias:");
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}