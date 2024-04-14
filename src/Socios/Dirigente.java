package Socios;

import Actividades.Inscricao;
import Enums.Estatuto;
import Interfaces.IActividadeDesportiva;
import Interfaces.ISocio;
import Interfaces.ISocioHonorarioDirigente;
import Interfaces.ISocioOrdinarioDirigente;
import Pagamentos.Quota;
import Pagamentos.Recibo;


public class Dirigente extends Socio implements ISocioHonorarioDirigente, ISocio, ISocioOrdinarioDirigente {
    public Dirigente(String nome, Integer nSocio, String BI, String nContribuinte, String morada, Integer nTelefone, String email, Estatuto estatuto) {
        super(nome, nSocio, BI, nContribuinte, morada, nTelefone, email, Estatuto.DIRIGENTE);
    }


    @Override
    public void inscreverActividade(IActividadeDesportiva novaActividade) {
        if(this.podeSeInscrever())
            super.getActividadesInscrito().add(new Inscricao(novaActividade));
        else
            System.out.println("Não pode se inscrever, Dirigente " +this.getNome());
    }

    @Override
    public Boolean podeSeInscrever() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void pagarQuota(Quota quota) {
        super.getListaRecibos().add(new Recibo(this, quota));
    }

    @Override
    public Boolean quotasEmDia(int anoQuota) {
        boolean retVal = false;
        for(Recibo recibo: this.getListaRecibos())
            if( recibo.getQuota().getAno() == anoQuota){ retVal = true; break; }
        return retVal;
    }
}
