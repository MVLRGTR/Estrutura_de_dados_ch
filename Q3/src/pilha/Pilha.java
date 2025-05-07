package pilha;

import java.util.EmptyStackException;

public class Pilha {
	private No topo = null;

	public Pilha() {
	}

	public void empilhar(int valor) {
		No novo = new No(valor);
		if (topo == null) {
			topo = novo;
		} else {
			novo.proximo = topo;
			topo = novo;
		}
	}

	public int desempilhar() {
		if (topo == null) {
			throw new EmptyStackException();
		}
		int retVal = topo.valor;
		topo = topo.proximo;
		return retVal;
	}

	public boolean estaVazio() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public No mostrarTopo() {
		return this.topo;
	}

}
