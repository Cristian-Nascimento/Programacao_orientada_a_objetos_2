package br.uemg.banco;

public class ContaCorrente {
	//Atributos
	private String numeroConta; //numero da conta corrente
	private String dataAbertura;
	private double saldo;
	private String nomeCorrentista;
	
	 
	
	
	// Construtor
	public ContaCorrente(String numeroConta, String novoNomeCorrentista, String dataAbertura) {
		this.numeroConta = numeroConta;
		nomeCorrentista = novoNomeCorrentista;
		this.dataAbertura = dataAbertura;
		saldo = 0.00; // nao necessita deposito inicial na abertura da conta
	}
	
	
	
	// Construtor
	public ContaCorrente(String numeroConta, String novoNomeCorrentista, String dataAbertura, double saldo) {
		this.numeroConta = numeroConta;
		nomeCorrentista = novoNomeCorrentista;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
			
	}
		
		
     public boolean depositar(double valorDeposito) {
    	 if (valorDeposito > 0) {
    		 saldo = saldo + valorDeposito;   // saldo += valor;
    		 return true;
    	 }
    	 return false;
     }
	
     
     public boolean sacar(double valorSaque) {
    	 if ((valorSaque > 0) && (valorSaque <= saldo)) {
    		 saldo = saldo - valorSaque;  
    		 return true;   // saque com sucesso
    	 }
    	 
    	 return false;  // saque impossivel
    	
     }
	
	// Metodos
	public String getNumeroConta() { // Getter
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) { //Setter
		this.numeroConta = numeroConta;
		
	}
	
	public String getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
