package com;
import com.*;

	public class Aplicacion {
	    public static void main(String[] args) {
	        TiendaElectronica tienda = new TiendaElectronica();

	        Televisor tv1 = new Televisor("Televisor Sony", 1500.00, 3, 55.0, "4K UHD");
	        Televisor tv2 = new Televisor("Televisor Panasonic", 900.00, 2, 43.0, "Full HD");

	        ComputadoraPortatil laptop1 = new ComputadoraPortatil("Laptop HP", 1100.00, 4, "HP", 8, "HP-8847SN");
	        ComputadoraPortatil laptop2 = new ComputadoraPortatil("Laptop Asus", 1350.00, 1, "Asus", 16, "AS-9971TX");

	        tienda.agregarProducto(tv1);
	        tienda.agregarProducto(tv2);
	        tienda.agregarProducto(laptop1);
	        tienda.agregarProducto(laptop2);

	        System.out.println("\n--- INVENTARIO INICIAL ---");
	        tienda.mostrarTodosLosProductos();

	        System.out.println("\n--- VENTAS ---");
	        tienda.realizarVenta("Televisor Sony"); 
	        tienda.realizarVenta("Laptop Asus");   
	        tienda.realizarVenta("Laptop Asus");
	        tienda.realizarVenta("Smartwatch Xiaomi");

	        System.out.println("\n--- INVENTARIO FINAL ---");
	        tienda.mostrarTodosLosProductos();
	    }
	}

