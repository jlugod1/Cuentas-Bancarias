package com.joselugo.clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    private Persona titular; // Titular de la cuenta (instancia de Persona)
    private int numeroCuenta; // Número de cuenta de 6 dígitos

    // Lista estática para almacenar todas las cuentas creadas
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    // Constructor que inicializa el saldo, titular, y genera un número de cuenta aleatorio
    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = generarNumeroCuenta(); // Número de cuenta aleatorio
        listaDeCuentasBancarias.add(this); // Agrega la cuenta a la lista de cuentas bancarias
    }

    // Genera un número de cuenta aleatorio de 6 dígitos
    private int generarNumeroCuenta() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // Número aleatorio de 6 dígitos
    }

    // Getters y setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    // Métodos para depositar y retirar dinero de la cuenta
    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Depósito exitoso. Nuevo saldo: " + this.saldo);
    }

    public void retirar(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    // Muestra la información de la cuenta
    public void despliegaInformacion() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Titular: " + this.titular.getNombre());
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Edad del titular: " + this.titular.getEdad());
    }

    // Método estático para imprimir la información de todas las cuentas
    public static void imprimeInformacionDeTodasLasCuentas() {
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
            System.out.println("-------------------------------");
        }
    }
}