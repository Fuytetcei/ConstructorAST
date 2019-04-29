package ast.declaraciones;

public class DBool extends DS {
	private String id;
	private String tipoDato;

	public DBool(String id) {
		this.id = id;
		this.tipoDato = "bool";
	}
	public String tipoDato() {return tipoDato;}
	public String id() {return id;}
	public TipoDeclaracion tipo() {return TipoDeclaracion.DBOOL;}
}
