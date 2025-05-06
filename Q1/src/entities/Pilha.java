package entities;

public class Pilha {

	private No topo = null;
	
	public void empilhar(char valor) {
		No novo = new No(valor);
		
		if(topo == null) {
			topo = novo;
		}else {
			novo.proximo = topo;
			topo = novo;
		}
	}
	
	public char desempilhar() {
		char retVal = topo.valor;
		topo= topo.proximo;
		return retVal;
	}
	
	public boolean estaVazio() {
		if(topo == null) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
