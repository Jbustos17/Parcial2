package com.example.proyecto.Biblioteca.Servicio;

import com.example.proyecto.Biblioteca.Modelo.Autor;
import com.example.proyecto.Biblioteca.Repositorio.AutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorServicioImpl implements AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Override
    public Optional<Autor> getAutorById(Long id) {
        return autorRepositorio.findById(id);
    }

    @Override
    public List<Autor> getAllAutores() {
        return autorRepositorio.findAll();
    }

    @Override
    public List<Autor> getAutoresByNacionalidad(String nacionalidad) {
        return autorRepositorio.findByNacionalidad(nacionalidad);
    }

    @Override
    public List<Autor> getAutoresByAnioNacimiento(Integer anioNacimiento) {
        return autorRepositorio.findByAnioNacimiento(anioNacimiento);
    }

    @Override
    public Autor saveAutor(Autor autor) {
        return autorRepositorio.save(autor);
    }

    @Override
    public void deleteAutor(Long id) {
        autorRepositorio.deleteById(id);
    }

    @Override
    public void updateAutorNombre(Long id, String nombre) {

    }
}
