package paquete1;

public class Mascota {
	
	private String nombre;
	private int edad;
	

	public Mascota(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mandarMensaje() {
		System.out.println("Soy master y te voy a contar algo o no");
	}

}
