package com.mycompany.coperativaahorrocredito;

import java.util.Scanner;

public class Cuenta {

    // Persona objPersona = new Persona();
    Scanner licet = new Scanner(System.in);

    public int numeroCuenta = 1000;
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
            System.out.println("Ha seleccionado: " + this.tipoCuenta);
        } else {
            this.tipoCuenta = tipoCuenta.CORRIENTE;
            System.out.println("Ha seleccionado: " + this.tipoCuenta);
        }
        String opcionSaldo;

        System.out.print("ABRIR CUENTA CON SALDO? Si/No: ");
        opcionSaldo = licet.next();

        if (opcionSaldo.equalsIgnoreCase("si")) {
            depositar();
            System.out.println("Cuenta creada exitosamente\n");
            contadorCuenta();

        } else {
            System.out.println("Cuenta creada exitosamente\n");
            contadorCuenta();
        }

    }
    
    
    public int contadorCuenta(){
        // this.numeroCuenta++;
        return this.numeroCuenta++;
    }
    
    public String validarTransacciones(boolean estado){
        if (estado){
            return "Operacion realizada existosamente";
        } else {
            return "ERROR: Operacion fallida";
        }
    }
    
    // Depositar

    public void depositar() {

        double monto = 0d;

        System.out.println("\n----------DEPOSITAR----------");
        System.out.print("Ingrese el monto a depositar: ");
        monto = licet.nextDouble();
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Saldo actual: " + this.saldo);
            System.out.println(validarTransacciones(true));
        } else {
            System.out.println("El monto debe ser mayor a cero");
            System.out.println(validarTransacciones(false));
            
        }
    }
    // Retirar
    
    public void retirar() {
        double monto = 0d;
        System.out.println("\n----------RETIRAR----------");
        System.out.print("Ingrese el monto a retirar: ");
        monto = licet.nextDouble();
        if (monto > 0) {
            if (monto <= this.saldo) {
                saldo = saldo - monto;
                System.out.println("Saldo actual: " + this.saldo);
                System.out.println(validarTransacciones(true));
            } else {
                System.out.println("Saldo insuficiente, no tienes dineroooooooooo");
                System.out.println(validarTransacciones(false));
            }
        } else {
            System.out.println("El monto debe ser mayor a cero");
            System.out.println(validarTransacciones(false));
        }
 
    }

    //Tranferir
    public void transferir(Cuenta origen, Cuenta destino) {
        double monto = 0d;
        System.out.println("\n----------TRANSFERIR----------");
        System.out.print("Ingrese el monto a transferir: ");
        monto = licet.nextDouble();
        if (monto > 0) {
            origen.saldo = origen.saldo - monto;
            destino.saldo = destino.saldo + monto;
            System.out.println("Saldo actual: " + origen.saldo);
            System.out.println(validarTransacciones(true));
            
        } else {
            System.out.println(validarTransacciones(false));
        }
       
    }

    public void imprimir(Persona titular) {
        System.out.println("--------DATOS DE LA CUENTA " + titular.nombre + "--------");
        System.out.println("El numero de cuenta es: " + this.numeroCuenta);
        System.out.println("Su saldo es de: " + saldo);
        System.out.println("Titular: " + titular.nombre);
        System.out.println("Tipo de cuenta: " + this.tipoCuenta);
        System.out.println("------------------------------------");
    }
    public void cerrarCuenta() {
        System.out.print("¿Esta seguro de que desea eliminar su cuenta? si/no: ");
        String ElimCuenta = licet.next();
        if(ElimCuenta.equalsIgnoreCase("si")){
            System.out.println("Su cuenta se ha cerrado con exito");
        }else{
            System.out.println("ha cancelado la eliminacion de la cuenta, bonito dia");
        }
    }
}
