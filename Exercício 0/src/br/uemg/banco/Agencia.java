package br.uemg.banco;

import java.util.ArrayList;

public class Agencia {
	private String nomeGerente;
	private ArrayList<ContaCorrente> contasCorrentes;
	private Endereco endereco;

	// Construtor
	public Agencia(String nomeGerente, Endereco endereco) {
		this.nomeGerente = nomeGerente;
		this.endereco = endereco;
		contasCorrentes = new ArrayList<ContaCorrente>();
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}

	public void inserirContaCorrente(ContaCorrente novaCC) {
		contasCorrentes.add(novaCC);
	}

	public double obtemSaldoCC(String numeroConta) {
		for (ContaCorrente cc : contasCorrentes) {
			if (numeroConta.equals(cc.getNumeroConta())) {
				return cc.getSaldo(); // conta encontrada
			}
		}

		return Double.MIN_VALUE; // conta nao encontrada
	}
}
