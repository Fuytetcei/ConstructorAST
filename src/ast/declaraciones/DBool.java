package ast.declaraciones;

public class DBool extends DS {
	private String id;

	public DBool(String id) {this.id = id;}
	public String tipoDato() {return "bool";}
	public String id() {return id;}
	public TipoDeclaracion tipo() {return TipoDeclaracion.DBOOL;}
	public String toString () {return "bool " + this.id;}
}
