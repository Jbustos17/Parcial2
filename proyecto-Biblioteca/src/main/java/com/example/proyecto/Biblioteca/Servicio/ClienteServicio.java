package com.example.proyecto.Biblioteca.Servicio;

import com.example.proyecto.Biblioteca.Modelo.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteServicio {
    Optional<Cliente> getClienteById(Long id);

    List<Cliente> getAllClientes();

    List<Cliente> getClientesByApellido(String apellido);

    List<Cliente> getClientesByEmail(String email);

    Cliente saveCliente(Cliente cliente);

    void deleteCliente(Long id);

    void updateClienteNombre(Long id, String nombre);
}
