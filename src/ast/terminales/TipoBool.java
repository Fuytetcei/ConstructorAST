package ast.terminales;

import ast.expresiones.TipoE;

public class TipoBool {
	public TipoBool() {}
	public String id() {return "bool";}
	public TipoE tipo() {return TipoE.TIPOBOOL;}
	public String toString() {return "bool";}
}
