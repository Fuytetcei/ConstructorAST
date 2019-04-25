package ast.eBin;

import ast.TipoE;
import ast.eUn.E;

public class OpIgual extends EBin{
	public OpIgual(E opnd1, E opnd2) {
		super(opnd1,opnd2);  
	}     
	public TipoE tipo() {return TipoE.OPIGUAL;}
}
