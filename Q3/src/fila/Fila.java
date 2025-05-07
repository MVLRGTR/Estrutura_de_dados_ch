package fila;

import java.util.EmptyStackException;

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
			System.out.println("Retirando Pilha...");
			No retVal = this.inicio;
			this.inicio = this.inicio.proximo;
			return retVal;
		}
		return null;
	}
	
	/*public No mostrarPrimeiro() {
		if(this.inicio.pilha.mostrarTopo() != null) {
			return this.inicio;
		}else {
			this.retira();
			return null;
		}
	}*/
	
	public No mostrarPrimeiro() {
		return this.inicio;
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
	
	public int removeInteriroPilha() {
		try {
			return this.inicio.pilha.desempilhar();
		}catch(EmptyStackException e) {
			this.retira();
			if(!this.estaVazio()) {
				return this.removeInteriroPilha();
			}else {
				throw new RuntimeException("Todas as pilhas estão vazias.");
			}
		}
	}
}
