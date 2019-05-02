package ast.terminales;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class BoolFalse extends E {
	public BoolFalse() {}
	public String valor() {return "false";}
	public TipoE tipo() {return TipoE.FALSE;}
	public String toString() {return "false";}
}
