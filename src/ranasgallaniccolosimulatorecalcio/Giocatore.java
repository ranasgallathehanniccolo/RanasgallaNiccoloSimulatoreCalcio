/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolosimulatorecalcio;

/**
 *
 * @author ranasgalla.niccolo
 */
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
        if(infortunato = true){
            return forza - 10;
        }
        return forza;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }
    public boolean isInfortunato(){
        return infortunato = true;
    }
}
