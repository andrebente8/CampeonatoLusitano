package Socios;

import Actividades.Inscricao;
import Enums.Estatuto;
import Interfaces.IActividadeDesportiva;
import Interfaces.ISocio;
import Interfaces.ISocioOrdinarioDirigente;
import Pagamentos.Quota;
import Pagamentos.Recibo;

public class Ordinario extends Socio implements ISocio, ISocioOrdinarioDirigente {

    public Ordinario(String nome, Integer nSocio, String BI, String nContribuinte, String morada, Integer nTelefone, String email, Estatuto estatuto) {
        super(nome, nSocio, BI, nContribuinte, morada, nTelefone, email, Estatuto.ORDINARIO);
    }


    @Override
    public void inscreverActividade(IActividadeDesportiva novaActividade) {
        if(this.podeSeInscrever())
            super.getActividadesInscrito().add(new Inscricao(novaActividade));
        else
            System.out.println("Um ordinario não deve estar inscrito em mais de duas Actividade");
    }

    @Override
    public Boolean podeSeInscrever() {
        return super.getActividadesInscrito().size() < 2;
    }

    @Override
    public void pagarQuota(Quota quota) {
        super.getListaRecibos().add(new Recibo(this, quota));
    }
}
