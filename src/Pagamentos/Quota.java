package Pagamentos;

import Interfaces.IQuota;

public class Quota implements IQuota {
    private int ano;
    private double valor;

    public Quota(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    @Override
    public void updateQuota(double newValor) {
        this.valor =  newValor;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }
}
