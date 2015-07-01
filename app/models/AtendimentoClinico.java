package models;

/**
 * Created by lcad on 30/06/15.
 */
public class AtendimentoClinico {
    private int id;
    private String localAtendimento;
    private String notificadoPor;
    private String nomeMedico;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLocalAtendimento() {
        return localAtendimento;
    }
    public void setLocalAtendimento(String localAtendimento) {
        this.localAtendimento = localAtendimento;
    }
    public String getNotificadoPor() {
        return notificadoPor;
    }
    public void setNotificadoPor(String notificadoPor) {
        this.notificadoPor = notificadoPor;
    }
    public String getNomeMedico() {
        return nomeMedico;
    }
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }
}
