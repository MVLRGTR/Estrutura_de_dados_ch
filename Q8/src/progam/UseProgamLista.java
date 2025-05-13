package progam;

import lista.Lista;

public class UseProgamLista {

	public static void main(String[] args) {
		
		Lista lista1 = new Lista();
		Lista lista2 = new Lista();
		Lista lista3 = new Lista();
		Lista lista4 = new Lista();
		
		System.out.println("Colando os elementos 1,1,2,3,5,8,13,21,34 na lista1");
		lista1.inserirPrimeiro(1);
		lista1.inserirUltimo(1);
		lista1.inserirUltimo(2);
		lista1.inserirUltimo(3);
		lista1.inserirUltimo(5);
		lista1.inserirUltimo(8);
		lista1.inserirUltimo(13);
		lista1.inserirUltimo(21);
		lista1.inserirUltimo(34);
		
		System.out.println();
		System.out.println("Colocando os elementos 1,2,3,4,5,6,7,8,9 na lista2");
		lista2.inserirPrimeiro(1);
		lista2.inserirUltimo(2);
		lista2.inserirUltimo(3);
		lista2.inserirUltimo(4);
		lista2.inserirUltimo(5);
		lista2.inserirUltimo(6);
		lista2.inserirUltimo(7);
		lista2.inserirUltimo(8);
		lista2.inserirUltimo(9);
		
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("Mostrando lista1:");
		System.out.println();
		for(int i = 0 ; i<lista1.tamanho();i++) {
			System.out.println("Posição "+(i+1)+" valor "+lista1.elementoNaPosicao(i).valor);
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("Mostrando lista2:");
		System.out.println();
		for(int i = 0 ; i<lista1.tamanho();i++) {
			System.out.println("Posição "+(i+1)+" valor "+lista2.elementoNaPosicao(i).valor);
		}
		
		System.out.println("elemento"+lista1.elementoNaPosicao(lista1.buscaElemento(1)).valor);
		
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("lista3 formando interção sem repetição da lista1 e 2...");
		for(int i = 0 ; i<lista1.tamanho();i++) {
			int temp = lista1.elementoNaPosicao(i).valor;
			if(i==0) {
				lista3.inserirPrimeiro(temp);
			}
			if(lista3.buscaElemento(temp) == -1) {
				lista3.inserirUltimo(temp);
			}
		}
		for(int i = 0 ; i<lista2.tamanho();i++) {
			int temp = lista2.elementoNaPosicao(i).valor;
			if(i==0) {
				if(lista3.buscaElemento(temp) == -1) {
					lista3.inserirPrimeiro(temp);
				}
			}
			if(lista3.buscaElemento(temp) == -1) {
				lista3.inserirUltimo(temp);
			}
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("Mostrando lista3:");
		System.out.println();
		for(int i = 0 ; i<lista3.tamanho();i++) {
			System.out.println("Posição "+(i+1)+" valor "+lista3.elementoNaPosicao(i).valor);
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("lista4 fazendo a interscção dos elementos da lista1 e lista2...");
		if(lista1.tamanho()<lista2.tamanho()) {
			for(int i = 0 ; i < lista1.tamanho();i++) {
				if(lista1.buscaElemento(i) != -1 && lista2.buscaElemento(i) != -1) {
					lista4.inserirUltimo(i);
				}
			}
		}else {
			for(int i = 0 ; i < lista2.tamanho();i++) {
				if(lista1.buscaElemento(i) != -1 && lista2.buscaElemento(i) != -1) {
					lista4.inserirUltimo(i);
				}
			}
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println("Mostrando lista4:");
		System.out.println();
		for(int i = 0 ; i<lista4.tamanho();i++) {
			System.out.println("Posição "+(i+1)+" valor "+lista4.elementoNaPosicao(i).valor);
		}
		
	}

}
