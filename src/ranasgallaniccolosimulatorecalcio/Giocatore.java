package ranasgallaniccolosimulatorecalcio;

import java.util.Random;

public class Giocatore {
    private String cognome;
    private int forza;
    private boolean infortunato = false;
    private Random random = new Random();
/**
 * costruttore giocatore
 * @param cognome
 * @param forza 
 */
    public Giocatore(String cognome, int forza) {
        this.cognome = cognome;
        this.forza = forza;
    }
/**
 * getter cognome
 * @return 
 */
    public String getCognome() {
        return cognome;
    }
/**
 * getter forza, ma se è infortunato può detratte dalla forza del giocatore massimo il 50%
 * @return 
 */
    public int getForza() {
        if (infortunato) {
            return Math.max(0, forza - random.nextInt(50));
        }
        return forza;
    }
/**
 * metodo per rendere infortunato un giocatore
 */
    public void infortuna() {
        infortunato = true;
    }
/**
 * metodo per capire se è infortunato oppure no
 * @return 
 */
    public boolean isInfortunato() {
        return infortunato;
    }
}
