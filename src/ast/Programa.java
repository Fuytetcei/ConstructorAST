package ast;

import ast.asignaciones.I;
import ast.declaraciones.D;

public class Programa extends S {
	private D declaraciones;
	private I instrucciones;

	public Programa(D declaraciones, I instrucciones) {
		this.declaraciones = declaraciones;
		this.instrucciones = instrucciones;
	}
	public D declaraciones() {return this.declaraciones;}
	public I instrucciones() {return this.instrucciones;}
	public TipoS tipo() { return TipoS.PROGRAMA;}
}
