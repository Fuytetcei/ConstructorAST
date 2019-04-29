package ast;

import ast.asignaciones.I;
import ast.declaraciones.D;

public abstract class S {
	public D declaraciones() {throw new UnsupportedOperationException("declaraciones");}
	public I instrucciones() {throw new UnsupportedOperationException("instrucciones");}
	public abstract TipoS tipo();
}
