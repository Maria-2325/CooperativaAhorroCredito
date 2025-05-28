package com.mycompany.coperativaahorrocredito;

import java.util.Scanner;

public class Persona {

    Scanner entrada = new Scanner(System.in);

    // Atributos de la clase Persona
    public String nombre;
    public long identificacion;
    public String correo;

    // Constructor
    public Persona(String nombre, long identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;

    }

    public Persona() {

    }

    // REGISTRAR PERSONA
    public void registrarPersona(Cuenta cuenta) {
        System.out.println("--DATOS DE REGISTRO---");
        System.out.print("DESEA REGISTRARSE SOLO CON SU NOMBRE SI/NO: ");
        String opcionRegistrar = entrada.nextLine();
        if (opcionRegistrar.equalsIgnoreCase("si")) {
            System.out.print("Ingrese sus nombres completos: ");
            this.nombre = entrada.nextLine();
            cuenta.abrirCuenta();
            System.out.println("Para finalizar el proceso complete sus datos, gracias.");
            registrarPersona();
        } else {
            registrarPersona();
            cuenta.abrirCuenta();
        }

    }

    public void registrarPersona() {
        System.out.println("\n");
        System.out.print("Ingrese sus nombres completos: ");
        this.nombre = entrada.nextLine();
        System.out.print("Ingrese su identificacion: ");
        this.identificacion = entrada.nextLong();
        System.out.print("Ingrese su correo electronico: ");
        this.correo = entrada.next();
        System.out.println("Su registro se ha completado exitosamente");
    }

    public void imprimir() {
        System.out.println("\n--------DATOS DEL CLIENTE " + this.nombre + "--------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Identificacion: " + this.identificacion);
        System.out.println("Correo: " + this.correo);
        System.out.println("-----------------------------------");
    }
}
