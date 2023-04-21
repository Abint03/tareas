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
}
