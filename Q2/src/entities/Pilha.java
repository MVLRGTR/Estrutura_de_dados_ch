package entities;

public class Pilha {

	private No topo = null;

	public void empilhar(int value) {
		No novo = new No(value);
		if (topo == null) {
			topo = novo;
		} else {
			topo.next = novo;
			topo = novo;
		}

	}
	
	public Integer desempilhar() {
		if(!this.isEmpty()) {
			int retVal = topo.value;
			topo = topo.next;
			return retVal;
		}else {
			return null;
		}
	}

	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
}
