package Socios;

import Enums.Estatuto;
import Interfaces.SocioHonorarioDirigente;

public class Dirigente extends Socio implements SocioHonorarioDirigente {
    public Dirigente(String nome, Integer nSocio, String BI, String nContribuinte, String morada, Integer nTelefone, String email, Estatuto estatuto) {
        super(nome, nSocio, BI, nContribuinte, morada, nTelefone, email, Estatuto.DIRIGENTE);
    }

    @Override
    public void inscreverActividade() {

    }
}
