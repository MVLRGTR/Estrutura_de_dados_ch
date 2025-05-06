package progam;

import entities.Pilha;

public class OrdemCrescente {

	public static void main(String[] args) {

		Pilha pilha = new Pilha();
		Pilha pilhaAux = new Pilha();
		int temp = 0;

		pilha.empilhar(3);
		pilha.empilhar(6);
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(4);
		pilha.empilhar(5);

		while (!pilha.isEmpty()) {
			temp = pilha.desempilhar();

			while (!pilhaAux.isEmpty() && pilhaAux.topo.value > temp) {
				pilha.empilhar(pilhaAux.desempilhar());
			}
			pilhaAux.empilhar(temp);
		}

		System.out.println("Pilha Ordenada :");
		while (!pilhaAux.isEmpty()) {
			System.out.printf("%d", pilhaAux.desempilhar());
		}
	}

}
