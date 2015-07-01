package models;

import java.util.Date;
/**
 * Created by lcad on 30/06/15.
 */
public class BuscaAtiva {
    private int id;
    private Date dataBusca;
    private String horario;
    private String atendidoPor;
    private String observacoes;
    private int idAgenteResponsavel;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDataBusca() {
        return dataBusca;
    }
    public void setDataBusca(Date dataBusca) {
        this.dataBusca = dataBusca;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getAtendidoPor() {
        return atendidoPor;
    }
    public void setAtendidoPor(String atendidoPor) {
        this.atendidoPor = atendidoPor;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public int getIdAgenteResponsavel() {
        return idAgenteResponsavel;
    }
    public void setIdAgenteResponsavel(int idAgenteResponsavel) {
        this.idAgenteResponsavel = idAgenteResponsavel;
    }
}
