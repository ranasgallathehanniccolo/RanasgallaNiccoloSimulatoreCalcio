package ranasgallaniccolosimulatorecalcio;

public class Squadra {
    private String nome;
    private Giocatore[] giocatori;
    private Portiere portiere;

    public Squadra(String nome, Giocatore[] giocatori, Portiere portiere) {
        this.nome = nome;
        this.giocatori = giocatori;
        this.portiere = portiere;
    }

    public String getNome() {
        return nome;
    }

    public Giocatore[] getGiocatori() {
        return giocatori;
    }

    public Portiere getPortiere() {
        return portiere;
    }

    public int getForzaTotale() {
        int totale = 0;
        for (Giocatore g : giocatori) {
            totale += g.getForza();
        }
        return totale;
    }
}
