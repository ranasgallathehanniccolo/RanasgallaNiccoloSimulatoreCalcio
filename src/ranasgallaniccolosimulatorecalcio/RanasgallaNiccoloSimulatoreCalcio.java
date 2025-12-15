package ranasgallaniccolosimulatorecalcio;

import java.util.Scanner;

/**
 *
 * @author ranasgalla.niccolo
 */
public class RanasgallaNiccoloSimulatoreCalcio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome della scquadra in casa");
        String nomeCasa = input.nextLine();
        Giocatore []giocatoriCasa = new Giocatore[9];
        for(int i = 0; i<9; i++){
            System.out.println("Nome giocatore?");
            String nomeGiocatore = input.nextLine();
            System.out.println("Quanta forza ha?");
            int forza = input.nextInt();
            Giocatore g = new Giocatore(nomeGiocatore, forza);
            giocatoriCasa[i] = g;
            input.nextLine();
        }
        System.out.println("Nome portiere?");
        String nomePortiere = input.nextLine();
        System.out.println("Forza?");
        int forzaPortiere = input.nextInt();
        System.out.println("Abilità parata?");
        int abilitaParata = input.nextInt();
        Portiere pCasa = new Portiere(abilitaParata, nomePortiere, forzaPortiere);
        Squadra Casa = new Squadra(nomeCasa);
        System.out.println("Nome della scquadra in trasferta");
        String nomeTrasferta = input.nextLine();
        Giocatore []giocatoriTrasferta = new Giocatore[9];
        for(int i = 0; i<9; i++){
            System.out.println("Nome giocatore?");
            String nomeGiocatore = input.nextLine();
            System.out.println("Quanta forza ha?");
            int forza = input.nextInt();
            Giocatore g = new Giocatore(nomeGiocatore, forza);
            giocatoriTrasferta[i] = g;
            input.nextLine();
        }
        System.out.println("Nome portiere?");
        nomePortiere = input.nextLine();
        System.out.println("Forza?");
        forzaPortiere = input.nextInt();
        System.out.println("Abilità parata?");
        abilitaParata = input.nextInt();
        Portiere pTrasferta = new Portiere(abilitaParata, nomePortiere, forzaPortiere);
        Squadra Trasferta = new Squadra(nomeTrasferta);
        Partita p = new Partita(Casa, Trasferta);
        p.simulazione();
        System.out.println(p.getGolCasa());
        System.out.println(p.getGolTrasferta());
    }
    
}
