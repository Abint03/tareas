import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDateTime llegada;
    private int pasajeros;

    public Vuelo(String nombre, String origen, String destino, LocalDateTime llegada, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.llegada = llegada;
        this.pasajeros = pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDateTime getLlegada() {
        return llegada;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo: " +
                "nombre: " + nombre +
                ", origen: " + origen +
                ", destino: " + destino +
                ", llegada: " + llegada +
                ", pasajeros:" + pasajeros;
    }

}
