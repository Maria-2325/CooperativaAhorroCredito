package com.mycompany.coperativaahorrocredito;

import java.util.Scanner;

public class Persona {

    Scanner entrada = new Scanner(System.in);

    // Atributos de la clase Persona
    public String nombre;
    public int identificacion;
    public String correo;

    // Constructor
    public Persona(String nombre, int identificacion, String correo) {
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
            registrarPersonaCompleto();
        } else {
            registrarPersonaCompleto();
        }

    }

    public void registrarPersonaCompleto() {
        System.out.print("Ingrese sus nombres completos: ");
        this.nombre = entrada.nextLine();
        System.out.print("Ingrese su identificacion: ");
        this.identificacion = entrada.nextInt();
        System.out.print("Ingrese su correro electronico: ");
        this.correo = entrada.next();
        System.out.println("Su registro se ha completado exitosamente");
    }

    public void imprimir() {
        System.out.println("--------DATOS DE " + nombre + "--------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Correo: " + correo);
        System.out.println("-----------------------------------");
    }
}
