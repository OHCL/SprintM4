package sprintM4;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;

public class Contenedor {
 // Lista de instancias de la interface Asesoria
 private List<Asesoria> listaAsesoria;
 // Lista de objetos de la clase Capacitacion
 private List<Capacitacion> listaCapacitacion;

 // Constructor
 public Contenedor() {
     listaAsesoria = new ArrayList<>();
     listaCapacitacion = new ArrayList<>();
 }

 // Métodos para almacenar usuarios y capacitaciones
 public void almacenarCliente(Cliente cliente) {
     listaAsesoria.add(cliente);
 }

 public void almacenarProfesional(Profesional profesional) {
     listaAsesoria.add(profesional);
 }

 public void almacenarAdministrativo(Administrativo administrativo) {
     listaAsesoria.add(administrativo);
 }

 public void almacenarCapacitacion(Capacitacion capacitacion) {
     listaCapacitacion.add(capacitacion);
 }

 // Método para eliminar usuario
 public void eliminarUsuario(int RUN) {
	    // Buscar Usuario
	    Usuario usuarioABuscar = null;
	    for (Asesoria asesoria : listaAsesoria) {
	        if (asesoria instanceof Usuario && ((Usuario) asesoria).getRUN() == RUN) {
	            usuarioABuscar = (Usuario) asesoria;
	            break;
	        }
	    }
	    
	    // Obtener Cantidad
	    int cantidadAntesDeEliminar = listaAsesoria.size();
	    
	    // Eliminar Usuario
	    if (usuarioABuscar != null) {
	        listaAsesoria.remove(usuarioABuscar);
	        System.out.println("Usuario eliminado con éxito.");
	    } else {
	        System.out.println("Usuario no encontrado.");
	    }
	    
	    // Mostrar la nueva cantidad de usuarios
	    int cantidadDespuesDeEliminar = listaAsesoria.size();
	    System.out.println("Cantidad de usuarios antes de eliminar: " + cantidadAntesDeEliminar);
	    System.out.println("Cantidad de usuarios después de eliminar: " + cantidadDespuesDeEliminar);
	}


 // Método para listar usuarios
 public void listarUsuarios() {
	 System.out.println("------- Usuarios En Lista: -------");
	    for (Asesoria asesoria : listaAsesoria) {
	        if (asesoria instanceof Usuario) {
	            Usuario usuario = (Usuario) asesoria;
	            System.out.println("");
	            System.out.println("Nombre: " + usuario.getNombre());
	            System.out.println("Fecha de Nacimiento: " + new SimpleDateFormat("dd/MM/yyyy").format(usuario.getFechaDeNacimiento()));
	            System.out.println("RUN: " + usuario.getRUN());
	        }
	    }
 }

 // Método para listar usuarios por tipo
 public void listarUsuariosPorTipo(int tipo) {
	    for (Asesoria asesoria : listaAsesoria) {
	        switch (tipo) {
	            case 1: // Cliente
	                if (asesoria instanceof Cliente) {
	                    Cliente cliente = (Cliente) asesoria;
	                    System.out.println("\nCliente: ");
	                    System.out.println("Nombre: " + cliente.getNombre());
	                    System.out.println("RUN: " + cliente.getRUN());
	                    System.out.println("RUT: " + cliente.getRut());
	                    System.out.println("Nombres: " + cliente.getNombres());
	                    System.out.println("Apellidos: " + cliente.getApellidos());
	                    System.out.println("Teléfono: " + cliente.getTelefono());
	                    System.out.println("AFP: " + cliente.getAFP());
	                    System.out.println("Sistema de Salud: " + cliente.getSistemaSalud());
	                    System.out.println("Dirección: " + cliente.getDireccion());
	                    System.out.println("Comuna: " + cliente.getComuna());
	                    System.out.println("Edad: " + cliente.getEdad());
	                }
	                break;
	            case 2: // Profesional
	                if (asesoria instanceof Profesional) {
	                    Profesional profesional = (Profesional) asesoria;
	                    System.out.println("\nProfesional: ");
	                    System.out.println("Nombre: " + profesional.getNombre());
	                    System.out.println("RUN: " + profesional.getRUN());
	                    System.out.println("Título: " + profesional.getTitulo());
	                    System.out.println("Fecha de Ingreso: " + profesional.getFechaIngreso());
	                }
	                break;
	            case 3: // Administrativo
	                if (asesoria instanceof Administrativo) {
	                    Administrativo administrativo = (Administrativo) asesoria;
	                    System.out.println("\nAdministrativo: ");
	                    System.out.println("Nombre: " + administrativo.getNombre());
	                    System.out.println("RUN: " + administrativo.getRUN());
	                    System.out.println("Área: " + administrativo.getArea());
	                    System.out.println("Experiencia Previa: " + administrativo.getExperienciaPrevia());
	                }
	                break;
	        }
	    }
	}

 public void listarCapacitaciones() {
	    if (listaCapacitacion.isEmpty()) {
	        System.out.println("No hay capacitaciones registradas.");
	    } else {
	        for (Capacitacion capacitacion : listaCapacitacion) {
	            Cliente clienteAsociado = null;
	            // Buscar el cliente asociado a la capacitación
	            for (Asesoria asesoria : listaAsesoria) {
	                if (asesoria instanceof Cliente && ((Cliente) asesoria).getRut() == capacitacion.getRUTCliente()) {
	                    clienteAsociado = (Cliente) asesoria;
	                    break;
	                }
	            }
	            // Mostrar los datos de la capacitación y del cliente asociado
	            if (clienteAsociado != null) {
	            	System.out.println("");
	                System.out.println("Capacitación ID: " + capacitacion.getIdentificador());
	                System.out.println("Día: " + capacitacion.getDia());
	                System.out.println("Hora: " + capacitacion.getHora());
	                System.out.println("Lugar: " + capacitacion.getLugar());
	                System.out.println("Duración: " + capacitacion.getDuracion());
	                System.out.println("Cantidad de Asistentes: " + capacitacion.getCantidadAsistentes());
	                System.out.println("Datos del Cliente Asociado:");
	                System.out.println(clienteAsociado.toString());
	            } else {
	                System.out.println("No se encontró el cliente asociado a la capacitación ID: " + capacitacion.getIdentificador());
	            }
	        }
	    }
	}
}


