package Uninter;

import java.util.Scanner;

public class Principal {
	//Classe principal
	public static void main(String[] args) {
		
		// Lista de Menú ao usuário:
		
		Scanner teclado = new Scanner (System.in); 
		Cofrinho cofrinho = new Cofrinho();
		int opcao;
		System.out.println("BEM-VINDO(A) AO COFRINHO! :) \n");
		System.out.println("Selecione a opcao desejada:\n");
		System.out.println("1 - Adicionar moeda");
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("0 - Encerrar o programa"); 
		opcao=teclado.nextInt();
		
		//Loop para que o usuário não selecione outra opção que não seja a do Menú:
		
		int tipoMoe;
		double valor;
		Moeda Moe;
		double soma;
		while(opcao!=0) {
			switch(opcao){
			
			//Adicionar moeda por tipo e valor :
			case 1: 
				tipoMoe=0;
				while(tipoMoe>3 || tipoMoe<=0) {
					System.out.println("Selecione o tipo de moeda que deseja Adicionar:");
					System.out.println("1 - Dolar"); 	
					System.out.println("2 - Euro"); 
					System.out.println("3 - Real"); 
					tipoMoe=teclado.nextInt();
				}	
				System.out.println("Qual o valor?"); 
				valor = teclado.nextDouble();
				Moe = null;
				if(tipoMoe==1) {
					Moe = new Dolar(valor);
				}
				if(tipoMoe==2) {
					Moe = new Euro(valor);
				}
				if(tipoMoe==3) {
					Moe = new Real(valor);
				}
				cofrinho.adicionar(Moe);
				break;
				
			//Remover moeda por características listadas pelo usuário:
			case 2: 
				tipoMoe=0;
				while(tipoMoe>3 || tipoMoe<=0) {
					System.out.println("Selecione o tipo de moeda que deseja Remover:");
					System.out.println("1 - Dolar"); 	
					System.out.println("2 - Euro"); 
					System.out.println("3 - Real"); 
					tipoMoe=teclado.nextInt();
				}	
				System.out.println("Qual o valor?"); 
				valor = teclado.nextDouble();
				Moe = null;
				if(tipoMoe==1) {
					Moe = new Dolar(valor);
				}
				if(tipoMoe==2) {
					Moe = new Euro(valor);
				}
				if(tipoMoe==3) {
					Moe = new Real(valor);
				}
				cofrinho.remover(Moe);
				break;
				
			//Listar moedas que foram adicionadas e estão armazenadas no cofrinho:
			case 3: 
				cofrinho.listar();
				break;
				
			//Caso o usuário insira um valor que não está no menú (Ou seja, se sair do Loop), aparecerá a frase de opção inválida e o menú novamente
			default:
				System.out.println("Opcao invalida. Tente novamente."); 
			}
			
			System.out.println("BEM VINDO AO COFRINHO! :)");
			System.out.println("Selecione a opcao desejada: ");
			System.out.println("1 - Adicionar moeda");
			System.out.println("2 - Remover moeda");
			System.out.println("3 - Listar moeda");
			System.out.println("0 - Encerrar o programa"); 
			opcao=teclado.nextInt();
		}			
	}
		
}
