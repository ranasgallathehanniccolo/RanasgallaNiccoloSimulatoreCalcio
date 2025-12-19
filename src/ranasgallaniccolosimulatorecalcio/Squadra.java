package ranasgallaniccolosimulatorecalcio;

public class Squadra {
    private String nome;
    private Giocatore[] giocatori;
    private Portiere portiere;
/**
 * costruttore squadra
 * @param nome
 * @param giocatori
 * @param portiere 
 */
    public Squadra(String nome, Giocatore[] giocatori, Portiere portiere) {
        this.nome = nome;
        this.giocatori = giocatori;
        this.portiere = portiere;
    }
/**
 * getter nome
 * @return 
 */
    public String getNome() {
        return nome;
    }
/**
 * getter giocatori
 * @return 
 */
    public Giocatore[] getGiocatori() {
        return giocatori;
    }
/**
 * getter portiere
 * @return 
 */
    public Portiere getPortiere() {
        return portiere;
    }
/**
 * getter della forza totale
 * @return 
 */
    public int getForzaTotale() {
        int totale = 0;
        for (Giocatore g : giocatori) {
            totale += g.getForza();
        }
        return totale;
    }
}
