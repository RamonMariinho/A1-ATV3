package com.example.carrental.controller;

import com.example.carrental.model.Cliente;
import com.example.carrental.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<?> cadastrarCliente(@Valid @RequestBody Cliente cliente) {
        if (clienteRepository.existsByCpf(cliente.getCpf())) {
            return ResponseEntity.badRequest().body("Cliente com este CPF já está cadastrado.");
        }
        Cliente salvo = clienteRepository.save(cliente);
        return ResponseEntity.ok(salvo);
    }
}
