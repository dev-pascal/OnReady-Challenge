package OnReady;

public class Auto extends Vehiculo {
	private int puertas;
	
	public Auto () {
		super();
	}

	public Auto(int puertas) {
		super();
		this.puertas = puertas;
	}

	public Auto(String marca, String modelo, int puertas, float precio) {
		super(marca, modelo, precio);
		this.puertas=puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public String toString () {
		return ("Marca: "+this.getMarca()+" // Modelo: "+this.getModelo()+" // Puertas: "+this.getPuertas()+" // Precio: $"+this.getPrecio());
	}
}
