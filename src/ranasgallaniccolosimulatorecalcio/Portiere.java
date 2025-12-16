package ranasgallaniccolosimulatorecalcio;

public class Portiere extends Giocatore {
    private int abilitaParata;

    public Portiere(int abilitaParata, String cognome, int forza) {
        super(cognome, forza);
        this.abilitaParata = abilitaParata;
    }

    public int getAbilitaParata() {
        return abilitaParata;
    }
}
