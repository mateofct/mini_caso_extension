package controlador;

import java.util.ArrayList;
import modelo.Biblioteca;
import modelo.Libro;
import modelo.Prestamo;
import modelo.Usuario;
import modelo.Rol;
import modelo.GestorDatos;

public class BibliotecaController {

    private Biblioteca biblioteca;
    private GestorDatos gestorDatos;

    public BibliotecaController() {
        this.gestorDatos = new GestorDatos();
        this.biblioteca = gestorDatos.cargarBiblioteca();
    }

    private void sincronizar() {
        gestorDatos.guardarBiblioteca(this.biblioteca);
    }

    public void registrarLibro(String codigo, String titulo, String autor) {
        Libro libro = new Libro(codigo, titulo, autor);
        biblioteca.agregarLibro(libro);
        sincronizar();
    }

    public void registrarUsuario(String id, String nombre, String correo, Rol rol) {
        Usuario usuario = new Usuario(id, nombre, correo, rol);
        biblioteca.agregarUsuario(usuario);
        sincronizar();
    }

    public void prestarLibro(String idUsuario, String codigoLibro) {
        biblioteca.registrarPrestamo(idUsuario, codigoLibro);
        sincronizar();
    }

    public void devolverLibro(String codigoLibro) {
        biblioteca.devolverLibro(codigoLibro);
        sincronizar();
    }

    public ArrayList<Libro> obtenerLibros() {
        return biblioteca.listarLibros();
    }
    public ArrayList<Usuario> obtenerUsuarios() {
        return biblioteca.listarUsuarios();
    }
    public ArrayList<Prestamo> obtenerPrestamosActivos() {
        return biblioteca.listarPrestamosActivos();
    }
}