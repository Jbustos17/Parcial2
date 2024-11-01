package com.example.proyecto.Biblioteca.Controlador;

import com.example.proyecto.Biblioteca.Modelo.Prestamo;
import com.example.proyecto.Biblioteca.Servicio.PrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prestamos")
public class PrestamoControlador {

    @Autowired
    private PrestamoServicio prestamoServicio;

    // Obtener un Prestamo por su ID
    @GetMapping("/{id}")
    public Optional<Prestamo> getPrestamoById(@PathVariable Long id) {
        return prestamoServicio.getPrestamoById(id);
    }

    // Obtener todos los Prestamos
    @GetMapping("/todos")
    public List<Prestamo> getAllPrestamos() {
        return prestamoServicio.getAllPrestamos();
    }

    // Crear un Prestamo
    @PostMapping("/guardar")
    public ResponseEntity<String> savePrestamo(@RequestBody Prestamo prestamo) {
        Prestamo savedPrestamo = prestamoServicio.savePrestamo(prestamo);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Préstamo registrado con éxito. ID: " + savedPrestamo.getIdPrestamo());
    }

    // Actualizar fecha de devolución del Prestamo por ID
    @PutMapping("/{id}/actualizarFechaDevolucion")
    public void updatePrestamoFechaDevolucion(@PathVariable Long id, @RequestParam String fechaDevolucion) {
        prestamoServicio.updatePrestamoFechaDevolucion(id, fechaDevolucion);
    }

    // Eliminar Prestamo por ID
    @DeleteMapping("/eliminar/{id}")
    public void deletePrestamo(@PathVariable Long id) {
        prestamoServicio.deletePrestamo(id);
    }
}
