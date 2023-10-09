package com.cibertec.proyecto;

public class Producto {

	
	int  codigoproducto;
	String descripcion;
    double precio;
	public Producto(int codigoproducto, String descripcion, double precio) {
		
		this.codigoproducto = codigoproducto;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public int getCodigoproducto() {
		return codigoproducto;
	}
	public void setCodigoproducto(int codigoproducto) {
		this.codigoproducto = codigoproducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
   
	
}
