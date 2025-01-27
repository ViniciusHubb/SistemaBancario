package senac.pe.faculdade.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Conta {
    //atributos
    private Cliente cliente;
    private int numero;
    private Agencia agencia;
    private Date dataAbertura;
    private double saldo;
    private boolean status;
    private ArrayList<Transacao> transacoes;

    public Conta(Cliente cliente, int numero, Agencia agencia, Date dataAbertura, double saldo, boolean status) {
        this.cliente = cliente;
        this.numero = numero;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.status = status;
        this.transacoes = new ArrayList<Transacao>();
    }

    public Conta() {

    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    //criando métodos

    //depositar
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.transacoes.add(new Transacao(TipoTransacao.DEPOSITO, valor, new Date(), '+'));
            return true;
        } else {
            return false;
        }
    }


    //sacar
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.transacoes.add(new Transacao(TipoTransacao.SAQUE, valor, new Date(), '-'));
            return true;
        } else {
            return false;
        }
    }

    //transferir
    public boolean transferir(double valor, Conta contaDestino) {
        if (valor > 0 && valor <= this.saldo && contaDestino != null) {
            this.saldo -= valor;
            this.transacoes.add(new Transacao(TipoTransacao.TRANSFERENCIA,
                    valor, new Date(), contaDestino, '-'));
            contaDestino.saldo += valor;
            contaDestino.transacoes.add(new Transacao(TipoTransacao.TRANSFERENCIA, valor, new Date(), this, '+'));
            return true;
        } else {
            return false;
        }
    }

    //imprimirExtrato
    public String imprimirExtrato() {
        String extrato = this.toString();
        if (this.transacoes.size() > 0) {
            extrato += "Data \t\t\t\t\t\t\t Lançamentos \t Agência/Conta \t Valor(R$)\n";
            extrato += "---------------------------------------------------------------------------- \n";
            for (Transacao transacao : this.transacoes) {
            extrato += transacao.toString() + "\n";
            }
        }
        return extrato;
    }


    @Override
    public String toString() {
        return "Agência: " + this.agencia.getNumero() + " / Conta: " + this.getNumero() + " / Saldo(R$): " + this.saldo + "\n" +
                "---------------------------------------------------------------------------- \n";
    }
}