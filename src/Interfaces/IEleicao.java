package Interfaces;
import Eleicoes.Mandato;
import Socios.Dirigente;

public interface IEleicao {

    public void realizarEleicao();
    public void adicionarMandato(Mandato mandato);
    public void removerMandato(Mandato mandato);
}
