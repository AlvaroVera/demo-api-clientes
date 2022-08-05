package com.example.demo.services.impl;

import com.example.demo.adapter.ClienteAdapter;
import com.example.demo.models.dto.ClienteDto;
import com.example.demo.models.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    @Transactional(readOnly = true)
    public ClienteDto obtenerClientePorId(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.map(ClienteAdapter::convertirClienteAClienteDto).orElse(null);
    }

    @Override
    @Transactional
    public ClienteDto actualizarCliente(ClienteDto cliente, Integer id) {
        Optional<Cliente> cliente1 = clienteRepository.findById(id);
        if (cliente1.isPresent()){
            cliente1.get().setApellidos(cliente.getApellidos());
            cliente1.get().setNombres(cliente.getNombres());
            cliente1.get().setTipoDocumento(cliente.getTipoDocumento());
            cliente1.get().setNumeroDocumento(cliente.getNumeroDocumento());

            clienteRepository.save(cliente1.get());
            return cliente;
        } else {
            return null;
        }

    }
}
