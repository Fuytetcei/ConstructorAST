package ascendente.alex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import ascendente.errors.GestionErroresTiny;
import ascendente.asint.ClaseLexica;

%%
%cup
%line
%class AnalizadorLexicoTiny
%type  UnidadLexica
%unicode
%public

%{
  private ALexOperations ops;
  private GestionErroresTiny errores;
  public String lexema() {return yytext();}
  public int fila() {return yyline+1;}
  public void fijaGestionErrores(GestionErroresTiny errores) {
   this.errores = errores;
  }

	// Main
	public static void main(String arg[]) {
		Reader input;
		try {
			input = new InputStreamReader(new FileInputStream("src/pruebas/correcto.txt"));
			// input = new InputStreamReader(new FileInputStream(arg[0]));
			AnalizadorLexicoTiny al = new AnalizadorLexicoTiny(input);
		     UnidadLexica unidad;
		     System.out.println("ALEX AUTOGENERADO:");
		     do {
		       unidad = al.next_token();
		       System.out.println(unidad.lexema());
		     }
		     while (unidad.clase() != ClaseLexica.EOF);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			System.out.println("Error de entrada/Salida");
		}
	}

	// java -cp jlex.jar JLex.Main AnalizadorLexicoTiny.l

  	public void error(int yy_lookahead) {
	  // System.err.println("("+filaActual+','+columnaActual+"):Caracter " + (char)sigCar + " inesperado lexema: " + this.lex.toString() + " estado: " + estado);  
	  System.err.println("Fila: " + fila() + " Caracter " + (char)yy_lookahead + " inesperado");
	  System.exit(1);
  	}
%}

%eofval{
  return ops.unidadEof();
%eofval}

%init{
  ops = new ALexOperations(this);
%init}

letra = [A-Z|a-z]
digito = [0-9]
NUMERO = (\+|\-)?{digito}+(\.{digito}+)?([e|E][\+|\-]?{digito}+)?
SEPARADOR = &&
PUNTOYCOMA = ;
PAP = \(
PCI = \)
TIPOBOOL = bool
TIPONUM = num
OPAND = and
OPOR = or
OPNOT = not
TRUE = true
FALSE = false
VARIABLE = {letra}({letra}|_|{digito})*
OPASIGNAR = \=
OPMAS = \+ 
OPMENOSUNARIO = \- 
OPMUL = \*
OPDIV = /
OPMENOR = <
OPMAYOR = >
OPMENORIGUAL = <\=
OPMAYORIGUAL = \=>
OPDISTINTO = !\=
OPIGUAL = \=\=
IGNORAR = [ \t\r\b\n]
%%
{SEPARADOR}        			{return ops.unidadSeparador();}
{PUNTOYCOMA}       			{return ops.unidadPuntoYComa();}
{PAP}						{return ops.unidadPAP();}
{PCI} 					  	{return ops.unidadPCI();}
{TIPONUM}				  	{return ops.unidadNum();}
{TIPOBOOL}		  			{return ops.unidadBool();}
{OPAND}					  	{return ops.unidadOpAnd();}
{OPOR}					  	{return ops.unidadOpOr();}
{OPNOT}					  	{return ops.unidadOpNot();}
{FALSE}						{return ops.unidadFalse();}
{TRUE}						{return ops.unidadTrue();}
{OPASIGNAR}	  				{return ops.unidadOpAsignacion();}
{OPMAS}						{return ops.unidadOpMas();}
{OPMUL}						{return ops.unidadOpMul();}
{OPDIV}					  	{return ops.unidadOpDiv();}
{OPMENOSUNARIO}				{return ops.unidadOpMenosUnario();}
{OPMENOR}				 	{return ops.unidadOpMenor();}
{OPMENORIGUAL}				{return ops.unidadOpMenorIgual();}
{OPMAYOR}					{return ops.unidadOpMayor();}
{OPMAYORIGUAL}				{return ops.unidadOpMayorIgual();}
{OPIGUAL}					{return ops.unidadOpIgual();}
{OPDISTINTO}			  	{return ops.unidadOpDistinto();}
{NUMERO}				  	{return ops.unidadNumero();}
{VARIABLE} 					{return ops.unidadNombreVariable();}
{IGNORAR}				  	{}
[^]                       	{errores.errorLexico(fila(),lexema());}