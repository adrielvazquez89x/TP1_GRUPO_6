package Ejercicio1;

public class Principal {

	public static void main(String[] args) {

	Empleado uno= new Empleado();
	uno.setNombre("Jose");
	uno.setEdad(30);
	
	Empleado dos = new Empleado("Agustina",31);
	
	//Opcion de usar array para guardar los 5 empleados (completar los faltantes si lo usamos)
	Empleado[] Vempleados = new Empleado[5];
	Vempleados[0]= uno;
	Vempleados[1]= dos;	

	System.out.println(uno.toString());	
	
	System.out.println(dos.toString());
	
	//Otra opcion para imprimir la info:
	for (Empleado e : Vempleados) {
		System.out.println(e.toString());
	}
	
	
	System.out.println("EL proximo id es: " + Empleado.devuelveProximoID());
		
	}

}
