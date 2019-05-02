package ast.expresiones.eBin;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class OpMenos extends EBin{
	public OpMenos(E opnd1, E opnd2) {super(opnd1,opnd2);}     
	public TipoE tipo() {return TipoE.OPMENOS;}
	public String toString() {return "OpMenos{" + this.opnd1().toString() + ", " + this.opnd2().toString() + "}";}
}
