package models;
import java.util.ArrayList;
import java.util.Date;

import play.db.ebean.Model;
//import sispncd.DadosGeraisUBV;

import javax.persistence.Entity;

@Entity
public class Suspeito extends Model{
    private int numeroBusca; //Chave
    private int numeroNotificacao;
    private Date dataNotificacao;
    private String nomeSuspeito;
    private String nomeMae;
    private String telefone1;
    private String telefone2;
    private Date dataNascimento;
    private boolean teveDengue; //Identifica se o indivíduo teve dengue anteriormente
    private boolean outroMunipio; //Identifica se o indivíduo é proveniente de outro indivíduo
    private String nomeOutroMunicipio; //Nome do município, caso seja proveniente de outro
    private boolean viajante; //Identifica se o suspeito viaja com frequência
    private boolean viagemRecente; //Identifica se o suspeito viajou recentemente
    private boolean realizouExame; //Exame laboratorial foi ou não realizado
    private ArrayList<Endereco> enderecos;
    private ArrayList<Viagem> viagens;
    private AtendimentoClinico dadosClinicos;
    private BuscaAtiva buscaAtiva;
    private Encerramento encerramento;
    private ArrayList<ExameLaboratorial> examesLaboratorial;
    private Sintomas sintomas;

    public Suspeito(){
        enderecos = new ArrayList<Endereco>();
        examesLaboratorial = new ArrayList<ExameLaboratorial>();
        viagens = new ArrayList<Viagem>();
    }

    public int getNumeroBusca() {
        return numeroBusca;
    }
    public void setNumeroBusca(int numeroBusca) {
        this.numeroBusca = numeroBusca;
    }
    public int getNumeroNotificacao() {
        return numeroNotificacao;
    }
    public void setNumeroNotificacao(int numeroNotificacao) {
        this.numeroNotificacao = numeroNotificacao;
    }
    public Date getDataNotificacao() {
        return dataNotificacao;
    }
    public void setDataNotificacao(Date dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }
    public String getNomeSuspeito() {
        return nomeSuspeito;
    }
    public void setNomeSuspeito(String nomeSuspeito) {
        this.nomeSuspeito = nomeSuspeito;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public String getTelefone1() {
        return telefone1;
    }
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }
    public String getTelefone2() {
        return telefone2;
    }
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public boolean isTeveDengue() {
        return teveDengue;
    }
    public void setTeveDengue(boolean teveDengue) {
        this.teveDengue = teveDengue;
    }
    public boolean isOutroMunipio() {
        return outroMunipio;
    }
    public void setOutroMunipio(boolean outroMunipio) {
        this.outroMunipio = outroMunipio;
    }
    public String getNomeOutroMunicipio() {
        return nomeOutroMunicipio;
    }
    public void setNomeOutroMunicipio(String nomeOutroMunicipio) {
        this.nomeOutroMunicipio = nomeOutroMunicipio;
    }
    public boolean isViajante() {
        return viajante;
    }
    public void setViajante(boolean viajante) {
        this.viajante = viajante;
    }
    public boolean isViagemRecente() {
        return viagemRecente;
    }
    public void setViagemRecente(boolean viagemRecente) {
        this.viagemRecente = viagemRecente;
    }
    public boolean isRealizouExame() {
        return realizouExame;
    }
    public void setRealizouExame(boolean realizouExame) {
        this.realizouExame = realizouExame;
    }
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }
    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public AtendimentoClinico getDadosClinicos() {
        return dadosClinicos;
    }

    public void setDadosClinicos(AtendimentoClinico dadosClinicos) {
        this.dadosClinicos = dadosClinicos;
    }

    public BuscaAtiva getBuscaAtiva() {
        return buscaAtiva;
    }

    public void setBuscaAtiva(BuscaAtiva buscaAtiva) {
        this.buscaAtiva = buscaAtiva;
    }

    public Encerramento getEncerramento() {
        return encerramento;
    }

    public void setEncerramento(Encerramento encerramento) {
        this.encerramento = encerramento;
    }

    public Sintomas getSintomas() {
        return sintomas;
    }

    public void setSintomas(Sintomas sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return ("Caso suspeito: " + numeroBusca +  "\nNome do suspeito: " + nomeSuspeito + "\nData da notificação: " + dataNotificacao);
    }

    public ArrayList<ExameLaboratorial> getExamesLaboratorial() {
        return examesLaboratorial;
    }

    public void setExamesLaboratorial(ArrayList<ExameLaboratorial> examesLaboratorial) {
        this.examesLaboratorial = examesLaboratorial;
    }

    public ArrayList<Viagem> getViagens() {
        return viagens;
    }

    public void setViagens(ArrayList<Viagem> viagens) {
        this.viagens = viagens;
    }
}
