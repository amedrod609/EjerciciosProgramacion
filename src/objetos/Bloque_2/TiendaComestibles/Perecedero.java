package objetos.Bloque_2.TiendaComestibles;

public class Perecedero extends Articulo{
	private String fCaducidad;

	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public Perecedero(int codigo, String nombre, float precio, String fecha) {
		super(codigo, nombre, precio);
		this.fCaducidad = fecha;
	
	}
	
	
	
	
}
