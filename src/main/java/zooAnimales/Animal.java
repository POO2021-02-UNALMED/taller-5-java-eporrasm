package zooAnimales;
import gestion.*;
import java.util.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales ++;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	public Animal() {
		;
	}
	public String totalPorTipo(){
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n"+"Aves: "+Ave.cantidadAves()+"\n"+"Reptiles: "+Reptil.cantidadReptiles()+"\n"
				+"Peces: "+Pez.cantidadPeces()+"\n"+"Anfibios: "+Anfibio.cantidadAnfibios()+"\n";
	}
	public String toString() {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+
				", la zona en la que me ubico es "+zona+" en el "+zona.getZoologico();
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
}
