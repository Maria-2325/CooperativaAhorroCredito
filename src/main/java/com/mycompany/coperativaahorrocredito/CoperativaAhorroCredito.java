package com.mycompany.coperativaahorrocredito;

public class CoperativaAhorroCredito {

    public static void main(String[] args) {
        Persona objPersona1 = new Persona();
        Persona objPersona2 = new Persona();
        
        Cuenta objCuenta1 = new Cuenta();
        Cuenta objCuenta2 = new Cuenta();
        
        //Persona 1
        //Registro de la Persona
        objPersona1.registrarPersona(objCuenta1);
        
        //Imprimir datos de la Persona 
        objCuenta1.imprimir (objPersona1);
        
        //Depositar, Tranferir y Retirar
        objCuenta1.depositar();
        objCuenta1.transferir(objCuenta1);
        objCuenta1.retirar();
        
        //Imprimir Datos de la cuenta
        objCuenta1.imprimir(objPersona1);
        
        //Cerrar cuenta 
        objCuenta1.cerrarCuenta();
        
        //Persona 2
        //Registro de la Persona
        objPersona2.registrarPersona(objCuenta2);
        
        //Imprimir datos de la Persona
        objCuenta2.imprimir(objPersona2);
        
        //Depositar, Transferir y Retirar
        objCuenta2.depositar();
        objCuenta2.transferir(objCuenta2);
        objCuenta2.retirar();
        
        //Imprimir Datos de la cuenta
        objCuenta2.imprimir(objPersona2);
        
        //Cerrar cuenta
        objCuenta2.cerrarCuenta();
        
    }
}
