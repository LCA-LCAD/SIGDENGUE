package models;

import java.util.Date;

/**
 * Created by lcad on 30/06/15.
 */
public class Viagem {
    private int id;
    private String pais;
    private String estado;
    private String municipio;
    private Date dataIda;
    private Date dataRetorno;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public Date getDataIda() {
        return dataIda;
    }
    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }
    public Date getDataRetorno() {
        return dataRetorno;
    }
    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    @Override
    public String toString() {
        return ("Viagem " + id + "\n" + municipio + " | " + estado + " | " + pais + "\n");
    }
}
