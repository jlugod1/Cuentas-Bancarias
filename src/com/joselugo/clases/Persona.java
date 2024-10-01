package com.joselugo.clases;

public class Persona {
    // Atributos privados para proteger los datos
    private String nombre;
    private int edad;

    // Constructor que inicializa los atributos nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Setter para cambiar el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }

    // Setter para cambiar la edad de la persona
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que muestra la información de la persona en consola
    public void despliegaInformacion() {
        System.out.println("Información personal:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}
