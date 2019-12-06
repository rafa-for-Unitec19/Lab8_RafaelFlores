/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionTelefono;

/**
 *
 * @author Faith
 */
public class Contacto {
    private String nombre, correo, direccion;
    private int edad, numero;

    public Contacto() {
    }

    public Contacto(String nombre, String correo, String direccion, int edad, int numero) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.edad = edad;
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumero() {
        return numero;
    }
}
