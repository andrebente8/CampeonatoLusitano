package Socios;

import Enums.Estatuto;
import Interfaces.SocioHonorarioDirigente;

public class Honorario extends Socio implements SocioHonorarioDirigente {
    public Honorario(String nome, Integer nSocio, String BI, String nContribuinte, String morada, Integer nTelefone, String email, Estatuto estatuto) {
        super(nome, nSocio, BI, nContribuinte, morada, nTelefone, email, Estatuto.HONORARIO);
    }

    @Override
    public void inscreverActividade() {

    }
}
