package ast.asignaciones;

public class ACompuesta extends I {
	private I asignaciones;
	private IS asignacion;

	public ACompuesta(I asignaciones, IS asignacion) {
		this.asignaciones = asignaciones;
		this.asignacion = asignacion;
	}

	public I asignaciones() {return this.asignaciones;}
	public IS asignacion() {return this.asignacion;}
	public TipoAsignacion tipo() {return TipoAsignacion.COMPUESTA;}
}
