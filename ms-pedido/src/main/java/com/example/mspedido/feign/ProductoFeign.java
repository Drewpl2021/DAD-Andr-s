package com.example.mspedido.feign;

import com.example.mspedido.dto.ProductoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalogo-service", path = "/producto")
public interface ProductoFeign {
    @GetMapping("/{id}")
    public ResponseEntity<ProductoDto> listarPorId(@PathVariable(required = true) Integer id);
}