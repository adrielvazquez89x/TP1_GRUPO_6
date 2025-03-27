package Ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Empleado uno= new Empleado();
		System.out.println(uno.toString());

		System.out.println(Empleado.devuelveProximoID());
	}

}
