package Interfaces;

import Pagamentos.Quota;

import java.util.List;

public interface IAssociacaoDesportiva {
    void inscreverAssociadoEmActividade(ISocio socio, IActividadeDesportiva actividade);
    void calcularDivida(List<ISocioOrdinarioDirigente> listaSocios, int ano);
    void actualizarQuota(Quota quota);
}
