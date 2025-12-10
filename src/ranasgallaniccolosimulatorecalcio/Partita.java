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
    private int golCasa = 0;
    private int golTrasferta = 0;
    
    private Random random = new Random();
    double probGolCasa=0.0;
    double probGolTrasferta=0.0;
    
    public Partita(Squadra casa, Squadra trasferta) {
        this.casa = casa;
        this.trasferta = trasferta;
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
    private void randomCasa(){
        int numero = random.nextInt(100);
        if(numero<= probGolCasa){
            golCasa++;
        }
    }
    private void randomTrasferta(){
        int numero = random.nextInt(100);
        if(numero<= probGolTrasferta){
            golTrasferta++;
        }
    }
    public void simulazione(){
        int forzaCasa = casa.getForzaTotale();
        int forzaTrasferta = trasferta.getForzaTotale();
        int forzaTotale = forzaCasa+forzaTrasferta;
        int parataCasa = casa.getPortiere().getAbilitaParata();
        int parataTrasferta = trasferta.getPortiere().getAbilitaParata();
        
        probGolCasa = (forzaCasa/(forzaTotale+parataTrasferta))*100;
        probGolTrasferta = (forzaTrasferta/(forzaTotale+parataCasa))*100;
        
        randomCasa();
        randomTrasferta();
        
        
    }
}
