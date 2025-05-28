package com.mycompany.coperativaahorrocredito;

import java.util.Scanner;

public class Cuenta {

    // Persona objPersona = new Persona();
    Scanner licet = new Scanner(System.in);

    public int numeroCuenta;
    public Double saldo = 0d;
    public String titular;
    public TipoCuenta tipoCuenta;

    // Constructor con atributos iniciales
    public Cuenta(int numeroCuenta, Double saldo, String titular, TipoCuenta tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor vacío
    public Cuenta() {

    }

    // Métodos de la clase Persona
    public void abrirCuenta() {

        int opcion = 0;
        System.out.println("\n-------ABRIR CUENTA------");
        System.out.println("TIPOS DE CUENTAS DISPONIBLES ");
        System.out.println("1. AHORRO");
        System.out.println("2. CORRIENTE");
        System.out.print("INGRESE UNA OPCION: ");
        opcion = licet.nextInt();
        if (opcion == 1) {
            this.tipoCuenta = tipoCuenta.AHORRO;
            System.out.println(this.tipoCuenta);
        } else {
            this.tipoCuenta = tipoCuenta.CORRIENTE;
        }
        String opcionSaldo;

        System.out.print("¿ABRIR CUENTA CON SALDO? Si/No: ");
        opcionSaldo = licet.next();

        if (opcionSaldo.equalsIgnoreCase("si")) {
            depositar();

        } else {
            System.out.println("Cuenta creada exitosamente ");
        }

    }
// Depositar

    public void depositar() {

        double monto = 0d;

        System.out.println("----------DEPOSITAR----------");
        System.out.print("Ingrese el monto a depositar: ");
        monto = licet.nextDouble();
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Deposito exitoso.");
            System.out.println("Saldo actual: " + saldo);
        } else {
            System.out.println("El monto debe ser mayor a cero");
        }
    }
    // Retirar
    
    public void retirar() {
        double monto = 0d;
        System.out.println("----------RETIRAR----------");
        if (monto > 0) {
            if (saldo > 0) {
                saldo = saldo - monto;
                System.out.println("Retiro exitoso. ");
                System.out.println("Saldo actual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("El monto debe ser mayor a cero ");
        }
        System.out.println(" ");
    }

    //Tranferir
    public void transferir(Cuenta destino) {
        double monto = 0d;

        System.out.println("----------TRANSFERIR----------");
        if (monto > 0) {
            if (saldo >= monto) {
                this.saldo = this.saldo - monto;
                destino.saldo = destino.saldo + monto;
                System.out.println("Transferencia exitosa.");
                System.out.println("Saldo actual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("El monto debe ser mayor a cero");
        }
        System.out.println(" ");
    }

    public void imprimir(Persona titular) {
        System.out.println("--------DATOS DE " + titular.nombre + "--------");
        System.out.println("El numero de cuenta es: " + numeroCuenta);
        System.out.println("Su saldo es de: " + saldo);
        System.out.println("Titular: " + titular.nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("------------------------------------");
    }
    public void cerrarCuenta() {
        System.out.print("¿Esta seguro de que desea eliminar su cuenta? si/no: ");
        String ElimCuenta = licet.nextLine();
        if(ElimCuenta.equalsIgnoreCase("si")){
            System.out.println("Su cuenta se ha cerrado con exito");
        }else{
            System.out.println("ha cancelado la eliminacion de la cuenta, bonito dia");
        }
    }
}
