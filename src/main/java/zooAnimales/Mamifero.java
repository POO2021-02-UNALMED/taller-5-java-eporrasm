package zooAnimales;
import java.util.*;
import gestion.Zona;

public class Mamifero extends Animal {
	private static List<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		listado.add(this);
	}
	public Mamifero() {
		listado.add(this);
	}
	public static int cantidadMamiferos(){
		return listado.size();
	}
	public Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
		}
	public Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
}
