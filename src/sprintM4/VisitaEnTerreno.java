package sprintM4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VisitaEnTerreno {
    // Atributos
    private int identificadorVisita;
    private int RUTCliente;
    private Date dia;
    private String hora;
    private String lugar;
    private String comentarios;

    // Constructor vacío
    public VisitaEnTerreno() {
    }

    // Constructor con todos los atributos
    public VisitaEnTerreno(int identificadorVisita, int RUTCliente, String dia, String hora, String lugar, String comentarios) {
        setIdentificadorVisita(identificadorVisita);
        setRUTCliente(RUTCliente);
        setDia(dia); // Acepta String y lo convierte a Date
        setHora(hora);
        setLugar(lugar);
        setComentarios(comentarios);
    }

    // Métodos mutadores (setters)
    public void setIdentificadorVisita(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
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

    public void setComentarios(String comentarios) {
        if (comentarios.length() <= 100) {
            this.comentarios = comentarios;
        } else {
            throw new IllegalArgumentException("Comentarios no pueden exceder los 100 caracteres.");
        }
    }

    // Métodos accesores (getters)
    public int getIdentificadorVisita() {
        return identificadorVisita;
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

    public String getComentarios() {
        return comentarios;
    }

    // Método toString()
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "VisitaEnTerreno{" +
                "identificadorVisita=" + identificadorVisita +
                ", RUTCliente=" + RUTCliente +
                ", dia=" + sdf.format(dia) +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
