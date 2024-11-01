package com.example.proyecto.Biblioteca.Servicio;

import com.example.proyecto.Biblioteca.Modelo.Genero;
import java.util.List;
import java.util.Optional;

public interface GeneroServicio {

    Optional<Genero> getGeneroById(Long id);

    List<Genero> getAllGeneros();

    Optional<Genero> getGeneroByNombre(String nombreGenero);

    Genero saveGenero(Genero genero);

    void deleteGenero(Long id);

    void updateGeneroNombre(Long id, String nombreGenero);
}
