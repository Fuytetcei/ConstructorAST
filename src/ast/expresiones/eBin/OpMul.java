package ast.expresiones.eBin;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class OpMul extends EBin{
	public OpMul(E opnd1, E opnd2) {super(opnd1,opnd2);}     
	public TipoE tipo() {return TipoE.OPMUL;}
	public String toString() {return "OpMul{" + this.opnd1().toString() + ", " + this.opnd2().toString() + "}";}
}
