package listaDupla;

public class ListaDuplamenteEncadeada {
	private No primeiro,atual,ultimo;

	public ListaDuplamenteEncadeada() {
		this.primeiro=this.atual=this.ultimo=null;
	}
	
	public void inserePrimeiro(int valor) {
		No novo = new No(valor);
		if(this.estaVazio()) {
			this.primeiro = novo;
			this.atual = novo;
			this.ultimo = novo;
		}else {
			novo.setProximo(this.primeiro);
			this.primeiro.setAnterior(novo);
			this.primeiro = novo;
		}
	}
	
	public void insereUltimo(int valor) {
		No novo = new No(valor);
		if(this.estaVazio()) {
			this.primeiro = novo;
			this.atual = novo;
			this.ultimo = novo;
		}else {
			this.ultimo.setProximo(novo);
			novo.setAnterior(this.ultimo);
			this.ultimo = novo;
		}
	}
	
	public void insereNaPosicao(int valor,int posicao) {
		No novo = new No(valor);
		this.irPosicao(posicao-2);
		novo.setProximo(this.atual.getProximo());
		novo.setAnterior(this.atual);
		this.atual.getProximo().setAnterior(novo);
		this.atual.setProximo(novo);
	}
	
	public No primeiro() {
		return this.primeiro;
	}
	
	public No ultimo() {
		return this.ultimo;
	}
	
	public No elementoNaPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.irPosicao(posicao);
			return this.atual;
		}else {
			return null;
		}
	}
	
	public void removePrimeiro() {
		this.primeiro = this.primeiro.getProximo();
		this.primeiro.setAnterior(null);
	}
	
	public void removeUltimo() {
		this.ultimo = this.ultimo.getAnterior();
		this.ultimo.setProximo(null);
	}
	
	public void removeNaPosicao(int posicao) {
		System.out.println("posicao : "+posicao);
		if(posicao > -1 && posicao <= this.tamanho()) {
			this.irPosicao(posicao-1);
			No temp = atual.getProximo();
			this.atual = this.atual.getAnterior();
			this.atual.setProximo(temp);
			temp.setAnterior(this.atual);
		}else {
			System.out.println("Pocisão inexistente na lista !!!");
		}
		
	}
	
	public void removeElemento(int elemento) {
		int posicao = this.buscaElemento(elemento);
		if(posicao > 0 && posicao < this.tamanho()-1) {
			posicao+=1;//ADIOCIONO +1 POIS O METEDO REMOVE NA POSICAO TRABALHA COM O INDICE 1 DO USUARIO E O METODO ATUAL TRABALHA COM INDICE 0
			this.removeNaPosicao(posicao);
		}else if(posicao == 0) {
			this.removePrimeiro();
		}else if(posicao == this.tamanho()-1) {
			this.removeUltimo();
		}
	}
	
	public boolean estaVazio() {
		if(this.primeiro==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public int buscaElemento(int elemento) {
		int cont = 0;
		this.atual = this.primeiro;
		
		while(this.atual != null && this.atual.getValor() != elemento) {
			cont++;
			this.atual=this.atual.getProximo();
		}
		
		if(this.atual != null) {
			return cont;
		}else {
			return -1;
		}
	}
	
	public No Locate(int P) {
	    No atual = this.primeiro.getProximo();
	    int contador = 1;

	    while (atual != null && contador < P) {
	        atual = atual.getProximo();
	        contador++;
	    }

	    if (contador == P && atual != null) {
	        return atual;
	    } else {
	        return null;
	    }
	}
	
	public boolean InsereP(int E, int P) {
	    if (P < 1) return false;

	    No pos = (P == 1) ? this.primeiro : Locate(P - 1);
	    if (pos == null) return false;

	    No novo = new No(E);
	    novo.setProximo(pos.getProximo());
	    novo.setAnterior(pos);

	    if (pos.getProximo() != null) {
	        pos.getProximo().setAnterior(novo);
	    }
	    pos.setProximo(novo);
	    return true;
	}
	
	public Integer RemovaP(int P) {
	    No alvo = Locate(P);
	    if (alvo == null) return null;

	    if (alvo.getAnterior() != null) {
	        alvo.getAnterior().setProximo(alvo.getProximo());
	    }
	    if (alvo.getProximo() != null) {
	        alvo.getProximo().setAnterior(alvo.getAnterior());
	    }
	    return alvo.getValor();
	}
	
	public int tamanho() {
		int cont = 0 ;
		No aux = this.primeiro;
		while(aux != null) {
			cont++;
			aux = aux.getProximo();
		}
		return cont;
	}
	
	public void irPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.atual =this.primeiro;
			for(int i = 0 ; i < posicao ;i++) {
				this.atual = this.atual.getProximo();
			}
		}else {
			this.atual = this.primeiro;
		}
	}

}
