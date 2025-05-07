package program;

import lista.Lista;

public class UseListaPilha {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println("Empilhando dados na Lista...");
		
		lista.inserirPrimeiro(1);
		
		lista.inseriUltimo(2);
		lista.inseriUltimo(3);
		lista.inseriUltimo(4);
		lista.inseriUltimo(5);
		lista.inseriUltimo(6);
		
		System.out.println("-------------------------");
		System.out.println("Tamanho da lista : "+lista.tamanho());
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i));
		}
		
		System.out.println("-------------------------");
		System.out.println("Inserindo 8 na posição 4...");
		lista.insereNaPosicao(8, 4);
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i));
		}
		
		System.out.println("-------------------------");
		System.out.println("Removendo posição 4");
		lista.removeNaPosicao(4);
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i));
		}
		
		System.out.println("-------------------------");
		System.out.println("Empilhando valor 11...");
		lista.empilhar(11);
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i));
		}
		
		System.out.println("-------------------------");
		System.out.println("Desempilhando... : "+lista.desempilhar());
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i));
		}
		
		while (true) {
		    try {
		        System.out.println("desempilhando : " + lista.desempilhar());
		    } catch (RuntimeException e) {
		        System.out.println(e.getMessage());
		        break;
		    }
		}
		
		System.out.println("");
		System.out.println("lista recomeçando -------------------------------");
		
		for(int i = 0 ; i < 7;i++) {
			System.out.println("Empilhando : "+(i+1));
			lista.empilhar(i+1);
		}
		System.out.println("Mostrando Lista!!!");
		for(int i = 0 ; i < lista.tamanho();i++) {
			System.out.println("Posição : "+(i+1)+" Valor : "+lista.elementoNaPosicao(i));
		}
		
	}

}
