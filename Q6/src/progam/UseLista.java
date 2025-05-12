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

	}

}
