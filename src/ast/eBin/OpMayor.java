package ast.eBin;

import ast.TipoE;
import ast.eUn.E;

public class OpMayor extends EBin{
	public OpMayor(E opnd1, E opnd2) {
		super(opnd1,opnd2);  
	}     
	public TipoE tipo() {return TipoE.OPMAYOR;}
}
