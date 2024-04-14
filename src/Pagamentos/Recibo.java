package Pagamentos;

import Interfaces.ISocio;

public class Recibo {
    private ISocio socio;
    private Quota quota;

    public Recibo(ISocio socio, Quota quota) {
        this.socio = socio;
        this.quota = quota;
    }

    public ISocio getSocio() {
        return socio;
    }

    public void setSocio(ISocio socio) {
        this.socio = socio;
    }

    public Quota getQuota() {
        return quota;
    }

    public void setQuota(Quota quota) {
        this.quota = quota;
    }
}
