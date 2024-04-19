package sprintM4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Accidente {
    // Atributos
    private int identificadorAccidente;
    private int RUTCliente;
    private Date dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    // Constructor vacío
    public Accidente() {}

    // Constructor con todos los atributos
    public Accidente(int identificadorAccidente, int RUTCliente, String diaStr, String hora, String lugar, String origen, String consecuencias) {
        setIdentificadorAccidente(identificadorAccidente);
        setRUTCliente(RUTCliente);
        setDia(diaStr); // Acepta String y lo convierte a Date
        setHora(hora);
        setLugar(lugar);
        setOrigen(origen);
        setConsecuencias(consecuencias);
    }

    // Métodos mutadores (setters)
    public void setIdentificadorAccidente(int identificadorAccidente) {
        this.identificadorAccidente = identificadorAccidente;
    }

    public void setRUTCliente(int RUTCliente) {
        this.RUTCliente = RUTCliente;
    }

    public void setDia(String diaStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dia = sdf.parse(diaStr);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formato de fecha inválido. Debe ser 'DD/MM/AAAA'.");
        }
    }

    public void setHora(String hora) {
        if (hora.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida. Debe ser 'HH:MM'.");
        }
    }

    public void setLugar(String lugar) {
        if (lugar.length() >= 10 && lugar.length() <= 50) {
            this.lugar = lugar;
        } else {
            throw new IllegalArgumentException("Lugar debe tener entre 10 y 50 caracteres.");
        }
    }

    public void setOrigen(String origen) {
        if (origen.length() <= 100) {
            this.origen = origen;
        } else {
            throw new IllegalArgumentException("Origen no puede exceder los 100 caracteres.");
        }
    }

    public void setConsecuencias(String consecuencias) {
        if (consecuencias.length() <= 100) {
            this.consecuencias = consecuencias;
        } else {
            throw new IllegalArgumentException("Consecuencias no pueden exceder los 100 caracteres.");
        }
    }

    // Métodos accesores (getters)
    public int getIdentificadorAccidente() {
        return identificadorAccidente;
    }

    public int getRUTCliente() {
        return RUTCliente;
    }

    public Date getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    // Método toString()
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Accidente{" +
                "identificadorAccidente=" + identificadorAccidente +
                ", RUTCliente=" + RUTCliente +
                ", dia=" + sdf.format(dia) +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
