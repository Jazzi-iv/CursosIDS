package com.inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inventario.model.Product;
import com.inventario.repository.ProductRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public Product guardarProducto(Product producto) {
        return productRepository.save(producto);
    }
    
    public Optional<Product> obtenerProductoPorId(Long id) {
        return productRepository.findById(id);
    }
    
    public List<Product> obtenerTodosLosProductos() {
        return productRepository.findAll();
    }
    
    public Product actualizarProducto(Long id, Product producto) {
        producto.setId(id);
        return productRepository.save(producto);
    }
    
    public void eliminarProducto(Long id) {
        productRepository.deleteById(id);
    }
}
