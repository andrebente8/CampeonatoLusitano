import java.util.ArrayList;
import java.util.List;

import Interfaces.IActividadeDesportiva;
import Interfaces.IAssociacaoDesportiva;
import Interfaces.ISocio;
import Interfaces.ISocioOrdinarioDirigente;
import Pagamentos.Quota;
import Socios.Socio;

public class AssociacaoDesportiva implements IAssociacaoDesportiva {
    private String nome;
    private String descricao;
    private List<ISocio> associadosInscritos;
    private List<IActividadeDesportiva> actividadeDesportivas;

    public AssociacaoDesportiva(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.associadosInscritos = new ArrayList<>();
        this.actividadeDesportivas = new ArrayList<>();
    }

    @Override
    public void inscreverAssociadoEmActividade(ISocio socio, IActividadeDesportiva actividade) {
        socio.inscreverActividade(actividade);
    }

    @Override
    public void calcularDivida(List<ISocioOrdinarioDirigente> listaSocios, int ano) {
        double total = 0;
        for(ISocioOrdinarioDirigente socio: listaSocios)
            if(socio.quotasEmDia(ano)) total += 200;
        System.out.println("Divida Total: "+total);
    }

    @Override
    public void actualizarQuota(Quota quota) {
            quota.updateQuota(200);
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

    public List<ISocio> getAssociadosInscritos() {
        return associadosInscritos;
    }

    public List<IActividadeDesportiva> getActividadeDesportivas() {
        return actividadeDesportivas;
    }
}
