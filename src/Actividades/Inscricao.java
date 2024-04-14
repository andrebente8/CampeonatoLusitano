package Actividades;

import java.util.Date;
import Interfaces.IActividadeDesportiva;

public class Inscricao {
    private IActividadeDesportiva actividadeDesportiva;
    private Date dataInscricao;

    public Inscricao(IActividadeDesportiva actividadeDesportiva) {
        this.actividadeDesportiva = actividadeDesportiva;
        this.dataInscricao = new Date();
    }

    public IActividadeDesportiva getActividadeDesportiva() {
        return actividadeDesportiva;
    }

    public void setActividadeDesportiva(IActividadeDesportiva actividadeDesportiva) {
        this.actividadeDesportiva = actividadeDesportiva;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "actividadeDesportiva=" + actividadeDesportiva +
                ", dataInscricao=" + dataInscricao +
                '}';
    }
}
