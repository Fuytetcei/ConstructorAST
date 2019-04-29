package ast.declaraciones;

public class DNum extends DS {
	private String id;
	private String tipoDato;

	public DNum(String id) {
		this.id = id;
		this.tipoDato = "num";
	}
	public String tipoDato() {return tipoDato;}
	public String id() {return id;}
	public TipoDeclaracion tipo() {return TipoDeclaracion.DNUM;}
}
