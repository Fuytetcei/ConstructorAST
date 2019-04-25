package ast.eBin;

import ast.TipoE;
import ast.eUn.E;

public class OpMenorIgual extends EBin{
	public OpMenorIgual(E opnd1, E opnd2) {
		super(opnd1,opnd2);  
	}     
	public TipoE tipo() {return TipoE.OPMENORIGUAL;}
}
