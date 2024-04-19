package sprintM4;

import java.util.Arrays;

public class Capacitacion {
    // Atributos
    private int identificador;
    private int RUTCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;

    // Constructor vacío
    public Capacitacion() {}

    // Constructor con todos los atributos
    public Capacitacion(int identificador, int RUTCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
        setIdentificador(identificador);
        setRUTCliente(RUTCliente);
        setDia(dia);
        setHora(hora);
        setLugar(lugar);
        setDuracion(duracion);
        setCantidadAsistentes(cantidadAsistentes);
    }

    // Métodos mutadores (setters)
    public void setIdentificador(int identificador) {
        // Verificar que el identificador sea un número positivo
        if (identificador > 0) {
            this.identificador = identificador;
        } else {
            throw new IllegalArgumentException("Identificador inválido.");
        }
    }

    public void setRUTCliente(int RUTCliente) {
        // Verificar que el RUT sea menor a 99.999.999
        if (RUTCliente > 0 && RUTCliente < 99999999) {
            this.RUTCliente = RUTCliente;
        } else {
            throw new IllegalArgumentException("RUT de cliente inválido.");
        }
    }

    public void setDia(String dia) {
        // Verificar que el día sea un valor permitido
        String[] diasValidos = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        if (Arrays.asList(diasValidos).contains(dia.toLowerCase())) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Día inválido.");
        }
    }

    public void setHora(String hora) {
        // Verificar que la hora sea válida
        if (hora.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida.");
        }
    }

    public void setLugar(String lugar) {
        // Verificar que el lugar tenga entre 10 y 50 caracteres
        if (lugar.length() >= 10 && lugar.length() <= 50) {
            this.lugar = lugar;
        } else {
            throw new IllegalArgumentException("Lugar inválido.");
        }
    }

    public void setDuracion(String duracion) {
        // Verificar que la duración no exceda los 70 caracteres
        if (duracion.length() <= 70) {
            this.duracion = duracion;
        } else {
            throw new IllegalArgumentException("Duración inválida.");
        }
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        // Verificar que la cantidad de asistentes sea menor que 1000
        if (cantidadAsistentes >= 0 && cantidadAsistentes < 1000) {
            this.cantidadAsistentes = cantidadAsistentes;
        } else {
            throw new IllegalArgumentException("Cantidad de asistentes inválida.");
        }
    
    
    }
    
 // Métodos accesores (getters)
    public int getIdentificador() {
        return identificador;
    }

    public int getRUTCliente() {
        return RUTCliente;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    
    @Override
    public String toString() {
        return "Capacitacion{" +
               "identificador=" + identificador +
               ", RUTCliente=" + RUTCliente +
               ", dia='" + dia + '\'' +
               ", hora='" + hora + '\'' +
               ", lugar='" + lugar + '\'' +
               ", duracion='" + duracion + '\'' +
               ", cantidadAsistentes=" + cantidadAsistentes +
               '}';
}
}

