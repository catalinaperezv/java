package com;

import java.util.ArrayList;

public class TiendaElectronica {
    
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    public TiendaElectronica() {
        listaDeProductos = new ArrayList<>();
    }

    
    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

   
    public void mostrarTodosLosProductos() {
        if (listaDeProductos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        System.out.println("=== Inventario ===");
        for (ProductoElectrodomestico producto : listaDeProductos) {
            producto.mostrarInformacion();
            System.out.println("---------------------");
        }
    }

    public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarVenta(String nombreProducto) {
        ProductoElectrodomestico producto = buscarProductoPorNombre(nombreProducto);

        if (producto == null) {
            System.out.println("Producto no encontrado: " + nombreProducto);
            return;
        }

        if (producto.getCantidadDisponible() > 0) {
            producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
            System.out.println("Venta realizada. Producto vendido: " + nombreProducto);
        } else {
            System.out.println("Producto agotado: " + nombreProducto);
        }
    }
}

