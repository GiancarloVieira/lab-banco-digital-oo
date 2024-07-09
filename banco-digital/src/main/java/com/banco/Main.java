package com.banco;

public class Main {
	public static void main(String[] args) {
			Banco banco = new Banco();
			banco.setNome("Meu Banco");

			Cliente cliente1 = new Cliente();
			cliente1.setNome("Cliente 1");

			Cliente cliente2 = new Cliente();
			cliente2.setNome("Cliente 2");

			Conta conta1 = new ContaCorrente(cliente1);
			Conta conta2 = new ContaPoupanca(cliente2);

			banco.getClientes().add(cliente1);
			banco.getClientes().add(cliente2);

			banco.getContas().add(conta1);
			banco.getContas().add(conta2);

			conta1.depositar(1000);
			conta1.transferir(200, conta2);

			conta1.imprimirExtrato();
			conta2.imprimirExtrato();

			banco.listarClientes();
	}
}
