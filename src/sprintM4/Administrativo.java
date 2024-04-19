package sprintM4;

import java.text.SimpleDateFormat;

public class Administrativo extends Usuario {
    // Atributos
    private String area;
    private String experienciaPrevia;

    // Constructor vacío
    public Administrativo() {
        super();
    }

    // Constructor con todos los atributos
    public Administrativo(String nombre, String fechaDeNacimiento, int RUN, String area, String experienciaPrevia) {
        super(nombre, fechaDeNacimiento, RUN);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    // Métodos mutadores (setters)
    public void setArea(String area) {
        if (area.length() >= 5 && area.length() <= 20) {
            this.area = area;
        } else {
            throw new IllegalArgumentException("El área debe tener entre 5 y 20 caracteres.");
        }
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        if (experienciaPrevia.length() <= 100) {
            this.experienciaPrevia = experienciaPrevia;
        } else {
            throw new IllegalArgumentException("La experiencia previa no puede exceder los 100 caracteres.");
        }
    }

    // Métodos accesores (getters)
    public String getArea() {
        return area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    // Método analizarUsuario()
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia Previa: " + experienciaPrevia);
    }

    // Método toString()
    @Override
    public String toString() {
        return "Administrativo{" +
               "nombre='" + getNombre() + '\'' +
               ", fechaDeNacimiento=" + new SimpleDateFormat("dd/MM/yyyy").format(getFechaDeNacimiento()) +
               ", RUN=" + getRUN() +
               ", área='" + area + '\'' +
               ", experienciaPrevia='" + experienciaPrevia + '\'' +
               '}';
    }
}
