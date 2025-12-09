/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ranasgallaniccolosimulatorecalcio;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author ranasgalla.niccolo
 */
public class Squadra {
    private String nome;
    private Giocatore[] giocatori;
    private Portiere portiere;
    private int forzaTotale = 0;
    private int propabilitaGoal;

    public Squadra(String nome, int forzaTotale, int propabilitaGoal) {
        this.nome = nome;
        this.forzaTotale = forzaTotale;
        this.propabilitaGoal = propabilitaGoal;
        giocatori = new Giocatore[9];
    }

    public String getNome() {
        return nome;
    }

    public Giocatore[] getGiocatori() {
        return giocatori;
    }
    
    public int getForzaTotale() {
        return forzaTotale;
    }

    public int getPropabilitaGoal() {
        return propabilitaGoal;
    }

    public Portiere getPortiere() {
        return portiere;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setForzaTotale(int forzaTotale) {
        this.forzaTotale = forzaTotale;
    }

    public void setPropabilitaGoal(int propabilitaGoal) {
        this.propabilitaGoal = propabilitaGoal;
    }

    @Override
    public String toString() {
        return "Squadra{" + "nome=" + nome + ", giocatori=" + giocatori + ", forzaTotale=" + forzaTotale + ", propabilitaGoal=" + propabilitaGoal + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Squadra other = (Squadra) obj;
        if (this.forzaTotale != other.forzaTotale) {
            return false;
        }
        if (this.propabilitaGoal != other.propabilitaGoal) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.giocatori, other.giocatori);
    }
    public int sommaTotale(){
        for(int i = 0; i < giocatori.length; i++){
            forzaTotale += giocatori[i].getForza();
        }
        return forzaTotale;
    }
}
