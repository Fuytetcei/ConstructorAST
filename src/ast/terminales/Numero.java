package ast.terminales;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class Numero extends E {
	  private String valor;
	  public Numero(String valor) {
	   this.valor = valor;   
	  }
	  public String valor() {return valor;}
	  public TipoE tipo() {return TipoE.NUMERO;}
}
