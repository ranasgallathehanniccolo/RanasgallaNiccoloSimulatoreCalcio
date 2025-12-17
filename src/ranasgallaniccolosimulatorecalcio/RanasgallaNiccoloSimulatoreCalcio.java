package ranasgallaniccolosimulatorecalcio;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class RanasgallaNiccoloSimulatoreCalcio {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("giocatori.txt"));
        Random random = new Random();

        String nomeCasa = input.nextLine().trim();
        Giocatore[] giocatoriCasa = new Giocatore[10];
        for (int i = 0; i < 10; i++) {
            String linea = input.nextLine().trim();
            String[] dati = linea.split(",");
            String nome = dati[0].trim();
            String cognome = dati[1].trim();
            int forza = Integer.parseInt(dati[2].trim());
            giocatoriCasa[i] = new Giocatore(nome + " " + cognome, forza);
        }
        String lineaPortiereCasa = input.nextLine().trim();
        String[] datiPortiereCasa = lineaPortiereCasa.split(",");
        String nomeP = datiPortiereCasa[0].trim();
        String cognomeP = datiPortiereCasa[1].trim();
        int forzaP = Integer.parseInt(datiPortiereCasa[2].trim());
        int parataP = Integer.parseInt(datiPortiereCasa[3].trim());
        Portiere portiereCasa = new Portiere(parataP, nomeP + " " + cognomeP, forzaP);
        Squadra casa = new Squadra(nomeCasa, giocatoriCasa, portiereCasa);

        
        String nomeTrasferta = input.nextLine().trim();
        Giocatore[] giocatoriTrasferta = new Giocatore[10];
        for (int i = 0; i < 10; i++) {
            String linea = input.nextLine().trim();
            String[] dati = linea.split(",");
            String nome = dati[0].trim();
            String cognome = dati[1].trim();
            int forza = Integer.parseInt(dati[2].trim());
            giocatoriTrasferta[i] = new Giocatore(nome + " " + cognome, forza);
        }
        String lineaPortiereTrasferta = input.nextLine().trim();
        String[] datiPortiereTrasferta = lineaPortiereTrasferta.split(",");
        String nomePT = datiPortiereTrasferta[0].trim();
        String cognomePT = datiPortiereTrasferta[1].trim();
        int forzaPT = Integer.parseInt(datiPortiereTrasferta[2].trim());
        int parataPT = Integer.parseInt(datiPortiereTrasferta[3].trim());
        Portiere portiereTrasferta = new Portiere(parataPT, nomePT + " " + cognomePT, forzaPT);
        Squadra trasferta = new Squadra(nomeTrasferta, giocatoriTrasferta, portiereTrasferta);

        
       
        Partita partita = new Partita(casa, trasferta);
        partita.generaInfortuni();
        System.out.print("SQUADRA DI CASA: " + casa.getNome());
        System.out.println(" ("+casa.getForzaTotale()+")");
        stampaGiocatori(casa);

        System.out.print("\nSQUADRA IN TRASFERTA: " + trasferta.getNome());
        System.out.println(" ("+trasferta.getForzaTotale()+")");
        stampaGiocatori(trasferta);
        
        partita.simulazione();

        System.out.println("\nRISULTATO FINALE:");
        System.out.println(casa.getNome() + " " + partita.getGolCasa());
        System.out.println(trasferta.getNome() + " " + partita.getGolTrasferta());

    }
    private static void stampaGiocatori(Squadra squadra) {
        for (Giocatore g : squadra.getGiocatori()) {
            System.out.print(g.getCognome() + " , Forza: " + g.getForza() + " , ");
                    if(g.isInfortunato()){
                        System.out.println("INFORTUNATO");
                    }
                    else{
                        System.out.println("OK");
                    }
        }
        Portiere p = squadra.getPortiere();
        System.out.println(p.getCognome() + " , Forza: " + p.getForza() + " , Parata: " + p.getAbilitaParata());
    }
}





