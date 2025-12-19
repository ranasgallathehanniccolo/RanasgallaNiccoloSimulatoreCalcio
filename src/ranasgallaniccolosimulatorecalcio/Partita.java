package ranasgallaniccolosimulatorecalcio;

import java.util.Random;

public class Partita {
    private Squadra casa;
    private Squadra trasferta;
    private int golCasa = 0;
    private int golTrasferta = 0;
    private Random random = new Random();
/**
 * costruttore partita
 * @param casa
 * @param trasferta 
 */
    public Partita(Squadra casa, Squadra trasferta) {
        this.casa = casa;
        this.trasferta = trasferta;
    }

/**
 * metodo per generare infortunio ai giocatori avendo il 10% di possibilità
 * @param squadra 
 */
    private void generaInfortuni(Squadra squadra) {
        for (Giocatore g : squadra.getGiocatori()) {
            if (!g.isInfortunato() && random.nextInt(100) < 10) {
                g.infortuna();
            }
        }
    }
/**
 * metodo che utilizza il metodo generainfortuni su entrambe le squadre
 */
    public void generaInfortuni() {
        generaInfortuni(casa);
        generaInfortuni(trasferta);
    }
/**
 * metodo che va a simulare i gol basandosi sulla forza delle squadre
 */
    public void simulazione() {
        double forzaCasa = casa.getForzaTotale();
        double forzaTrasferta = trasferta.getForzaTotale();
        double parataCasa = casa.getPortiere().getAbilitaParata();
        double parataTrasferta = trasferta.getPortiere().getAbilitaParata();

        double probGolCasa = (forzaCasa / (forzaCasa + forzaTrasferta + parataTrasferta)) * 100;
        double probGolTrasferta = (forzaTrasferta / (forzaCasa + forzaTrasferta + parataCasa)) * 100;

        for (int i = 0; i < 5; i++) {
            if (random.nextInt(100) < probGolCasa) golCasa++;
            if (random.nextInt(100) < probGolTrasferta) golTrasferta++;
        }
    }

    public int getGolCasa() { return golCasa; }
    public int getGolTrasferta() { return golTrasferta; }
}


