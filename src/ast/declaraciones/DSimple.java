package ast.declaraciones;

public class DSimple extends D {
	private DS dec;

	public DSimple(DS dec) {
		this.dec = dec;
	}
	public DS dec() {return dec;}
	public TipoDeclaracion tipo() {return TipoDeclaracion.DSIMPLE;}
}
