package models;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by lcad on 30/06/15.
 */
public class Sintomas {
    private int id;
    private Date dataPrimeirosSintomas;
    private ArrayList<Sintoma> sintomas;
    private ArrayList<Sangramento> sangramentos;
    private ArrayList<Sintoma> sintomasPersistentes;
    private boolean utilizaMedicamento; //Utilização de medicamento rotineiro
    private String medicamentosRotina; //Medicamentos utilizados rotineiramente
    private boolean usouMedicamento; //Utilizou medicamentos relacionados a Dengue
    private String medicamentosUsados; //Medicamentos utilizados após dengue
    private boolean vacinadoFebreAmarela; //Indivíduo é vacinado contra a Febre Amarela

    public Sintomas(){
        sintomas = new ArrayList<Sintoma>();
        sangramentos = new ArrayList<Sangramento>();
        sintomasPersistentes = new ArrayList<Sintoma>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDataPrimeirosSintomas() {
        return dataPrimeirosSintomas;
    }
    public void setDataPrimeirosSintomas(Date dataPrimeirosSintomas) {
        this.dataPrimeirosSintomas = dataPrimeirosSintomas;
    }
    public ArrayList<Sintoma> getSintomas() {
        return sintomas;
    }
    public void setSintomas(ArrayList<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }
    public ArrayList<Sintoma> getSistemasPersistem() {
        return sintomasPersistentes;
    }
    public void setSintomasPersistem(ArrayList<Sintoma> sintomasPersistem) {
        this.sintomasPersistentes = sintomasPersistem;
    }
    public ArrayList<Sangramento> getSangramentos() {
        return sangramentos;
    }
    public void setSangramentos(ArrayList<Sangramento> sangramentos) {
        this.sangramentos = sangramentos;
    }
    public boolean isUtilizaMedicamento() {
        return utilizaMedicamento;
    }
    public void setUtilizaMedicamento(boolean utilizaMedicamento) {
        this.utilizaMedicamento = utilizaMedicamento;
    }
    public String getMedicamentosRotina() {
        return medicamentosRotina;
    }
    public void setMedicamentosRotina(String medicamentosRotina) {
        this.medicamentosRotina = medicamentosRotina;
    }
    public boolean isUsouMedicamento() {
        return usouMedicamento;
    }
    public void setUsouMedicamento(boolean usouMedicamento) {
        this.usouMedicamento = usouMedicamento;
    }
    public String getMedicamentosUsados() {
        return medicamentosUsados;
    }
    public void setMedicamentosUsados(String medicamentosUsados) {
        this.medicamentosUsados = medicamentosUsados;
    }
    public boolean isVacinadoFebreAmarela() {
        return vacinadoFebreAmarela;
    }
    public void setVacinadoFebreAmarela(boolean vacinadoFebreAmarela) {
        this.vacinadoFebreAmarela = vacinadoFebreAmarela;
    }
}
