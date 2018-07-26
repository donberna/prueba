package com.prueba.modelos;


import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "activo")
public class Activo {

	@Id
	ObjectId _id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private String serial;
	private int numeroInternoInventario;
	private double peso;
	private double alto;
	private double largo;
	private double ancho;
	private int valorCompra;
	private Date fechaCompra;
	private Date fechaBaja;
	private char estadoActual;
	private String color;
	
	private Persona persona;
	private Area area;
	
	Activo(){}

	public String get_id() { 
		return _id.toHexString(); 
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public int getNumeroInternoInventario() {
		return numeroInternoInventario;
	}

	public void setNumeroInternoInventario(int numeroInternoInventario) {
		this.numeroInternoInventario = numeroInternoInventario;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public int getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(int valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public char getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(char estadoActual) {
		this.estadoActual = estadoActual;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	public boolean esFechaBajaMayorAFechaCompra() {
		
		if(this.fechaBaja.getTime() > this.fechaCompra.getTime()) {
			return true;
		}
		
		return false;
	}

}
