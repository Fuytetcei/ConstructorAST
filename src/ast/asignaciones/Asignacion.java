package ast.asignaciones;

import ast.expresiones.E;

public class Asignacion extends IS {
	private String id;
	private E exp;

	public Asignacion(String id, E exp) {
		this.id = id;
		this.exp = exp;
	}
	public String id() {return this.id;}
	public E exp() {return this.exp;}
	public String toString() {return "Asignacion{" + this.id.toString() + ", " + this.exp.toString() + "}";}
}
