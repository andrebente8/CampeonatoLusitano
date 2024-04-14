package Eleicoes;

import Interfaces.IEleicao;
import Socios.Dirigente;
import java.util.ArrayList;
import java.util.List;

public class Eleicao implements IEleicao {

    List<Mandato> listaMandatos = new ArrayList<>();

    @Override
    public void realizarEleicao() {
        /*
            * Criar um Mandato;
            * Adicionar os dirigentes do mandato;
            * adicionar mandato a lista de mandatos
        */
    }

    @Override
    public void adicionarMandato(Mandato mandato) {
        listaMandatos.remove(mandato);
        System.out.println("Dirigente Adicionado");
    }

    @Override
    public void removerMandato(Mandato mandato) {
        listaMandatos.remove(mandato);
        System.out.println("Dirigente Removido");
    }
}
