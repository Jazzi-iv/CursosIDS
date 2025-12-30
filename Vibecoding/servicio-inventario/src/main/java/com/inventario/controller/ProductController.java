package com.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.inventario.model.Product;
import com.inventario.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductController 
{
    @Autowired
    private ProductService productService;
    
    @PostMapping
    public ResponseEntity<Product> crearProducto(@Valid @RequestBody Product producto) {
        if (producto.getName() == null || producto.getName().trim().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        
        Product productoCreado = productService.guardarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoCreado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> obtenerProducto(@PathVariable Long id) {
        return productService.obtenerProductoPorId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping
    public ResponseEntity<List<Product>> obtenerTodos() {
        return ResponseEntity.ok(productService.obtenerTodosLosProductos());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Product> actualizarProducto(@PathVariable Long id, @Valid @RequestBody Product producto) {
        Product actualizado = productService.actualizarProducto(id, producto);
        return ResponseEntity.ok(actualizado);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        productService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }
}
