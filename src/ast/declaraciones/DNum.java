package ast.declaraciones;

public class DNum extends DS {
	private String id;

	public DNum(String id) {this.id = id;}
	public String tipoDato() {return "num";}
	public String id() {return id;}
	public TipoDeclaracion tipo() {return TipoDeclaracion.DNUM;}
	public String toString () {return "num " + this.id;}
}
