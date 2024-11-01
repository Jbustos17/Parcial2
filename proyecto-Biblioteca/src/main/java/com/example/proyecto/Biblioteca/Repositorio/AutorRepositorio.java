package com.example.proyecto.Biblioteca.Repositorio;

import com.example.proyecto.Biblioteca.Modelo.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

    public interface AutorRepositorio extends JpaRepository<Autor, Long> {

        // Obtener autores por nacionalidad
        @Query("SELECT a FROM Autor a WHERE a.nacionalidad = :nacionalidad")
        List<Autor> findByNacionalidad(@Param("nacionalidad") String nacionalidad);

        // Buscar autores por año de nacimiento
        @Query("SELECT a FROM Autor a WHERE a.anioNacimiento = :anioNacimiento")
        List<Autor> findByAnioNacimiento(@Param("anioNacimiento") Integer anioNacimiento);
    }


