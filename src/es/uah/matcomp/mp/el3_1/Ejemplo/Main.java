package es.uah.matcomp.mp.el3_1.Ejemplo;
import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Persona p = new Persona("Sira Coulon",22);
        String json = gson.toJson(p); /** Este comando permite transformar una instancia de un objeto, en este caso ‘p’, en una cadena de texto o
         String que contiene su correspondiente en JSON. */
        System.out.println(json);
    }
}
