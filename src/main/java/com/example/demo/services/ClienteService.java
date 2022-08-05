package com.example.demo.services;

import com.example.demo.models.dto.ClienteDto;
import com.example.demo.models.entity.Cliente;

public interface ClienteService {

    ClienteDto obtenerClientePorId(Integer id);

    ClienteDto actualizarCliente(ClienteDto cliente, Integer id);
}
