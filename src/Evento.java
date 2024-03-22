public class Evento {
    private String nomeEvento;
    private String luogo;
    private Integer durata;

    public Evento(String nomeEvento, String luogo, Integer durata) {
        this.nomeEvento = nomeEvento;
        this.luogo = luogo;
        this.durata = durata;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    public String getLuogo() {
        return luogo;
    }
    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }
    public Integer getDurata() {
        return durata;
    }
    public void setDurata(Integer durata) {
        this.durata = durata;
    }
    @Override
    public String toString() {
        return "Evento{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", luogo='" + luogo + '\'' +
                ", durata=" + durata +
                '}';
    }
}
