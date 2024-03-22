import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GestioneEventi gestioneEventi = new GestioneEventi();

        Evento evento1 = new Evento("Fiera dell'Artigianato", "Rho Fiera Milano", 180);
        Evento evento2 = new Evento("Lucca Comics and Games", "Lucca", 180);
        Evento evento3 = new Evento("appuntamento", "Milano", 120);

        OffsetDateTime data1 = OffsetDateTime.parse("2023-12-01T09:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2022-11-30T09:00:00Z");
        OffsetDateTime data3 = OffsetDateTime.parse("2023-12-01T09:00:00Z");

        Map<OffsetDateTime, Evento> eventoMap = new HashMap<>(Map.of());
        eventoMap.put(data1, evento1);
        eventoMap.put(data2, evento2);
        eventoMap.put(data3, evento3);

        gestioneEventi.addEvento(data1, evento1);
        gestioneEventi.removeEvento(data2, evento2);
        gestioneEventi.visualizzaEvento();
        System.out.println(eventoMap);

    }
}