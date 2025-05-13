package progam;

import lista.Lista;

public class UseLista {

	public static void main(String[] args) {
		Lista lista1 = new Lista();
		Lista lista2 = new Lista();
		
		System.out.println("Colocando dados na lista1...");
		lista1.inserirPrimeiro(1);
		lista1.inserirUltimo(2);
		lista1.inserirUltimo(3);
		lista1.inserirUltimo(4);
		lista1.inserirUltimo(5);
		lista1.inserirUltimo(6);
		
		System.out.println("Colocando dados na lista2...");
		lista2.inserirPrimeiro(10);
		lista2.inserirUltimo(11);
		lista2.inserirUltimo(12);
		lista2.inserirUltimo(13);
		lista2.inserirUltimo(14);
		lista2.inserirUltimo(15);
		lista2.inserirUltimo(20);
		
		if (lista1.tamanho() == lista2.tamanho() && lista1.vtotal() == lista2.vtotal()) {
			System.out.printf("As duas listas são iguais !!! tamanho das listas é : %d com valor total de  : %d",
					lista1.tamanho(), lista1.vtotal());
		} else {
			if (lista1.vtotal() > lista2.vtotal()) {
				System.out.println("A lista1 e maior que a da lista2!!!");
			} else if (lista1.vtotal() == lista2.vtotal()) {
				System.out.println("As duas listas tem o mesmo valor total de soma !!!");
			} else {
				System.out.println("A lista2 é maior que a lista1!!!");
			}
		}
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.printf("O maior nº da lista1 é : %d o menor : %d e a média é : %.2f",lista1.getMaior(),lista1.getMenor(),lista1.media());
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.printf("O maior nº da lista2 é : %d o menor : %d e a média é : %.2f",lista2.getMaior(),lista2.getMenor(),lista2.media());
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.printf("Na lista1 temos %d de elementos impares e %d de elementos pares",lista1.getImpar(),lista1.getPar());
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.printf("Na lista2 temos %d de elementos impares e %d de elementos pares",lista2.getImpar(),lista2.getPar());
		
		System.out.println();
		System.out.println();
		System.out.println("---------------------Transferindo elemento 10 e 15 da lista2 para a lista1...---------------------");
		lista1.inserirUltimo(lista2.elementoNaPosicao(lista2.buscaElemento(10)).valor);
		lista1.inserirUltimo(lista2.elementoNaPosicao(lista2.buscaElemento(15)).valor);
		
		System.out.println();
		System.out.println("---------------------Mostrando lista1---------------------");
		for(int i = 0 ; i < lista1.tamanho();i++) {
			System.out.println("Posição "+(i+1)+" valor :"+lista1.elementoNaPosicao(i).valor);
		}
		
		System.out.println();
		System.out.println("---------------------Mostrando lista2---------------------");
		for(int i = 0 ; i < lista2.tamanho();i++) {
			System.out.println("Posição "+(i+1)+" valor :"+lista2.elementoNaPosicao(i).valor);
		}
		
		
	}

}
