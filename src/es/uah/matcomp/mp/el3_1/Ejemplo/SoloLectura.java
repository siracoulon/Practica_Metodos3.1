package es.uah.matcomp.mp.el3_1.Ejemplo;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class SoloLectura {
    public static void main(String[] args) {
        String rutaArchivo = "usuario.json";
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(rutaArchivo)) {
            Usuario usuario = gson.fromJson(reader, Usuario.class);
            System.out.println("Usuario cargado:");
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Edad: " + usuario.edad);
            System.out.println("Correo: " + usuario.correo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



