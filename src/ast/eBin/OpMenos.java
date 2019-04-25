package ast.eBin;

import ast.TipoE;
import ast.eUn.E;

public class OpMenos extends EBin{
	public OpMenos(E opnd1, E opnd2) {
		super(opnd1,opnd2);  
	}     
	public TipoE tipo() {return TipoE.OPMENOS;}
}
