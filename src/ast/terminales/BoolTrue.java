package ast.terminales;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class BoolTrue extends E {
	public BoolTrue() {}
	public String valor() {return "true";}
	public TipoE tipo() {return TipoE.TRUE;}
	public String toString() {return "true";}
}
