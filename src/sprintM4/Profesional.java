package sprintM4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesional extends Usuario {
    private String titulo;
    private Date fechaIngreso;

    // Constructor vacío
    public Profesional() {
        super();
    }

    // Constructor con todos los atributos
    public Profesional(String nombre, String fechaDeNacimiento, int RUN, String titulo, String fechaIngreso) {
        super(nombre, fechaDeNacimiento, RUN);
        this.titulo = titulo;
        try {
            this.fechaIngreso = new SimpleDateFormat("dd/MM/yyyy").parse(fechaIngreso);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Métodos mutadores
    public void setTitulo(String titulo) {
        if (titulo.length() >= 10 && titulo.length() <= 50) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("El título debe tener entre 10 y 50 caracteres.");
        }
    }

    public void setFechaIngreso(String fechaIngreso) {
        try {
            this.fechaIngreso = new SimpleDateFormat("dd/MM/yyyy").parse(fechaIngreso);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Métodos accesores
    public String getTitulo() {
        return titulo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    // Método analizarUsuario()
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de Ingreso: " + new SimpleDateFormat("dd/MM/yyyy").format(fechaIngreso));
    }
    
    @Override
    public String toString() {
        return "Profesional{" +
               "nombre='" + getNombre() + '\'' +
               ", fechaDeNacimiento=" + new SimpleDateFormat("dd/MM/yyyy").format(getFechaDeNacimiento()) +
               ", RUN=" + getRUN() +
               ", título='" + titulo + '\'' +
               ", fechaIngreso=" + new SimpleDateFormat("dd/MM/yyyy").format(fechaIngreso) +
               '}';
    }
}
