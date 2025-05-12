package progam;

import pilha.Pilha;

public class UsePilhas {

	public static void main(String[] args) {
		Pilha pilha1 = new Pilha();
		Pilha pilha2 = new Pilha();
		Pilha pilhaTemp = new Pilha();
		int valorTemp = 0;

		System.out.println("Empilhando dados na pilha 1...");
		pilha1.empilhar(1);
		pilha1.empilhar(2);
		pilha1.empilhar(3);
		pilha1.empilhar(4);
		pilha1.empilhar(5);
		pilha1.empilhar(6);

		System.out.println("Empilhando dados na pilha 2...");
		pilha2.empilhar(12);
		pilha2.empilhar(11);
		pilha2.empilhar(10);
		pilha2.empilhar(9);
		pilha2.empilhar(8);
		pilha2.empilhar(7);

		if (pilha1.tamanho() == pilha2.tamanho() && pilha1.valorTotal() == pilha2.valorTotal()) {
			System.out.printf("As duas pilhas são iguais !!! tamanho das pilhas é : %d com valor total de  : %d",
					pilha1.tamanho(), pilha1.valorTotal());
		} else {
			if (pilha1.valorTotal() > pilha2.valorTotal()) {
				System.out.println("A pilha1 e maior que a da pilha2!!!");
			} else if (pilha1.valorTotal() == pilha2.valorTotal()) {
				System.out.println("As duas pilhas tem o mesmo valor total de soma !!!");
			} else {
				System.out.println("A pilha2 é maior que a pilha1!!!");
			}
		}
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.printf("O maior nº da pilha1 é : %d o menor : %d e a média é : %.2f",pilha1.vMaior(),pilha1.vMenor(),pilha1.media());
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.printf("O maior nº da pilha2 é : %d o menor : %d e a média é : %.2f",pilha2.vMaior(),pilha2.vMenor(),pilha2.media());
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.printf("Na pilha1 temos %d de elementos impares e %d de elementos pares",pilha1.getImpar(),pilha1.getPar());
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.printf("Na pilha2 temos %d de elementos impares e %d de elementos pares",pilha2.getImpar(),pilha2.getPar());
		
		System.out.println();
		System.out.println();
		System.out.println("---------------------Transferindo elementos da Pilha1 para a Pilha2---------------------");
		while(!pilha1.estaVazio()) {
			valorTemp = pilha1.desempilhar();
			System.out.println("Copiando o valor : "+valorTemp+" da pilha1 para a pilha2...");
			pilha2.empilhar(valorTemp);
			pilhaTemp.empilhar(valorTemp);
		}
		while(!pilhaTemp.estaVazio()) {
			pilha1.empilhar(pilhaTemp.desempilhar());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("---------------------Desempilhando pilha1---------------------");
		while(!pilha1.estaVazio()) {
			System.out.println("Desempilhando : "+pilha1.desempilhar());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("---------------------Desempilhando pilha2---------------------");
		while(!pilha2.estaVazio()) {
			System.out.println("Desempilhando : "+pilha2.desempilhar());
		}
		
	}	

}
