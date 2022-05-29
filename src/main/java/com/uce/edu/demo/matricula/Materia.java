package com.uce.edu.demo.matricula;

public class Materia {

	private String nombreM;
	private int semestre;
	private String aula;
	
	//SET Y GET 
	
	public String getNombre() {
		return nombreM;
	}
	public void setNombre(String nombre) {
		this.nombreM = nombre;
	}
	public Integer getNumeroHoras() {
		return semestre;
	}
	public void setNumeroHoras(Integer numeroHoras) {
		this.semestre = numeroHoras;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	
}
