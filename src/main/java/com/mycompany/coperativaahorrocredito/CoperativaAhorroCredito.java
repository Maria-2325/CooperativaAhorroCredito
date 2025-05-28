package com.mycompany.coperativaahorrocredito;

import java.util.Scanner;

public class CoperativaAhorroCredito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona objPersona1 = new Persona();
        Persona objPersona2 = new Persona();

        Cuenta objCuenta1 = new Cuenta();
        Cuenta objCuenta2 = new Cuenta();

        //Persona 1
        //Registro de la Persona
        objPersona1.registrarPersona(objCuenta1);
        objPersona2.registrarPersona(objCuenta2);
        objCuenta2.numeroCuenta++;
        
        //Imprimir datos de la cuenta de la Persona 
        objCuenta1.imprimir(objPersona1);

        //Depositar, Tranferir y Retirar
        System.out.println("---Menu de operaciones bancarias-------");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Transferir");
        System.out.println("4. Imprimir informacion titular/cuenta");
        System.out.println("5. Cerrar cuenta");
        System.out.println("6. Salir");
        System.out.print("Ingrese una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: // Depositar
                objCuenta1.depositar();
                objPersona1.imprimir();
                objCuenta1.imprimir(objPersona1);
                break;
            case 2: // Retirar
                objCuenta1.retirar();
                objPersona1.imprimir();
                objCuenta1.imprimir(objPersona1);
                break;
            case 3: // Transferir
                objCuenta1.transferir(objCuenta1, objCuenta2);
                System.out.println("------INFORMACION DE LA CUENTA ORIGEN------");
                
                objPersona1.imprimir();
                objCuenta1.imprimir(objPersona1);
                
                System.out.println("---INFORMACION DE LA CUENTA DESTINO---");
                objPersona2.imprimir();
                objCuenta2.imprimir(objPersona2);
                break;
            case 4: // Imprimir informacion de la cuenta y titular
                System.out.println("---INFORMACION DE LA CUENTA---");
                objPersona1.imprimir();
                objCuenta1.imprimir(objPersona1);
                break;
            case 5: // Cerrar cuenta
                objCuenta1.cerrarCuenta();
                break;
            case 6: // Salir
                System.out.println("Hasta la proxima...baby");
                break;
            default:
                throw new AssertionError();
        }
      
    
}
}