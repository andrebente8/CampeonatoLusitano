package Interfaces;

import Pagamentos.Quota;


public interface ISocioOrdinarioDirigente {
    void pagarQuota(Quota quota);
    Boolean quotasEmDia(int anoQuota);
}
