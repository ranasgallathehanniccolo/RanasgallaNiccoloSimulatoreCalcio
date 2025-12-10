/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolosimulatorecalcio;
import java.util.Scanner;
/**
 *
 * @author ranasgalla.niccolo
 */
public class Test {
    public void avvia(){
        Scanner input = new Scanner();
        System.out.println("Nome della scquadra di casa");
        String nomeCasa = input.nextLine();
        Giocatore []giocatori;
        for(int i = 0; i<9; i++){
            System.out.println("Nome giocatore?");
            String nomeGiocatore = input.nextLine();
            System.out.println("Quanta forza ha?");
            int forza = input.nextInt();
            
        }
        
    }
}
