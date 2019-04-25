package ast.eBin;

import ast.E;
import ast.TipoE;

public class OpMul extends EBin{
	public OpMul(E opnd1, E opnd2) {
		super(opnd1,opnd2);  
	}     
	public TipoE tipo() {return TipoE.OPMUL;}
}
