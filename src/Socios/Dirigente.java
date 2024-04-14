package Socios;

import Actividades.Inscricao;
import Enums.Estatuto;
import Interfaces.IActividadeDesportiva;
import Interfaces.ISocio;
import Interfaces.ISocioHonorarioDirigente;


public class Dirigente extends Socio implements ISocioHonorarioDirigente, ISocio {
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
}
