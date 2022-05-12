package br.uemg.principal;

import br.uemg.banco.Agencia;
import br.uemg.banco.Banco;
import br.uemg.banco.ContaCorrente;
import br.uemg.banco.Endereco;

public class UsaContaCorrente {

	public static void main(String[] args) {
		
		 Endereco enderecoBanco = new Endereco("Rua 24",(char)55, "Hollywood", "38408-046","Uberlandia","Minas gerais");	
         Banco b1 = new Banco("1445676/0001-9", enderecoBanco);
         
         
         Endereco enderecoAgencia = new Endereco("Rua 17",(char)255, "Tiradentes", "384094-046","Uberlandia","Minas gerais");
         Agencia ag = new Agencia("Jose Carlos", enderecoAgencia);
	   
		
		 ContaCorrente cc1 = new ContaCorrente("01234-4","Roberto Carlos","28/04/2022");  // Instancia o objeto ContaCorrente
		 cc1.depositar(20000.00);
		 ag.inserirContaCorrente(cc1);
		 
		 ContaCorrente cc2 = new ContaCorrente("01834-X","Rogerio Garcia","28/04/2022");  // Instancia o objeto ContaCorrente
		 cc2.depositar(15000.00);
		 ag.inserirContaCorrente(cc2);
		 
		 ContaCorrente cc3 = new ContaCorrente("99978-3","Renata Firenzi","28/04/2022");  // Instancia o objeto ContaCorrente
		 cc3.depositar(10000.00);
		 ag.inserirContaCorrente(cc3);
		 
		 
		 System.out.println(ag.obtemSaldoCC("i"));
		 
	}

}
