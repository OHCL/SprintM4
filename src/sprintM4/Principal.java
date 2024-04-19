package sprintM4;

//Grupal 17 módulo 4
//Integrantes:
//Emperatriz Freites
//Octavio Castro
//Catalina Gonpar 
//Damylet Mirena 
//Mackarena Neira 

import java.util.Scanner;

public class Principal {
	// Atributos
	private Contenedor contenedor;

	// Constructor
	public Principal() {
		this.contenedor = new Contenedor();
	}

	// Método para mostrar el menú y procesar la selección del usuario
	public void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Ingrese el número de su opción a continuación:");
			System.out.println("[1] Almacenar cliente");
			System.out.println("[2] Almacenar profesional");
			System.out.println("[3] Almacenar administrativo");
			System.out.println("[4] Almacenar capacitación");
			System.out.println("[5] Eliminar usuario");
			System.out.println("[6] Listar usuarios");
			System.out.println("[7] Listar usuarios por tipo");
			System.out.println("[8] Listar capacitaciones");
			System.out.println("[9] Salir");
			System.out.print("Su Opción: ");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1: // Lógica para crear un Cliente vacío y luego agregar atributos
				scanner.nextLine();
				Cliente cliente = new Cliente(); // Crear instancia de Cliente vacía

				System.out.println("Por favor, ingrese los datos del cliente.");

				System.out.print("Ingrese nombre completo: ");
				cliente.setNombre(scanner.nextLine());

				System.out.print("Ingrese fecha de nacimiento (DD/MM/AAAA): ");
				cliente.setFechaDeNacimiento(scanner.nextLine());

				System.out.print("Ingrese RUN: ");
				cliente.setRUN(scanner.nextInt());
				scanner.nextLine();

				System.out.print("Ingrese RUT: ");
				cliente.setRut(scanner.nextInt());
				scanner.nextLine();

				System.out.print("Ingrese nombres: ");
				cliente.setNombres(scanner.nextLine());

				System.out.print("Ingrese apellidos: ");
				cliente.setApellidos(scanner.nextLine());

				System.out.print("Ingrese teléfono: ");
				cliente.setTelefono(scanner.nextLine());

				System.out.print("Ingrese AFP: ");
				cliente.setAFP(scanner.nextLine());

				System.out.print("Ingrese sistema de salud (1 para Fonasa, 2 para Isapre): ");
				cliente.setSistemaSalud(scanner.nextInt());
				scanner.nextLine();

				System.out.print("Ingrese dirección: ");
				cliente.setDireccion(scanner.nextLine());

				System.out.print("Ingrese comuna: ");
				cliente.setComuna(scanner.nextLine());

				System.out.print("Ingrese edad: ");
				cliente.setEdad(scanner.nextInt());

				// Almacenar el cliente en el contenedor
				contenedor.almacenarCliente(cliente);

				// Mostrar el cliente recién creado usando toString
				System.out.println("Cliente almacenado con éxito:");
				System.out.println(cliente.toString());
				break;
				
			case 2:
				// Lógica para crear un Profesional vacío y luego agregar atributos
				scanner.nextLine();
				Profesional profesional = new Profesional(); // Crear instancia de Profesional vacía

				System.out.println("Por favor, ingrese los datos del profesional.");
				System.out.print("Ingrese nombre completo: ");
				profesional.setNombre(scanner.nextLine());

				System.out.print("Ingrese fecha de nacimiento (DD/MM/AAAA): ");
				profesional.setFechaDeNacimiento(scanner.nextLine());

				System.out.print("Ingrese RUN: ");
				profesional.setRUN(scanner.nextInt());
				scanner.nextLine();

				System.out.print("Ingrese título: ");
				profesional.setTitulo(scanner.nextLine());

				System.out.print("Ingrese fecha de ingreso (DD/MM/AAAA): ");
				profesional.setFechaIngreso(scanner.nextLine());

				// Almacenar el profesional en el contenedor
				contenedor.almacenarProfesional(profesional);

				// Mostrar el profesional recién creado usando toString
				System.out.println("Profesional almacenado con éxito:");
				System.out.println(profesional.toString());

				break;
			
			case 3:
				// Logica para crear un Administrativo vacio y luego crear atributos
				scanner.nextLine();
				Administrativo administrativo = new Administrativo(); // Crear instancia de Administrativo vacía

				System.out.println("Por favor, ingrese los datos del administrativo.");
				System.out.print("Ingrese nombre completo: ");
				administrativo.setNombre(scanner.nextLine());

				System.out.print("Ingrese fecha de nacimiento (DD/MM/AAAA): ");
				administrativo.setFechaDeNacimiento(scanner.nextLine());

				System.out.print("Ingrese RUN: ");
				administrativo.setRUN(scanner.nextInt());
				scanner.nextLine();

				System.out.print("Ingrese área: ");
				administrativo.setArea(scanner.nextLine());

				System.out.print("Ingrese experiencia previa: ");
				administrativo.setExperienciaPrevia(scanner.nextLine());

				// Almacenar el administrativo en el contenedor
				contenedor.almacenarAdministrativo(administrativo);

				// Mostrar el administrativo recién creado usando toString
				System.out.println("Administrativo almacenado con éxito:");
				System.out.println(administrativo.toString());

				break;

			case 4: // Lógica para almacenar capacitación
				scanner.nextLine();
				Capacitacion capacitacion = new Capacitacion(); // Crear instancia de Capacitación vacía

				System.out.println("Por favor, ingrese los datos de la capacitación.");
				System.out.print("Ingrese identificador: ");
				capacitacion.setIdentificador(scanner.nextInt());
				scanner.nextLine();

				System.out.print("Ingrese RUT del Cliente: ");
				capacitacion.setRUTCliente(scanner.nextInt());
				scanner.nextLine();

				System.out.print("Ingrese día: ");
				capacitacion.setDia(scanner.nextLine());

				System.out.print("Ingrese hora: ");
				capacitacion.setHora(scanner.nextLine());

				System.out.print("Ingrese lugar: ");
				capacitacion.setLugar(scanner.nextLine());

				System.out.print("Ingrese duración: ");
				capacitacion.setDuracion(scanner.nextLine());

				System.out.print("Ingrese cantidad de asistentes: ");
				capacitacion.setCantidadAsistentes(scanner.nextInt());
				scanner.nextLine();

				// Almacenar la capacitación en el contenedor
				contenedor.almacenarCapacitacion(capacitacion);

				// Mostrar la capacitación recién creada usando toString
				System.out.println("Capacitación almacenada con éxito:");
				System.out.println(capacitacion.toString());

				break;

			case 5:
				// Lógica para eliminar un usuario
				System.out.print("Ingrese RUN del usuario a eliminar: ");
				int runEliminar = scanner.nextInt();
				scanner.nextLine();

				contenedor.eliminarUsuario(runEliminar);
				System.out.println("Si el usuario existía, ha sido eliminado.");
				break;
			
			case 6:
				// Lógica para listar todos los usuarios
				contenedor.listarUsuarios();
				break;

			case 7:
				// Logica para listar un tipo de usuario
				scanner.nextLine();
				System.out.print("Ingrese el numero que corresponda al tipo de usuario (1: cliente, 2: profesional, 3: administrativo): ");
				int tipo = scanner.nextInt();
				contenedor.listarUsuariosPorTipo(tipo);
				break;


			case 8:
				// Logica para listar capacitaciones
				contenedor.listarCapacitaciones();
				break;

			case 9:
				System.out.println("Saliendo del programa...");
				break;
				
			default:
				System.out.println("Opción no válida. Intente nuevamente.");
				break;
			}
			if (opcion != 9) {
				System.out.println("");
				System.out.println("Regresando al menú principal...");
			}
		} while (opcion != 9);
		scanner.close();
	}

	// Método principal para ejecutar la aplicación
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.mostrarMenu();
	}
}