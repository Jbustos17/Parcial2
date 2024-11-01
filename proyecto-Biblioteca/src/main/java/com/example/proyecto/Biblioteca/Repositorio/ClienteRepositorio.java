package com.example.proyecto.Biblioteca.Repositorio;

import com.example.proyecto.Biblioteca.Modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

    // Buscar clientes por apellido
    @Query("SELECT c FROM Cliente c WHERE c.apellido LIKE %:apellido%")
    List<Cliente> findByApellido(@Param("apellido") String apellido);

    // Buscar clientes por email
    @Query("SELECT c FROM Cliente c WHERE c.email = :email")
    List<Cliente> findByEmail(@Param("email") String email);
}


