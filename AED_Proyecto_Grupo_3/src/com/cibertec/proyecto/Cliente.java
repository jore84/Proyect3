package com.cibertec.proyecto;

public class Cliente {
 
int codigocliente;	
String  nombres,apellidos,dni;
public Cliente(int codigocliente, String nombres, String apellidos, String dni) {
	
	this.codigocliente = codigocliente;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.dni = dni;
	
	
}
public int getCodigocliente() {
	return codigocliente;
}
public void setCodigocliente(int codigocliente) {
	this.codigocliente = codigocliente;
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
	
}
