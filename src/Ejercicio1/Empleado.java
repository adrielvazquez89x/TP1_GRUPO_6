package Ejercicio1;

public class Empleado {

	//2. Crear una clase Empleado con las siguientes propiedades:
	//3. Aplicar el concepto de encapsulación dentro de la clase Empleado
	
	private final int id;
	private String nombre;
	private int edad;
	
	private static int cont=999;
	
	//CONSTRUCTORES
	public Empleado()
	{
		cont++;
		this.id = cont;
		this.nombre = "sin nombre";
		this.edad = 99;
	}

	
	
	
	
	
	
	
}
