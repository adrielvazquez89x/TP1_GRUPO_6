package Ejercicio1;

public class Principal {

	public static void main(String[] args) {

	Empleado uno= new Empleado();
	Empleado dos = new Empleado("Agustina",31);

	System.out.println(uno.toString());

	System.out.println(Empleado.devuelveProximoID());

	System.out.println(dos.toString());
	}

}
