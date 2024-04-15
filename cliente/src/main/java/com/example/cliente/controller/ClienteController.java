package com.example.cliente.controller;

import com.example.cliente.entity.Cliente;
import com.example.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @GetMapping()
    public ResponseEntity<List<Cliente>> list(){
        return ResponseEntity.ok().body(clienteService.listar());
    }
    @PostMapping()
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.guardar(cliente));
    }
    @PutMapping()
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.actualizar(cliente));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listarPorId(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(clienteService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){ clienteService.eliminarPorId(id);
        return "Eliminado Correctamente :3";
    }
}
