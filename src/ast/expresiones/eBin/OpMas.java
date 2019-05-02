package ast.expresiones.eBin;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class OpMas extends EBin{
	public OpMas(E opnd1, E opnd2) {super(opnd1,opnd2);}     
	public TipoE tipo() {return TipoE.OPMAS;}
	public String toString() {return "OpMas{" + this.opnd1().toString() + ", " + this.opnd2().toString() + "}";}
}
