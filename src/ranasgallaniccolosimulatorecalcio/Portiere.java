/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolosimulatorecalcio;

/**
 *
 * @author ranasgalla.niccolo
 */
public class Portiere extends Giocatore{
    private int abilitaParata;

    public Portiere(int abilitaParata, String cognome, int forza) {
        super(cognome, forza);
        this.abilitaParata = abilitaParata;
    }

    public int getAbilitaParata() {
        return abilitaParata;
    }

    public void setAbilitaParata(int abilitaParata) {
        this.abilitaParata = abilitaParata;
    }
}
