package com.cibertec.proyecto;

public class Vendedor {

	int codigovendedor,categoria;
   String nombres,apellidos,dni;
public int getCodigovendedor() {
	return codigovendedor;
}
public void setCodigovendedor(int codigovendedor) {
	this.codigovendedor = codigovendedor;
}
public int getCategoria() {
	return categoria;
}
public void setCategoria(int categoria) {
	this.categoria = categoria;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public Vendedor(int codigovendedor, int categoria, String nombres, String apellidos, String dni) {
	
	this.codigovendedor = codigovendedor;
	this.categoria = categoria;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.dni = dni;
}	

	
}
