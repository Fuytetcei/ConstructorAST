package ast.terminales;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class NombreVariable extends E {
	  private String id;
	  public NombreVariable(String id) {
	   this.id = id;   
	  }
	  public String id() {return id;}
	  public TipoE tipo() {return TipoE.NOMBREVARIABLE;}    
}
