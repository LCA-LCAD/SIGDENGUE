package models;

import java.util.Date;

/**
 * Created by lcad on 30/06/15.
 */
public class ExameLaboratorial {
    private int id;
    private String nomeLaboratorio;
    private Date dataColeta;
    private int resultado; //0 - Negativo | 1 - Positivo

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeLaboratorio() {
        return nomeLaboratorio;
    }
    public void setNomeLaboratorio(String nomeLaboratorio) {
        this.nomeLaboratorio = nomeLaboratorio;
    }
    public Date getDataColeta() {
        return dataColeta;
    }
    public void setDataColeta(Date dataColeta) {
        this.dataColeta = dataColeta;
    }
    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        String resultadoExame;

        if (resultado == 1)
            resultadoExame = "Positivo";
        else resultadoExame = "Negativo";

        return ("Exame " + id + "\nNome do labotatório: " + nomeLaboratorio + "\nData da coleta: " + dataColeta + "\nResultado: " + resultadoExame);
    }
}
