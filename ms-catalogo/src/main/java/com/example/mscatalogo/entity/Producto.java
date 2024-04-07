package com.example.mscatalogo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fechaVenta;
    private Integer cantidadProductos;
    private String metodoPago;
    private String nombreCliente;
    private String direccionCliente;
    private String correoCliente;
    private String telefonoCliente;
    private String productoVendido;
    private Integer precioProducto;

    @ManyToOne
    @JoinColumn(name = "catalogo_id")
    private Producto catalogo;
}
