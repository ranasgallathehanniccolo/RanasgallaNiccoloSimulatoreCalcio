package ranasgallaniccolosimulatorecalcio;

public class Giocatore {
    private String cognome;
    private int forza;
    private boolean infortunato = false;

    public Giocatore(String cognome, int forza) {
        this.cognome = cognome;
        this.forza = forza;
    }

    public String getCognome() {
        return cognome;
    }

    public int getForza() {
        if (infortunato) {
            return Math.max(0, forza - 10);
        }
        return forza;
    }

    public void infortuna() {
        infortunato = true;
    }

    public boolean isInfortunato() {
        return infortunato;
    }
}
