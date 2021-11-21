package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<Animal>();
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;

	}
	public Zona() {
		;
	}
	public String getNombre() {
		return nombre;
	}
	public Zoologico getZoologico() {
		return zoo;
	}
	public List<Animal> getAnimales() {
		return animales;
	}
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
		animal.setZona(this);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
}
