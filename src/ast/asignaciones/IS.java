package ast.asignaciones;

import ast.expresiones.E;

public abstract class IS {
	public String id() {throw new UnsupportedOperationException("id");}
	public E expr() {throw new UnsupportedOperationException("expr");}
	public abstract TipoAsignacion tipo();
}
