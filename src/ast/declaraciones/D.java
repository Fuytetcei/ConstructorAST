package ast.declaraciones;

public abstract class D {
	public abstract TipoDeclaracion tipo();
	public D decs() {throw new UnsupportedOperationException("decs");}
	public DS dec() {throw new UnsupportedOperationException("dec");}
}
