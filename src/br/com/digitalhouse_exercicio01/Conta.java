package br.com.digitalhouse_exercicio01;

public class Conta {

    private Integer numeroDaConta;
    private Double saldo;
    private Cliente titular;

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void deposito(Double quantiaDeDinheiro) {

        saldo = saldo + quantiaDeDinheiro;

        System.out.println("Depósito realizado com sucesso! O novo saldo é: " + saldo);
    }

    public void saque(Double quantiaDeDinheiro) {

        if (saldo >= quantiaDeDinheiro) {

            saldo = saldo - quantiaDeDinheiro;

            System.out.println("Saque realizado com sucesso! O novo saldo é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}