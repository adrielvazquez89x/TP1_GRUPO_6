package Ejercicio1;

public class Empleado {

	//2. Crear una clase Empleado con las siguientes propiedades:
	//3. Aplicar el concepto de encapsulación dentro de la clase Empleado
	
	private final int id;
	private String nombre;
	private int edad;
	
	private static int cont=1000;
	
	//6. Crear metodo estatico devuelve proximo Id
	public static int devuelveProximoID() {
		return cont + 1;
	}
	//CONSTRUCTORES
	public Empleado()
	{
		this.id = cont++;;
		this.nombre = "sin nombre";
		this.edad = 99;
	}
	
	public Empleado(String nombre, int edad) 
	{
		this.id=cont++;
		this.nombre=nombre;
		setEdad(edad);
	}
	//GETTERS && SETTERS
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
		if(edad < 0)
			this.edad = 99;
		else
			this.edad = edad;
	}

	public int getId() {
		return id;
	}
	
	//7. Metodo toString()
	@Override
	public String toString() {
		return "Empleado \nID:" + id + "\nNombre:" + nombre + "\nEdad:" + edad + "\n";
	}
}
