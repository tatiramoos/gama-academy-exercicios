package app;

import java.util.Scanner;

import core.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int opcao;
		double valor;
		ContaBancaria conta = new ContaBancaria(1001,2, "Tatiane", "123.456.789.00", 100.00);
		
		do {
			System.out.println("TatiBank - Seu Banco na Internet!");
			System.out.println("Digite 1-Depósito | 2-Saque | 3-Info | 0-Sair");
			opcao = sc.nextInt();
			switch(opcao) {
				case 1: 
					System.out.println(">>> DEPOSITO - Digite o valor:");
					valor = sc.nextDouble();
					conta.depositar(valor);
					break;
				case 2: 
					System.out.println(">>> SAQUE - Digite o valor:");
					valor = sc.nextDouble();
					if (conta.sacar(valor)) {
						System.out.println("    SAQUE EFETUADO!");
					}
					
					else {
						System.out.println("    SAQUE INSUFICIENTE!");
					}
					
					break;
				case 3: 
						System.out.println(">>> INFO: "+conta.exibirDados());
						break;
				case 0:
					System.out.println(">>> OBRIGADO PELA PREFERÊNCIA - Volte Sempre!");
					break;
				default: 
					System.out.println("Opção Inválida");
			}
			
		} while (opcao != 0);
		
		
		
		sc.close();
	}

}
