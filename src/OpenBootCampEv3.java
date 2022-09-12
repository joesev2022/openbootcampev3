import models.Persona;

import java.util.Scanner;

public class OpenBootCampEv3 {
    public static void main(String[] args) {
        int edad, telefono;
        String nombre;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Registro de persona --------------");
        System.out.println("Ingrese edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese nombre: ");
        nombre = sc.next();
        System.out.println("Ingrese telefono: ");
        telefono = sc.nextInt();
        //Creando objeto de la clase persona
        Persona unaPersona = new Persona();
        unaPersona.setEdad(edad);
        unaPersona.setNombre(nombre);
        unaPersona.setTelefono(telefono);
        System.out.println("Mostrando datos --------------");
        System.out.println("Edad: " + unaPersona.getEdad());
        System.out.println("Nombre: " + unaPersona.getNombre());
        System.out.println("Telefono: " + unaPersona.getTelefono());
    }
}
