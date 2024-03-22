import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.HashMap;
import java.util.Map;

public class GestioneEventi {
    private Map<OffsetDateTime, Evento> eventoHashMap;

    public GestioneEventi() {
        this.eventoHashMap = new HashMap<>();
    }
    public Map<OffsetDateTime, Evento> getEventoHashMap() {
        return eventoHashMap;
    }

    public void setEventoHashMap(HashMap<OffsetDateTime, Evento> eventoHashMap) {
        this.eventoHashMap = eventoHashMap;
    }

    @Override
    public String toString() {
        return "GestioneEventi{" +
                "eventoHashMap=" + eventoHashMap +
                '}';
    }
    public void addEvento(OffsetDateTime data, Evento evento) {
        //
        boolean result = data.isAfter(OffsetDateTime.now());
        //se true aggiungi evento
        if (result) {
            eventoHashMap.put(data, evento);
        }
        if (data.isEqual(OffsetDateTime.now())) {
            eventoHashMap.put(data, evento);
        }
        if (data.isBefore(OffsetDateTime.now())) {
            eventoHashMap.put(data, evento);
        }
        boolean resultVar = (eventoHashMap.containsKey(data));
        if (resultVar) {
            System.out.println("Non è possibile aggiungere evento");
        }
    }
    public void removeEvento(OffsetDateTime data, Evento evento) {
        for(Map.Entry<OffsetDateTime, Evento> entry : eventoHashMap.entrySet()) {
            if (entry.getKey().equals(data)) {
                eventoHashMap.remove(entry.getKey());
                System.out.println("Evento rimosso con successo" + evento);
            }
        }
    }
    public void visualizzaEvento() {
        if(!eventoHashMap.isEmpty()) {
            for (Map.Entry<OffsetDateTime, Evento> entry : eventoHashMap.entrySet()) {
                System.out.println(entry.getValue().toString() + ": " + entry.getKey().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
            }
        } else {
            System.out.println("Non ci sono eventi");
        }
    }
}
