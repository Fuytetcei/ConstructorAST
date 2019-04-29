package ast.expresiones.eUn;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class OpNot extends EUn {
	public OpNot(E opnd1) {
		super(opnd1);  
	}     
	public TipoE tipo() {return TipoE.OPNOT;}
}
