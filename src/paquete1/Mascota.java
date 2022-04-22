package paquete1;

public class Mascota {
	
	private String nombre;
	private int numPatas;

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public Mascota(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void mandarMensaje() {
		System.out.println("Soy " + this.nombre + " te voy a contar algo o no y tengo "+this.numPatas+" patas");
	}

}
