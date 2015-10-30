package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;
//import sispncd.DadosGeraisUBV;

import javax.persistence.*;
@Entity
public class RG extends Model{
    private String localidade;
    private Integer n_Quart;
    @Id
    private Integer n_lote;


    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public Integer getN_Quart() {
        return n_Quart;
    }

    public void setN_Quart(Integer n_Quart) {
        this.n_Quart = n_Quart;
    }

    public Integer getN_lote() {
        return n_lote;
    }

    public void setN_lote(Integer n_lote) {
        this.n_lote = n_lote;
    }
}
