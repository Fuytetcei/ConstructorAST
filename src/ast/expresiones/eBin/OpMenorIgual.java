package ast.expresiones.eBin;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class OpMenorIgual extends EBin{
	public OpMenorIgual(E opnd1, E opnd2) {super(opnd1,opnd2);}     
	public TipoE tipo() {return TipoE.OPMENORIGUAL;}
	public String toString() {return "OpMenorIgual{" + this.opnd1().toString() + ", " + this.opnd2().toString() + "}";}
}
