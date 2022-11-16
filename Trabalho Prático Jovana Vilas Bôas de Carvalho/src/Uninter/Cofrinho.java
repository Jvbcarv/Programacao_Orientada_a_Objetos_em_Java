package Uninter;

import java.util.ArrayList;

//classe cofrinho
public class Cofrinho {
	double valor;
	
	//Coleção de Moedas implementada por um ArrayList: 
	private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();
	
	//Adição de moeda:
	public void adicionar(Moeda a) {
		listaMoeda.add(a);	
	}
	//Remoção de moeda:
	public void remover(Moeda a) {
		listaMoeda.remove(a);	
	}
	//Listagem das moedas:
	public void listar() {
			for (Moeda a: listaMoeda){
			System.out.println(a);
			}
	}
	
}
	
