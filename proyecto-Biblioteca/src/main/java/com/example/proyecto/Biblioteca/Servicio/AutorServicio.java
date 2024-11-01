package com.example.proyecto.Biblioteca.Servicio;

import com.example.proyecto.Biblioteca.Modelo.Autor;
import java.util.List;
import java.util.Optional;

public interface AutorServicio {

    Optional<Autor> getAutorById(Long id);

    List<Autor> getAllAutores();

    List<Autor> getAutoresByNacionalidad(String nacionalidad);

    List<Autor> getAutoresByAnioNacimiento(Integer anioNacimiento);

    Autor saveAutor(Autor autor);

    void deleteAutor(Long id);

    void updateAutorNombre(Long id, String nombre);
}
