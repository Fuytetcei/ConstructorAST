package ast.expresiones.eUn;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class OpMenosUnario extends EUn {
	public OpMenosUnario(E opnd1) {
		super(opnd1);  
	}     
	public TipoE tipo() {return TipoE.OPMENOSUNARIO;}
}
