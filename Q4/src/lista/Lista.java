package lista;

public class Lista {
	private No primeiro, atual, ultimo = null;

	public void inserirPrimeiro(int valor) {
		No novo = new No(valor);
		if (primeiro == null) {
			this.primeiro = novo;
			this.atual = novo;
			this.ultimo = novo;
		} else {
			novo.proximo = this.primeiro;
			this.primeiro.anterior = novo;
			this.primeiro = novo;

		}
	}

	public void inseriUltimo(int valor) {
		No novo = new No(valor);
		if (this.primeiro == null) {
			this.inserirPrimeiro(valor);
		} else {
			novo.anterior = this.ultimo;
			this.ultimo.proximo = novo;
			this.ultimo = novo;
		}
	}

	public void insereNaPosicao(int valor, int posicao) {
		No novo = new No(valor);
		if (posicao <= this.tamanho()) {
			this.irPosicao(posicao-2);
			novo.proximo = this.atual.proximo;
			novo.anterior = this.atual;
			this.atual.proximo = novo;
			novo.proximo.anterior = novo;
		}
	}

	public void removePrimeiro() {
		this.primeiro = this.primeiro.proximo;
		this.primeiro.anterior = null;
	}

	public void removeUltimo() {
		this.ultimo = this.ultimo.anterior;
		this.ultimo.proximo = null;
	}

	public void removeNaPosicao(int posicao) {
		if (posicao > 1 && posicao < this.tamanho()) {
			this.irPosicao(posicao - 1);
			No temp = this.atual;
			this.atual.anterior.proximo = temp.proximo;
			this.atual.proximo.anterior = temp.anterior;
		}else if(posicao == 1) {
			this.removePrimeiro();
		}else if(posicao == this.tamanho()) {
			this.removeUltimo();
		}
	}
	
	public int elementoNaPosicao(int posicao) {
		this.irPosicao(posicao);
		return this.atual.valor;
	}

	public int tamanho() {
		int cont = 0;
		No aux = this.primeiro;
		while (aux != null) {
			aux = aux.proximo;
			cont++;
		}
		return cont;
	}

	public void irPosicao(int posicao) {
		if (posicao <= this.tamanho()) {
			this.atual = this.primeiro;
			for (int i = 0; i < posicao; i++) {
				this.atual = this.atual.proximo;
			}
		}
	}

	public int buscaElemento(int elemento) {
		int cont = 0;
		this.atual = this.primeiro;

		while (this.atual != null && this.atual.valor != elemento) {
			this.atual = this.atual.proximo;
			cont++;
		}

		if (this.atual != null) {
			return cont;
		} else {
			return -1;
		}
	}
}
