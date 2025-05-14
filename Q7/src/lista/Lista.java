package lista;

public class Lista {
	 private static final int max = 100;
	 private Celula[] dados = new Celula[max];
	 private int inicio;
	 private int livre;
	 
	 public Lista() {
		 for(int i = 0 ; i < max ;i++) {
			 dados[i] = new Celula();
		 }
		 inicializar();
	 }
	 
	 public void inicializar() {
		 this.inicio = -1;
		 this.livre = 0;
		 for(int i = 0; i < max -1;i++) {
			 dados[i].proximo=i+1;
		 }
		 dados[max-1].proximo = -1;
	 }
	 
	 public boolean inserir(int valor) {
	        if (livre == -1) return false; // sem espaço

	        int novo = livre;
	        livre = dados[livre].proximo;

	        dados[novo].valor = valor;

	        // Inserção no início ou lista vazia
	        if (inicio == -1 || valor < dados[inicio].valor) {
	            dados[novo].proximo = inicio;
	            inicio = novo;
	            return true;
	        }

	        // Inserção ordenada no meio/fim
	        int atual = inicio;
	        while (dados[atual].proximo != -1 && dados[dados[atual].proximo].valor < valor) {
	            atual = dados[atual].proximo;
	        }

	        dados[novo].proximo = dados[atual].proximo;
	        dados[atual].proximo = novo;
	        return true;
	    }

	    public boolean remover(int valor) {
	        if (inicio == -1) return false;

	        int atual = inicio;
	        int anterior = -1;

	        while (atual != -1 && dados[atual].valor != valor) {
	            anterior = atual;
	            atual = dados[atual].proximo;
	        }

	        if (atual == -1) return false; // não encontrado

	        if (anterior == -1) {
	            inicio = dados[atual].proximo;
	        } else {
	            dados[anterior].proximo = dados[atual].proximo;
	        }

	        // devolve à lista de livres
	        dados[atual].proximo = livre;
	        livre = atual;

	        return true;
	    }

	    public void exibir() {
	        int i = inicio;
	        while (i != -1) {
	            System.out.print(dados[i].valor + " -> ");
	            i = dados[i].proximo;
	        }
	        System.out.println("null");
	    }
}
