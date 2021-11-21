package gestion;
import java.util.*;
import zooAnimales.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {
		;
	}
	public int cantidadTotalAnimales() {
		int sum = 0;
		for (Zona zona : zonas) {
			sum += zona.cantidadAnimales();
			}
		return sum;
	}
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}
}
