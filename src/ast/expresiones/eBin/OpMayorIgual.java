package ast.expresiones.eBin;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class OpMayorIgual extends EBin{
	public OpMayorIgual(E opnd1, E opnd2) {super(opnd1,opnd2);}     
	public TipoE tipo() {return TipoE.OPMAYORIGUAL;}
	public String toString() {return "OpMayorIgual{" + this.opnd1().toString() + ", " + this.opnd2().toString() + "}";}
}
