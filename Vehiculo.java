package OnReady;

public abstract class Vehiculo implements Comparable<Vehiculo>{
	private String marca;
	private String modelo;
	private float precio;
	public Vehiculo(String marca, String modelo, float precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String imprime () {
		return (this.getMarca()+" "+this.getModelo());
	}
	public int compareTo (Vehiculo o) {
		return (int)(this.getPrecio()-o.getPrecio());
	}
}