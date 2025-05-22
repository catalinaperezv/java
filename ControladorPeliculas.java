package com.catalina.controladores;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/peliculas")
public class ControladorPeliculas {

    private static HashMap<String, String> listaPeliculas = new HashMap<>();

    public ControladorPeliculas() {
        listaPeliculas.put("Winnie the Pooh", "Don Hall");
        listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
        listaPeliculas.put("Tarzán", "Kevin Lima");
        listaPeliculas.put("Mulán", "Barry Cook");
        listaPeliculas.put("Oliver", "Kevin Lima");
        listaPeliculas.put("Big Hero 6", "Don Hall");
    }

    public static class Pelicula {
        private String nombre;
        private String director;

        public Pelicula(String nombre, String director) {
            this.nombre = nombre;
            this.director = director;
        }
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public String getDirector() { return director; }
        public void setDirector(String director) { this.director = director; }
    }

    // Devuelve todas las películas como lista de objetos JSON
    @GetMapping
    public List<Pelicula> obtenerTodasLasPeliculas() {
        return listaPeliculas.entrySet()
                .stream()
                .map(entry -> new Pelicula(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }
    @GetMapping("/{nombre}")
    public String obtenerPeliculaPorNombre(@PathVariable String nombre) {
        if (listaPeliculas.containsKey(nombre)) {
            return nombre + " fue dirigida por " + listaPeliculas.get(nombre);
        } else {
            return "La película no se encuentra en nuestra lista.";
        }
    }

    @GetMapping("/director/{nombre}")
    public String obtenerPeliculasPorDirector(@PathVariable String nombre) {
        String resultado = listaPeliculas.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equalsIgnoreCase(nombre))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));

        if (resultado.isEmpty()) {
            return "El director no está en esta lista.";
        } else {
            return "Películas dirigidas por " + nombre + ": " + resultado;
        }
    }
}
