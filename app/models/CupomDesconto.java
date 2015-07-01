package models;

import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by lcad on 25/06/15.
 */
@Entity
public class CupomDesconto extends Model {
    @Id @GeneratedValue
    private Long id;
    private String nomeDoCliente;
    private Double valor;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNomeDoCliente(){
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente){
        this.nomeDoCliente = nomeDoCliente;
    }

    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }
}
