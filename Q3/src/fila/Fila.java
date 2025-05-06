package fila;

import pilha.Pilha;

public class Fila {

	private No inicio = null;
	private No fim = null;
	
	public void inserir(Pilha pilha) {
		No novo = new No(pilha);
		
		if(inicio == null) {
			this.inicio = novo;
			this.fim = novo;
		}else {
			this.fim.proximo = novo;
			this.fim = novo;
		}
	}
	
	public No retira() {
		if(!this.estaVazio()) {
			No retVal = this.inicio;
			this.inicio = this.inicio.proximo;
			return retVal;
		}
		return null;
	}
	
	public No mostrarPrimeiro() {
		return inicio;
	}
	
	public boolean estaVazio() {
		if(inicio == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public int tamanho() {
		int cont = 0;
		No aux = inicio;
		while(aux!= null) {
			cont++;
			aux= aux.proximo;
		}
		return cont;
	}
	
	public void insertInteiroPilha(int valor) {
		this.mostrarPrimeiro().pilha.empilhar(valor);
	}
	
	public int removeInteiroPilha() {
		return this.mostrarPrimeiro().pilha.desempilhar();
	}
	
}
