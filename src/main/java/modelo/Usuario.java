package modelo;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String id;
    private String nombre;
    private String correo;
    private Rol rol;

    public Usuario(String id, String nombre, String correo, Rol rol) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("El identificador del usuario no puede estar vacio.");
        }

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del usuario no puede estar vacio.");
        }

        if (correo == null || correo.isBlank()) {
            throw new IllegalArgumentException("El correo del usuario no puede estar vacio.");
        }

        if (rol == null) {
            throw new IllegalArgumentException("El rol del usuario no puede estar vacio.");
        }
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public Rol getRol() {
        return rol;
    }

    @Override
    public String toString() {

        return "[" + id + "] " + nombre + " - " + correo + " - " + rol;
    }
}
