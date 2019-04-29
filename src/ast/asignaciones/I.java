package ast.asignaciones;

public abstract class I {
	public abstract TipoAsignacion tipo();
	public I asignaciones() {throw new UnsupportedOperationException("asignaciones");}
	public IS asignacion() {throw new UnsupportedOperationException("asignacion");}
}
