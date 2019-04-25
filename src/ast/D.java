package ast;

public abstract class D {
	public abstract TipoDeclaracion tipo();
	public String id() {throw new UnsupportedOperationException("id");}
	public D declaraciones() {throw new UnsupportedOperationException("declaraciones");}
	public D0 declaracion() {throw new UnsupportedOperationException("declaracion");}
}
