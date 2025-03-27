package Ejercicio1;

public class Principal {

	public static void main(String[] args) {

	Empleado uno= new Empleado();
	uno.setNombre("Jose");
	uno.setEdad(30);
	
	Empleado dos = new Empleado("Agustina",-1);
	Empleado tres = new Empleado("Jesus", 33);
	Empleado cuatro = new Empleado("Santiago", 11);
	Empleado cinco = new Empleado();
	cinco.setNombre("Soledad");
	cinco.setEdad(25);
	
	System.out.println("IMPRESION DE FORMA INDIVIDUAL: \n");
	System.out.println(uno.toString());	
	System.out.println(dos.toString());
	System.out.println(tres.toString());
	System.out.println(cuatro.toString());
	System.out.println(cinco.toString());
	System.out.println("-------------------------\n");
	
	//Opcion de usar array para guardar los 5 empleados
	Empleado[] Vempleados = new Empleado[5];
	Vempleados[0]= uno;
	Vempleados[1]= dos;	
	Vempleados[2] = new Empleado("Jose",18);
	Vempleados[3] = new Empleado("Marta", 105);
	Vempleados[4] = new Empleado("Roberto", 50);

	System.out.println("IMPRESION UTILIZANDO FOR EACH: \n");
	//Otra opcion para imprimir la info:
	for (Empleado e : Vempleados) {
		System.out.println(e.toString());
	}
	System.out.println("-------------------------\n");
	
	System.out.println("El proximo id es: " + Empleado.devuelveProximoID());
		
	}

}
