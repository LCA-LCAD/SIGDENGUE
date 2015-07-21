package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import play.db.ebean.Model;
import java.util.ArrayList;

/**
 * Created by lcad on 30/06/15.
 */
@Entity
public class Endereco extends Model{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private String logradouro;
    private int numero;
    private boolean geoInconsistente;
    private int numeroQuarteirao;
    private String tempoPermanencia;
    private String turnos;
    private String diasSemana;

    /*private ArrayList<Integer> turnos; //1 - Manhã, 2 - Tarde, 3 - Noite, 4 - Madrugada
            private ArrayList<Integer> diasSemana; //1 - Segunda, ..., 7 - Domingo
            */
    /*public Endereco(Suspeito suspeito){
        this.suspeito = suspeito;
    }*/

    public String getTurnos(){
        return turnos;
    }
    public void setTurnos(String turnos){
        this.turnos = turnos;
    }
    public String getDiasSemana(){
        return diasSemana;
    }
    public void setDiasSemana(String diasSemana){
        this.diasSemana = diasSemana;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean isGeoInconsistente() {
        return geoInconsistente;
    }
    public void setGeoInconsistente(boolean geoInconsistente) {
        this.geoInconsistente = geoInconsistente;
    }
    public int getNumeroQuarteirao() {
        return numeroQuarteirao;
    }
    public void setNumeroQuarteirao(int numeroQuarteirao) {
        this.numeroQuarteirao = numeroQuarteirao;
    }
    public String getTempoPermanencia() {
        return tempoPermanencia;
    }
    public void setTempoPermanencia(String tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
    }
    /*public ArrayList<Integer> getTurnos() {
        return turnos;
    }
    public void setTurnos(ArrayList<Integer> turnos) {
        this.turnos = turnos;
    }
    public ArrayList<Integer> getDiasSemana() {
        return diasSemana;
    }
    public void setDiasSemana(ArrayList<Integer> diasSemana) {
        this.diasSemana = diasSemana;
    }*/

    @Override
    public String toString() {
        return ("Endereco " + tipo + ". Logradouro: " + logradouro + " Número: " + numero);
    }
}
