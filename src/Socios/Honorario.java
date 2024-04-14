package Socios;

import Actividades.Inscricao;
import Enums.Estatuto;
import Interfaces.IActividadeDesportiva;
import Interfaces.ISocioHonorarioDirigente;
import Interfaces.ISocio;

public class Honorario extends Socio implements ISocioHonorarioDirigente, ISocio {
    public Honorario(String nome, Integer nSocio, String BI, String nContribuinte, String morada, Integer nTelefone, String email, Estatuto estatuto) {
        super(nome, nSocio, BI, nContribuinte, morada, nTelefone, email, Estatuto.HONORARIO);
    }


    @Override
    public void inscreverActividade(IActividadeDesportiva novaActividade) {
        if(this.podeSeInscrever())
            super.getActividadesInscrito().add(new Inscricao(novaActividade));
        else
            System.out.println("Não pode se inscrever");
    }

    @Override
    public Boolean podeSeInscrever() {
        return true;
    }
}
