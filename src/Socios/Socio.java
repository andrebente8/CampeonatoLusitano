package Socios;

import Actividades.ActividadeDesportiva;
import Actividades.Inscricao;
import Enums.Estatuto;
import Interfaces.IActividadeDesportiva;
import Interfaces.ISocio;

import java.util.ArrayList;
import java.util.List;

public abstract class Socio {

    private String nome;
    private Integer nSocio;
    private String BI;
    private String nContribuinte;
    private String morada;
    private Integer nTelefone;
    private String email;
    public Estatuto estatuto;

    private List<Inscricao> actividadesInscrito = new ArrayList<>();

    public Socio(String nome, Integer nSocio, String BI, String nContribuinte, String morada, Integer nTelefone, String email, Estatuto estatuto) {
        this.nome = nome;
        this.nSocio = nSocio;
        this.BI = BI;
        this.nContribuinte = nContribuinte;
        this.morada = morada;
        this.nTelefone = nTelefone;
        this.email = email;
        this.estatuto = estatuto;
    }


    public List<Inscricao> getActividadesInscrito() { return actividadesInscrito;}

    public void setActividadesInscrito(List<Inscricao> actividadesInscrito) { this.actividadesInscrito = actividadesInscrito;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getnSocio() {
        return nSocio;
    }

    public void setnSocio(Integer nSocio) {
        this.nSocio = nSocio;
    }

    public String getBI() {
        return BI;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }

    public String getnContribuinte() {
        return nContribuinte;
    }

    public void setnContribuinte(String nContribuinte) {
        this.nContribuinte = nContribuinte;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Integer getnTelefone() {
        return nTelefone;
    }

    public void setnTelefone(Integer nTelefone) {
        this.nTelefone = nTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Estatuto getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(Estatuto estatuto) {
        this.estatuto = estatuto;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nome='" + nome + '\'' +
                ", nSocio=" + nSocio +
                ", BI='" + BI + '\'' +
                ", nContribuinte='" + nContribuinte + '\'' +
                ", morada='" + morada + '\'' +
                ", nTelefone=" + nTelefone +
                ", email='" + email + '\'' +
                ", estatuto=" + estatuto +
                ", actividadesInscrito=" + actividadesInscrito +
                '}';
    }
}
