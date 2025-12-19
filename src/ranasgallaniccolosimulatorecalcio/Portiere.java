package ranasgallaniccolosimulatorecalcio;

public class Portiere extends Giocatore {
    private int abilitaParata;
/**
 * costruttore portiere
 * @param abilitaParata
 * @param cognome
 * @param forza 
 */
    public Portiere(int abilitaParata, String cognome, int forza) {
        super(cognome, forza);
        this.abilitaParata = abilitaParata;
    }
/**
 * getter di abilita parata
 * @return 
 */
    public int getAbilitaParata() {
        return abilitaParata;
    }
}
