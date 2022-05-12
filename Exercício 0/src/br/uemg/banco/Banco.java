package br.uemg.banco;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Agencia> agencias;
	private Endereco endereco;
	private String cnpj;
	
	
	public Banco(String cnpj, Endereco endereco) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		agencias = new ArrayList<Agencia> ();
	}
	
	
	public void inserirAgencia(Agencia agencia) {
		agencias.add(agencia);
	}
}
