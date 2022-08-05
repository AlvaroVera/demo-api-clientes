package com.example.demo.adapter;

import com.example.demo.models.dto.ClienteDto;
import com.example.demo.models.entity.Cliente;

public class ClienteAdapter {
    public static ClienteDto convertirClienteAClienteDto(Cliente cliente) {
        return ClienteDto.builder()
                .id(cliente.getId())
                .nombres(cliente.getNombres())
                .apellidos(cliente.getApellidos())
                .tipoDocumento(cliente.getTipoDocumento())
                .numeroDocumento(cliente.getNumeroDocumento()).build();
    }
}
