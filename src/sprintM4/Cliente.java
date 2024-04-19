package sprintM4;

import java.text.SimpleDateFormat;

public class Cliente extends Usuario {
    // Atributos adicionales para Cliente
    private int RUT;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String AFP;
    private int sistemaSalud; // 1 para Fonasa, 2 para Isapre
    private String direccion;
    private String comuna;
    private int edad;

    // Constructor vacío
    public Cliente() {
        super(); 
    }

    // Constructor con todos los atributos
    public Cliente(String nombre, String fechaDeNacimiento, int RUN, int RUT, String nombres, String apellidos, String telefono, String AFP, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaDeNacimiento, RUN);
        this.RUT = RUT;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AFP = AFP;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }
	    
	    // Metodo obtener Nombre
	    public String obtenerNombre() {
	        return nombres + " " + apellidos;
	    }

	    // Método para obtener  sistema de salud
	    public String obtenerSistemaSalud() {
	        if (sistemaSalud == 1) {
	            return "Fonasa";
	        } else if (sistemaSalud == 2) {
	            return "Isapre";
	        } else {
	            return "Tipo de sistema de salud no especificado";
	        }
	    }

	    // Método para analizar al usuario
	    @Override
	    public void analizarUsuario() {
	        super.analizarUsuario();
	        System.out.println("Datos del cliente:");
	        System.out.println("Dirección: " + direccion);
	        System.out.println("Comuna: " + comuna);
	    }
	    
	    
		// Accesores 
		public int getRut() {
			return RUT;
		}
				
		public String getNombres() {
			return nombres;
		}
		
		public String getApellidos() {
			return apellidos;
		}

		public String getTelefono() {
			return telefono;
		}
		
		public String getAFP() {
		    return AFP;
		}

		public int getSistemaSalud() {
			return sistemaSalud;
		}
		
		
		public String getDireccion() {
			return direccion;
		}
		
		public String getComuna() {
			return comuna;
		}
		
		public int getEdad() {
			return edad;
		}
		
		// Modificadores
		public void setRut(int RUT) {
		    if (RUT > 0 && RUT < 99999999) {
		        this.RUT = RUT;
		    } else {
		        throw new IllegalArgumentException("RUT debe ser un número positivo menor a 99.999.999");
		    }
		}

		public void setNombres(String nombres) {
		    if (nombres.length() >= 5 && nombres.length() <= 30) {
		        this.nombres = nombres;
		    } else {
		        throw new IllegalArgumentException("Nombres debe tener entre 5 y 30 caracteres.");
		    }
		}

		public void setApellidos(String apellidos) {
		    if (apellidos.length() >= 5 && apellidos.length() <= 30) {
		        this.apellidos = apellidos;
		    } else {
		        throw new IllegalArgumentException("Apellidos debe tener entre 5 y 30 caracteres.");
		    }
		}

		public void setTelefono(String telefono) {
		    if (telefono != null && !telefono.isEmpty()) {
		        this.telefono = telefono;
		    } else {
		        throw new IllegalArgumentException("Teléfono es obligatorio.");
		    }
		}
		
		public void setSistemaSalud(int sistemaSalud) {
		    if (sistemaSalud == 1 || sistemaSalud == 2) {
		        this.sistemaSalud = sistemaSalud;
		    } else {
		        throw new IllegalArgumentException("Sistema de salud debe ser 1 para Fonasa o 2 para Isapre.");
		    }
		}


		public void setAFP(String AFP) {
		    if (AFP.length() >= 4 && AFP.length() <= 30) {
		        this.AFP = AFP;
		    } else {
		        throw new IllegalArgumentException("AFP debe tener entre 4 y 30 caracteres.");
		    }
		}

		public void setDireccion(String direccion) {
		    if (direccion.length() <= 70) {
		        this.direccion = direccion;
		    } else {
		        throw new IllegalArgumentException("Dirección debe tener máximo 70 caracteres.");
		    }
		}

		public void setComuna(String comuna) {
		    if (comuna.length() <= 50) {
		        this.comuna = comuna;
		    } else {
		        throw new IllegalArgumentException("Comuna debe tener máximo 50 caracteres.");
		    }
		}

		public void setEdad(int edad) {
		    if (edad >= 0 && edad < 150) {
		        this.edad = edad;
		    } else {
		        throw new IllegalArgumentException("Edad debe ser un número mayor o igual a cero y menor a 150.");
		    }
		}
		
		@Override
		public String toString() {
		    return "Cliente{" +
		           "nombre='" + getNombre() + '\'' +
		           ", fechaDeNacimiento=" + new SimpleDateFormat("dd/MM/yyyy").format(getFechaDeNacimiento()) +
		           ", RUN=" + getRUN() +
		           ", RUT=" + RUT +
		           ", nombres='" + nombres + '\'' +
		           ", apellidos='" + apellidos + '\'' +
		           ", telefono='" + telefono + '\'' +
		           ", AFP='" + AFP + '\'' +
		           ", sistemaSalud=" + (sistemaSalud == 1 ? "Fonasa" : "Isapre") +
		           ", direccion='" + direccion + '\'' +
		           ", comuna='" + comuna + '\'' +
		           ", edad=" + edad +
		           '}';
		}
}
