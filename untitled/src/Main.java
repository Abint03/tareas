import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vuelo>vuelos=new LinkedList<Vuelo>();
        vuelos.add(new Vuelo("AAL 933","New York","Santiago",new Date(1899,8,29,05,39),62));
        vuelos.add(new Vuelo("AAL 933","New York","Santiago",new Date(1899,8,29,05,39),62));
        LocalDate a=LocalDate.of(2000,8,29);
        LocalDate b=LocalDate.of(2000,8,29);
        a.compareTo(b);
        System.out.print(a.compareTo(b));

    }
}