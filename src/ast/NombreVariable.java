package ast;

import ast.eUn.E;

public class NombreVariable extends E {
	  private String nombreVariable;
	  public NombreVariable(String nombreVariable) {
	   this.nombreVariable = nombreVariable;   
	  }
	  public String id() {return nombreVariable;}
	  public TipoE tipo() {return TipoE.NOMBREVARIABLE;}    
}
