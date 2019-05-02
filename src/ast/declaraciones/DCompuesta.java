package ast.declaraciones;

public class DCompuesta extends D {
	private DS dec;
	private D decs;

	public DCompuesta(DS dec, D decs) {
		this.dec = dec;
		this.decs = decs;
	}
	public DS dec() {return dec;}
	public D decs() {return decs;}
	public TipoDeclaracion tipo() {return TipoDeclaracion.DCOMPUESTA;}
}
