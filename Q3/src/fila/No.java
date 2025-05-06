package fila;

import pilha.Pilha;

public class No {
	
	public No proximo = null;
	public Pilha pilha;
	
	public No(Pilha pilha) {
		this.pilha=pilha;
	}
}
