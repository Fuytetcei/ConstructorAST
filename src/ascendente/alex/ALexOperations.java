package ascendente.alex;

import ascendente.asint.ClaseLexica;

public class ALexOperations {
  private AnalizadorLexicoTiny alex;
  public ALexOperations(AnalizadorLexicoTiny alex) {
   this.alex = alex;   
  }
//Creacion de unidades lexicas
  public UnidadLexica unidadPAP() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.PAP, "(");
  }
  public UnidadLexica unidadPCI() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.PCI, ")");
  }
  public UnidadLexica unidadPuntoYComa() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.PUNTOYCOMA, ";");
  }
  public UnidadLexica unidadOpMas() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPMAS, "+");
  }
  public UnidadLexica unidadSeparador() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.SEPARADOR, "&&");
  }
  public UnidadLexica unidadNumero() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.NUMERO, alex.lexema());
  }
  public UnidadLexica unidadOpDistinto() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPDISTINTO, "!=");
  }
  public UnidadLexica unidadOpAsignacion() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPASIGNAR, "=");
  }
  public UnidadLexica unidadOpIgual() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPIGUAL, "==");
  }
  public UnidadLexica unidadOpMayor() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPMAYOR, ">");
  }
  public UnidadLexica unidadOpMayorIgual() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPMAYORIGUAL, "=>");
  }
  public UnidadLexica unidadOpMenor() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPMENOR, "<");
  }
  public UnidadLexica unidadOpMenorIgual() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPMENORIGUAL, "<=");
  }
  public UnidadLexica unidadOpDiv() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPDIV, "/");
  }
  public UnidadLexica unidadOpMul() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPMUL, "*");
  }
  public UnidadLexica unidadBool() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.NOMBRETIPOBOOL, "bool");
  }
  public UnidadLexica unidadOpOr() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPOR, "or");
  }
  public UnidadLexica unidadNum() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.NOMBRETIPONUM, "num");
  }
  public UnidadLexica unidadOpNot() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPNOT, "not");
  }
  public UnidadLexica unidadNombreVariable() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.NOMBREVARIABLE, alex.lexema());
  }
  public UnidadLexica unidadOpAnd() {
	   return new UnidadLexica(alex.fila(), ClaseLexica.OPAND, "and");
  }
  public UnidadLexica unidadOpMenosUnario() {
	  return new UnidadLexica(alex.fila(), ClaseLexica.OPMENOSUNARIO, "-");
  }
  public UnidadLexica unidadTrue() {
	  return new UnidadLexica(alex.fila(), ClaseLexica.TRUE, "true");
  }
  public UnidadLexica unidadFalse() {
	  return new UnidadLexica(alex.fila(), ClaseLexica.FALSE, "false");
  }
  public UnidadLexica unidadEof() {
	  return new UnidadLexica(alex.fila(), ClaseLexica.EOF, "<EOF>");
  }
}
