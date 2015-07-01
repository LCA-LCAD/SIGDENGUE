package models;

import java.util.Date;

/**
 * Created by lcad on 30/06/15.
 */
public class Encerramento {
    private int id;
    private boolean dadosOficiais;
    private int doenca; //0 - Dengue, 1 - Chikungunya, 2 - Zika (verificar: uma ou mais?)
    private int situacaoFinal;
    private String origem;
    private Date dataEncerramento;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isDadosOficiais() {
        return dadosOficiais;
    }
    public void setDadosOficiais(boolean dadosOficiais) {
        this.dadosOficiais = dadosOficiais;
    }
    public int getDoenca() {
        return doenca;
    }
    public void setDoenca(int doenca) {
        this.doenca = doenca;
    }
    public int getSituacaoFinal() {
        return situacaoFinal;
    }
    public void setSituacaoFinal(int situacaoFinal) {
        this.situacaoFinal = situacaoFinal;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public Date getDataEncerramento() {
        return dataEncerramento;
    }
    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }
}
