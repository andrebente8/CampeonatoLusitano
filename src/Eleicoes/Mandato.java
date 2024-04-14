package Eleicoes;

import Interfaces.IMandato;
import Socios.Dirigente;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Mandato implements IMandato {

    private Date dataInicio;
    private Date dataFim;
    private List<Dirigente> listaDirigentes;

    public Mandato(Date dataInicio, Date dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        listaDirigentes = new ArrayList<>();
    }

    @Override
    public void adicionarDirigente(Dirigente dirigente) {
        listaDirigentes.add(dirigente);
        System.out.println("Dirigente Adicionado");
    }

    @Override
    public void removerDirigente(Dirigente dirigente) {
        listaDirigentes.remove(dirigente);
        System.out.println("Dirigente removido");
    }

    @Override
    public void mostrarDirigentes() {
        System.out.println("Dirigentes Eleitos");
        listaDirigentes.forEach(element -> {
            System.out.println(element.toString());
        });
    }

    @Override
    public String toString() {
        return "Mandato{" +
                "dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", listaDirigentes=" + listaDirigentes +
                '}';
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<Dirigente> getListaDirigentes() {
        return listaDirigentes;
    }

    public void setListaDirigentes(List<Dirigente> listaDirigentes) {
        this.listaDirigentes = listaDirigentes;
    }
}
