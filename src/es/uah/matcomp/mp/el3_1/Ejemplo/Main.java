package es.uah.matcomp.mp.el3_1.Ejemplo;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Crear el objeto Persona
        Persona p = new Persona("Sira Coulon", 22);

        // Convertir el objeto a JSON (String)
        String json = gson.toJson(p);


        System.out.println(json);

        // Guardar el JSON en un archivo
        try (FileWriter writer = new FileWriter("persona.json")) {
            writer.write(json);
            System.out.println("JSON guardado en persona.json");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo JSON:");
            e.printStackTrace();
        }
    }
}
