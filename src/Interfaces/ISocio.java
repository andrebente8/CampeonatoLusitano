package Interfaces;

import Pagamentos.Quota;

public interface ISocio {

    void inscreverActividade(IActividadeDesportiva novaActividade);

    Boolean podeSeInscrever();
}
