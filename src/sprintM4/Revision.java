package sprintM4;

public class Revision {
    // Atributos
    private int identificadorRevision;
    private int identificadorVisitaTerreno;
    private String nombreAlusivo;
    private String detalleParaRevisar;
    private int estado; // 1: sin problemas, 2: con observaciones, 3: no aprueba

    // Constructor vacío
    public Revision() {
    }

    // Constructor con todos los atributos
    public Revision(int identificadorRevision, int identificadorVisitaTerreno, String nombreAlusivo, String detalleParaRevisar, int estado) {
        setIdentificadorRevision(identificadorRevision);
        setIdentificadorVisitaTerreno(identificadorVisitaTerreno);
        setNombreAlusivo(nombreAlusivo);
        setDetalleParaRevisar(detalleParaRevisar);
        setEstado(estado);
    }

    // Métodos mutadores (setters)
    public void setIdentificadorRevision(int identificadorRevision) {
        this.identificadorRevision = identificadorRevision;
    }

    public void setIdentificadorVisitaTerreno(int identificadorVisitaTerreno) {
        this.identificadorVisitaTerreno = identificadorVisitaTerreno;
    }

    public void setNombreAlusivo(String nombreAlusivo) {
        if (nombreAlusivo.length() >= 10 && nombreAlusivo.length() <= 50) {
            this.nombreAlusivo = nombreAlusivo;
        } else {
            throw new IllegalArgumentException("El nombre alusivo debe tener entre 10 y 50 caracteres.");
        }
    }

    public void setDetalleParaRevisar(String detalleParaRevisar) {
        if (detalleParaRevisar.length() <= 100) {
            this.detalleParaRevisar = detalleParaRevisar;
        } else {
            throw new IllegalArgumentException("El detalle para revisar no puede exceder los 100 caracteres.");
        }
    }

    public void setEstado(int estado) {
        if (estado >= 1 && estado <= 3) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("El estado debe ser 1, 2 o 3.");
        }
    }

    // Métodos accesores (getters)
    public int getIdentificadorRevision() {
        return identificadorRevision;
    }

    public int getIdentificadorVisitaTerreno() {
        return identificadorVisitaTerreno;
    }

    public String getNombreAlusivo() {
        return nombreAlusivo;
    }

    public String getDetalleParaRevisar() {
        return detalleParaRevisar;
    }

    public int getEstado() {
        return estado;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Revisión{" +
                "identificadorRevision=" + identificadorRevision +
                ", identificadorVisitaTerreno=" + identificadorVisitaTerreno +
                ", nombreAlusivo='" + nombreAlusivo + '\'' +
                ", detalleParaRevisar='" + detalleParaRevisar + '\'' +
                ", estado=" + estado +
                '}';
    }
}
