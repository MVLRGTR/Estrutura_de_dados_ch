package progam;

import listaDupla.ListaDuplamenteEncadeada;

public class UseListaDupla {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		
		System.out.println("Inserindo dados na lista com o metodo paradrão da lista...");
		lista.inserePrimeiro(1);
		lista.insereUltimo(2);
		lista.insereUltimo(3);
		lista.insereUltimo(4);
		lista.insereUltimo(5);
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		System.out.println("Inserindo dados com o metodo InsereP da lista...");
		System.out.println("Inserindo 66 na posição 2 , com retorno : "+lista.InsereP(66, 2));
		System.out.println("Inserindo 6 na posição 6 , com retorno : "+lista.InsereP(6, 6));
		System.out.println("Inserindo 10 na posição 12 , com retorno : "+lista.InsereP(10, 12));
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		System.out.println("Removendo dados com o metodo RemoveP da lista...");
		System.out.println("Removendo a posição 2 , com retorno do metodo : "+lista.RemovaP(2));
		System.out.println("Removendo a posição 10 , com retorno do metodo : "+lista.RemovaP(10));

	}

}
