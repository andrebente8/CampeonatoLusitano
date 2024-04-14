import java.util.List;

import Interfaces.IActividadeDesportiva;
import Interfaces.IAssociacaoDesportiva;
import Socios.Socio;

public class AssociacaoDesportiva implements IAssociacaoDesportiva {
    private String nome;
    private String descricao;
    private List<Socio> associadosInscritos;

    public AssociacaoDesportiva(String nome, String descricao, List<Socio> associadosInscritos) {
        this.nome = nome;
        this.descricao = descricao;
        this.associadosInscritos = associadosInscritos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Socio> getAssociadosInscritos() {
        return associadosInscritos;
    }

    public void setAssociadosInscritos(List<Socio> associadosInscritos) {
        this.associadosInscritos = associadosInscritos;
    }

    @Override
    public void inscreverAssociadoEmActividade(Socio socio, IActividadeDesportiva actividade) {

    }
}
