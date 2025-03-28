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
		return cont;
	}
	//CONSTRUCTORES
	public Empleado()
	{
		this.id = cont++;
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
		this.edad = (edad < 0) ? 99 : edad;
	}

	public int getId() {
		return id;
	}
	
	//7. Metodo toString()
	@Override
	public String toString() {
		return "Empleado \nID:" + id + "\nNombre:" + nombre + "\nEdad:" + edad + "\n";
	}
	
	//Agregado además de la consigna proporcionada:
	
	public static int calcularPromedioEdades(int[] vEmpleadosEdades) {
		int sumaEdades = 0;
		
		for (int edad : vEmpleadosEdades) {
			sumaEdades+= edad;
		}
		
		return sumaEdades / vEmpleadosEdades.length;
	}
	
	public static String retornarPromedioEdades(int[] vEmpleadosEdades) {
		return "La edad promedio de los empleados es: " + calcularPromedioEdades(vEmpleadosEdades) + " años";
	}
	
	
	public static int buscarEdadMaxima(int[] vEmpleadosEdades) {
	    int maxEdad = vEmpleadosEdades[0]; 
	    for (int edad : vEmpleadosEdades) {
	        if (edad > maxEdad) {
	            maxEdad = edad; 
	        }
	    }
	    return maxEdad;
	}
	
	
	public static String retornarEdadMaxima(int[] vEmpleadosEdades) {
		return "La edad maxima es: " + buscarEdadMaxima(vEmpleadosEdades) + " años";
	}
	  
	
	
	
}
