package modelo;

import java.io.*;

public class GestorDatos {
    private static final String RUTA_BIBLIOTECA = "biblioteca.bin";

    public void guardarBiblioteca(Biblioteca biblioteca) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_BIBLIOTECA))) {
            oos.writeObject(biblioteca);
        } catch (IOException e) {
            System.err.println("Error al guardar la biblioteca: " + e.getMessage());
        }
    }

    public Biblioteca cargarBiblioteca() {
        File archivo = new File(RUTA_BIBLIOTECA);
        if (!archivo.exists()) {
            return new Biblioteca();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Biblioteca) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar la biblioteca: " + e.getMessage());
            return new Biblioteca();
        }
    }
}