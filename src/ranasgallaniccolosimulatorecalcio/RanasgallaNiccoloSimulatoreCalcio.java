package ranasgallaniccolosimulatorecalcio;

import java.util.Scanner;

public class RanasgallaNiccoloSimulatoreCalcio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

   
        System.out.println("Nome squadra di casa:");
        String nomeCasa = input.nextLine();

        Giocatore[] giocatoriCasa = new Giocatore[9];
        for (int i = 0; i < 9; i++) {
            System.out.println("Nome giocatore " + (i + 1) + ":");
            String nome = input.nextLine();

            System.out.println("Forza:");
            int forza = input.nextInt();
            input.nextLine();

            giocatoriCasa[i] = new Giocatore(nome, forza);
        }

        System.out.println("Nome portiere:");
        String nomePortiereCasa = input.nextLine();

        System.out.println("Forza portiere:");
        int forzaPortiereCasa = input.nextInt();

        System.out.println("Abilità parata:");
        int parataCasa = input.nextInt();
        input.nextLine();

        Portiere portiereCasa = new Portiere(parataCasa, nomePortiereCasa, forzaPortiereCasa);
        Squadra casa = new Squadra(nomeCasa, giocatoriCasa, portiereCasa);


        System.out.println("Nome squadra in trasferta:");
        String nomeTrasferta = input.nextLine();

        Giocatore[] giocatoriTrasferta = new Giocatore[9];
        for (int i = 0; i < 9; i++) {
            System.out.println("Nome giocatore " + (i + 1) + ":");
            String nome = input.nextLine();

            System.out.println("Forza:");
            int forza = input.nextInt();
            input.nextLine();

            giocatoriTrasferta[i] = new Giocatore(nome, forza);
        }

        System.out.println("Nome portiere:");
        String nomePortiereTrasferta = input.nextLine();

        System.out.println("Forza portiere:");
        int forzaPortiereTrasferta = input.nextInt();

        System.out.println("Abilità parata:");
        int parataTrasferta = input.nextInt();
        input.nextLine();

        Portiere portiereTrasferta = new Portiere(parataTrasferta, nomePortiereTrasferta, forzaPortiereTrasferta);
        Squadra trasferta = new Squadra(nomeTrasferta, giocatoriTrasferta, portiereTrasferta);


        Partita partita = new Partita(casa, trasferta);
        partita.simulazione();


        System.out.println("RISULTATO FINALE:");
        System.out.println(casa.getNome() + " " + partita.getGolCasa());
        System.out.println(trasferta.getNome() + " " + partita.getGolTrasferta());
    }
}
