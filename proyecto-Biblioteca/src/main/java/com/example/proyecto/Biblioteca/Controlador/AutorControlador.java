package com.example.proyecto.Biblioteca.Controlador;

import com.example.proyecto.Biblioteca.Modelo.Autor;
import com.example.proyecto.Biblioteca.Servicio.AutorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorControlador {

    @Autowired
    private AutorServicio autorServicio;

    // Obtener un Autor por su ID
    @GetMapping("/{id}")
    public Optional<Autor> getAutorById(@PathVariable Long id) {
        return autorServicio.getAutorById(id);
    }

    // Obtener todos los Autores
    @GetMapping("/todos")
    public List<Autor> getAllAutores() {
        return autorServicio.getAllAutores();
    }

    // Crear un Autor
    @PostMapping("/guardar")
    public ResponseEntity<String> saveAutor(@RequestBody Autor autor) {
        Autor savedAutor = autorServicio.saveAutor(autor);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Autor registrado con éxito. ID: " + savedAutor.getIdAutor());
    }

    // Actualizar nombre del Autor por ID
    @PutMapping("/{id}/actualizarNombre")
    public void updateAutorNombre(@PathVariable Long id, @RequestParam String nombre) {
        autorServicio.updateAutorNombre(id, nombre);
    }

    // Eliminar Autor por ID
    @DeleteMapping("/eliminar/{id}")
    public void deleteAutor(@PathVariable Long id) {
        autorServicio.deleteAutor(id);
    }
}
