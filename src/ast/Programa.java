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

	public String toString() {return "Programa {\n\t" +	this.declaraciones.toString() +	",\n\t" + this.instrucciones.toString() + "\n}";}
}

/*
 * 
 * 	Programa {
		DCompuesta{DSimple{num peso}, DSimple{bool pesado}},
		ACompuesta{ASimple{Asignacion{peso, OpDiv{OpMul{45.0, 12e-56}, OpMenos{OpMas{-002.00, 6}, 3.1e4}}}}, Asignacion{pesado, Opor{OpMayor{peso, 10.00}, OpDiv{peso, OpMenorIgual{002, +04}}}}}
	}
 * 
 */
