package Socios;

import Enums.Estatuto;

public class Ordinario extends Socio{
    public Ordinario(String nome, Integer nSocio, String BI, String nContribuinte, String morada, Integer nTelefone, String email, Estatuto estatuto) {
        super(nome, nSocio, BI, nContribuinte, morada, nTelefone, email, Estatuto.ORDINARIO);
    }
}
