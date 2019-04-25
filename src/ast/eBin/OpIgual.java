package ast.eBin;

import ast.E;
import ast.TipoE;

public class OpIgual extends EBin{
	public OpIgual(E opnd1, E opnd2) {
		super(opnd1,opnd2);  
	}     
	public TipoE tipo() {return TipoE.OPIGUAL;}
}
