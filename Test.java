package OnReady;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	private static void cargar (List<Vehiculo> lista) {
		lista.add(new Auto("Peugeot", "206", 4, (float)200000));
		lista.add(new Moto("Honda", "Titan", 125, (float)60000));
		lista.add(new Auto("Peugeot", "208", 5, (float)250000));
		lista.add(new Moto("Yamaha", "YBR", 160, (float)80500.50));
	}
	private static Vehiculo calcularBarato (List<Vehiculo> lista) {
		float min = Float.MAX_VALUE;
		Vehiculo respuesta = null;
		for (Vehiculo i: lista) {
			if (min>i.getPrecio()) {
				min=i.getPrecio();
				respuesta=i;
			}
		}
		return respuesta;
	}
	private static Vehiculo calcularCaro (List<Vehiculo> lista) {
		float max = Float.MIN_VALUE;
		Vehiculo respuesta = null;
		for (Vehiculo i: lista) {
			if (max<i.getPrecio()) {
				max=i.getPrecio();
				respuesta=i;
			}
		}
		return respuesta;
	}

	private static Vehiculo contieneY (List<Vehiculo> lista) {
		Vehiculo respuesta = null;
		boolean encontro = false;
		Iterator<Vehiculo> iterador = lista.iterator();
		while (iterador.hasNext() && !encontro) {
			Vehiculo act = iterador.next();
			String modelo = act.getModelo();
			int I=0;
			while (!encontro && I<modelo.length()) {
				if (modelo.charAt(I)=='Y') {
					encontro=true;
					respuesta=act;
				}
				I++;
			}
		}
		return respuesta;
	}
	
	public static void main (String args[]) {
		List<Vehiculo> lista = new ArrayList<Vehiculo>();
		cargar(lista);
		for (Vehiculo i: lista) {
			System.out.println(i.toString());
		}
		System.out.println("=============");
		Vehiculo caro = calcularCaro(lista);
		System.out.println("Vehículo más caro: "+caro.imprime());
		Vehiculo barato = calcularBarato(lista);
		System.out.println("Vehículo más barato: "+barato.imprime());
		Vehiculo modeloY = contieneY(lista);
		System.out.println("Vehículo que contiene en el modelo la letra 'Y': "+modeloY.imprime()+" $"+modeloY.getPrecio());
		System.out.println("=============");
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		lista.sort((o2, o1)->o1.compareTo(o2));
		for (Vehiculo i: lista) {
			System.out.println(i.imprime());
		}
	}
}
