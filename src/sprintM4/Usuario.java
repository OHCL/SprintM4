package sprintM4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Usuario implements Asesoria {
    // Atributos
    private String nombre;
    private Date fechaDeNacimiento;
    private int RUN;

    // Constructor vacío
    public Usuario() {}

    // Constructor con todos los atributos
    public Usuario(String nombre, String fechaDeNacimientoStr, int RUN) {
        setNombre(nombre);
        setFechaDeNacimiento(fechaDeNacimientoStr);
        setRUN(RUN);
    }

    // Métodos mutadores (setters)
    public void setNombre(String nombre) {
        if (nombre.length() >= 10 && nombre.length() <= 50) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Nombre debe tener entre 10 y 50 caracteres.");
        }
    }

    public void setFechaDeNacimiento(String fechaDeNacimientoStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.fechaDeNacimiento = sdf.parse(fechaDeNacimientoStr);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formato de fecha inválido. Debe ser 'DD/MM/AAAA'.");
        }
    }

    public void setRUN(int RUN) {
        if (RUN > 0 && RUN < 99999999) {
            this.RUN = RUN;
        } else {
            throw new IllegalArgumentException("RUN debe ser un número positivo menor a 99.999.999");
        }
    }

    // Métodos accesores (getters)
    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getRUN() {
        return RUN;
    }

    // Método mostrarEdad()
    public String mostrarEdad() {
    	Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(this.fechaDeNacimiento);
        
        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        if (fechaNac.get(Calendar.DAY_OF_YEAR) > fechaActual.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        
        return "El usuario tiene " + edad + " años";
    }

    // Método analizarUsuario()
    public void analizarUsuario() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("RUN: " + getRUN());
    }

    // Método toString()
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Usuario{" +
               "nombre='" + nombre + '\'' +
               ", fechaDeNacimiento=" + sdf.format(fechaDeNacimiento) +
               ", RUN=" + RUN +
               '}';
    }
}
