import java.time.Instant;

public class Mail {
    private String mittente;
    private String oggetto;
    private Instant timestamp;
    private String testo;
    public Mail(String mittente,String testo){
        setMittente(mittente);
        setTimestamp();
        setTesto(testo);
    }
    public Mail(String mittente,String testo,String oggetto){
        setMittente(mittente);
        setOggetto(oggetto);
        setTimestamp();
        setTesto(testo);
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public void setTimestamp() {
        this.timestamp = Instant.now();
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getOggetto() {
        return oggetto;
    }

    public String getTesto() {
        return testo;
    }

    public String getMittente() {
        return mittente;
    }
}