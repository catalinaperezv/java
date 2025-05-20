package com;

public class Televisor extends ProductoElectrodomestico {
	    private double tamañoPantalla;
	    private String resolucion;
	    
	    public Televisor(String nombre, double precio, int cantidadDisponible, double tamañoPantalla, String resolucion) {
	        super(nombre, precio, cantidadDisponible);
	        this.tamañoPantalla = tamañoPantalla;
	        this.resolucion = resolucion;
	    }

	    public double getTamañoPantalla() {
	        return tamañoPantalla;
	    }

	    public void setTamañoPantalla(double tamañoPantalla) {
	        this.tamañoPantalla = tamañoPantalla;
	    }

	    public String getResolucion() {
	        return resolucion;
	    }

	    public void setResolucion(String resolucion) {
	        this.resolucion = resolucion;
	    }

	    @Override
	    public void mostrarInformacion() {
	        super.mostrarInformacion();
	        System.out.println("Tamaño de Pantalla: " + tamañoPantalla + " pulgadas");
	        System.out.println("Resolución: " + resolucion);
	}


}
