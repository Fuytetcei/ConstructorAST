package ast.asignaciones;

public class ASimple extends I {
	private IS asignacion;

	public ASimple(IS asignacion) {
		this.asignacion = asignacion;
	}

	public IS asignacion() {return this.asignacion;}
	public TipoAsignacion tipo() {return TipoAsignacion.SIMPLE;}
}
