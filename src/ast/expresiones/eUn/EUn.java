package ast.expresiones.eUn;

import ast.expresiones.E;

public abstract class EUn extends E{
	private E opnd1;
	public EUn(E opnd1) {
		this.opnd1 = opnd1;
	}
	public E opnd1() {return opnd1;}
}
