import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vuelo>vuelos=new ArrayList<>();
        vuelos.add(new Vuelo("AAL 933","New York","Santiago", LocalDateTime.of(2021,8,29,5,39),62));
        vuelos.add(new Vuelo("LAT 755","Sao Paulo","Santiago",LocalDateTime.of(2021,8,31,4,45),47));
        vuelos.add(new Vuelo("SKU 621","Rio De Janeiro","Santiago",LocalDateTime.of(2021,8,30,16,0),52));
        vuelos.add(new Vuelo("DAL 147","Atlanta","Santiago",LocalDateTime.of(2021,8,29,13,22),59));
        vuelos.add(new Vuelo("AVA 241","Bogota","Santiago",LocalDateTime.of(2021,8,31,14,5),25));
        vuelos.add(new Vuelo("AMX 10","Mexico City","Santiago",LocalDateTime.of(2021,8,31,5,20),29));
        vuelos.add(new Vuelo("IBE 683","Londres","Santiago",LocalDateTime.of(2021,8,30,8,45),55));
        vuelos.add(new Vuelo("LAT 2479","Frankfurt","Santiago",LocalDateTime.of(2021,8,29,7,41),51));
        vuelos.add(new Vuelo("SKU 803","Lima","Santiago",LocalDateTime.of(2021,8,30,10,35),48));
        vuelos.add(new Vuelo("LAT 533","Los Ángeles","Santiago",LocalDateTime.of(2021,8,29,9,14),59));
        vuelos.add(new Vuelo("LAT 1447","Guayaquil","Santiago",LocalDateTime.of(2021,8,31,8,33),31));
        vuelos.add(new Vuelo("CMP 111","Panama City","Santiago",LocalDateTime.of(2021,8,31,15,15),29));
        vuelos.add(new Vuelo("LAT 705","Madrid","Santiago",LocalDateTime.of(2021,8,30,8,14),47));
        vuelos.add(new Vuelo("AAL 957","Miami","Santiago",LocalDateTime.of(2021,8,29,22,53),60));
        vuelos.add(new Vuelo("ARG 5091","Buenos Aires","Santiago",LocalDateTime.of(2021,8,31,9,57),32));
        vuelos.add(new Vuelo("LAT 1283","Cancún","Santiago",LocalDateTime.of(2021,8,31,4,0),35));
        vuelos.add(new Vuelo("LAT 579","Barcelona","Santiago",LocalDateTime.of(2021,8,29,7,45),61));
        vuelos.add(new Vuelo("AAL 945","Dallas-Fort Worth","Santiago",LocalDateTime.of(2021,8,30,7,12),58));
        vuelos.add(new Vuelo("LAT 501","París","Santiago",LocalDateTime.of(2021,8,29,18,29),49));
        vuelos.add(new Vuelo("LAT 405","Montevideo","Santiago",LocalDateTime.of(2021,8,30,15,45),39));
        ordenamiento(vuelos);
        ultVuelo(vuelos);
    }
    public static int buscaMenor(List<Vuelo>a, int index){
        int i=index+1;
        while(i<a.size()){
            if(a.get(index).getLlegada().compareTo(a.get(i).getLlegada())<0){
                i++;
            }else{
                index=i;
                i++;
            }
        }
        return index;
    }

    public static void ordenamiento(List<Vuelo> a){
        Vuelo aux;
        int index=0,menor=0;
        for(int i=0; i< a.size();i++){
            menor=buscaMenor(a,index);
            aux=a.get(index);
            a.set(index,a.get(menor));
            a.set(menor,aux);
            index++;
        }
        for(Vuelo b: a){
            System.out.println(b.toString());
        }

    }

    public static void ultVuelo(List<Vuelo>a){
        int i=1;
        int index=0;
        while(i<a.size()){
            if(a.get(index).getLlegada().compareTo(a.get(i).getLlegada())>0){
                i++;
            }else{
                index=i;
                i++;
            }
        }
        System.out.println("EL ULTIMO VUELO EN LLEGAR: "+a.get(index).toString());
    }
}



