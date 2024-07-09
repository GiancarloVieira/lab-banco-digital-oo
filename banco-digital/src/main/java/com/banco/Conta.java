package com.banco;

import lombok.Data;

@Data
public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato() {
        // Implementação abstrata do extrato
    }

    public void imprimirInfosComuns() {
        System.out.println("---------------------------------------");
        System.out.println("Extrato da Conta:");
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
        System.out.println("---------------------------------------");
  }
}

