package com.example.demo.web;

import com.example.demo.models.dto.ClienteDto;
import com.example.demo.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente/")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping("{id}")
    public ClienteDto obtenerClientePorId(@PathVariable(name = "id") Integer id) {
        return clienteService.obtenerClientePorId(id);
    }

    @PutMapping(path = "{id}")
    public ClienteDto actualizarCliente(@RequestBody ClienteDto clienteDto, @PathVariable(name = "id") Integer id){
        return clienteService.actualizarCliente(clienteDto, id);
    }
}
