/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolosimulatorecalcio;
import java.util.Random;
/**
 *
 * @author ranasgalla.niccolo
 */
public class Partita {
    private Squadra casa;
    private Squadra trasferta;
    private int golCasa;
    private int golTrasferta;
    
    private Random random = new Random();

    public Partita(Squadra casa, Squadra trasferta, int golCasa, int golTrasferta) {
        this.casa = casa;
        this.trasferta = trasferta;
        this.golCasa = golCasa;
        this.golTrasferta = golTrasferta;
    }

    public Squadra getCasa() {
        return casa;
    }

    public Squadra getTrasferta() {
        return trasferta;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public int getGolTrasferta() {
        return golTrasferta;
    }

    public void setCasa(Squadra casa) {
        this.casa = casa;
    }

    public void setTrasferta(Squadra trasferta) {
        this.trasferta = trasferta;
    }

    public void setGolCasa(int golCasa) {
        this.golCasa = golCasa;
    }

    public void setGolTrasferta(int golTrasferta) {
        this.golTrasferta = golTrasferta;
    }
    public void simulazione(){
        int forzaCasa = casa.getForzaTotale();
        int forzaTrasferta = trasferta.getForzaTotale();
        int parateCasa = casa.getPortiere().
        int parataTrasferta = 
        
        double probGolCasa = 
    }
}
