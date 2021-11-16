package OnReady;

public class Moto extends Vehiculo {
	private float cilindrada;
	
	public Moto () {
		super();
	}

	public Moto(float cilindrada) {
		super();
		this.cilindrada= cilindrada;
	}

	public Moto(String marca, String modelo, float cilindrada, float precio) {
		super(marca, modelo, precio);
		this.cilindrada=cilindrada;
	}

	public float getCilindrada() {
		return this.cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada= cilindrada;
	}
	
	public String toString () {
		return ("Marca: "+this.getMarca()+" // Modelo: "+this.getModelo()+" // Cilindrada: "+(int)this.getCilindrada()+"cc // Precio: $"+this.getPrecio());
	}
	
}
