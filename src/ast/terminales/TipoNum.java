package ast.terminales;

import ast.expresiones.TipoE;

public class TipoNum {
	 private String tipo;
	  public TipoNum() {
		  this.tipo = "num";   
	  }
	  public String id() {return tipo;}
	  public TipoE tipo() {return TipoE.TIPONUM;}  
}
