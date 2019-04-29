package ast.asignaciones;

import ast.expresiones.E;

public class ASimple extends IS{
	private String id;
	private E expr;

	public ASimple(String id, E expr) {
		this.id = id;
		this.expr = expr;
	}

	public String id() {return this.id;}
	public E expr() {return this.expr;}
	public TipoAsignacion tipo() {return TipoAsignacion.SIMPLE;}
}
