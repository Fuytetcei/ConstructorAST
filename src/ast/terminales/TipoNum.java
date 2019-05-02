package ast.terminales;

import ast.expresiones.TipoE;

public class TipoNum {
	public TipoNum() {}
	public String id() {return "num";}
	public TipoE tipo() {return TipoE.TIPONUM;}
	public String toString() {return "num";}
}
