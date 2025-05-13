package lista;

public class Lista {
	private No inicio=null;
	private No fim=null;
	public No atual=null;
	
	public Lista(){
	}
	
	public void inserirPrimeiro(int valor) {
		No novo = new No(valor);
		if(inicio==null){
			inicio= novo;
			fim=novo;
			atual=novo;
		}else {
			novo.proximo = inicio;
			inicio = novo;
		}
	}
	
	public void inserirUltimo(int valor) {
		No novo = new No(valor);
		if(inicio==null) {
			inicio=novo;
			fim=novo;
			atual=novo;
		}else {
			fim.proximo = novo;
			fim=novo;
		}
	}
	
	
	public void inserirNaPosicao(int posicao,int valor) {
		No novo = new No(valor);
		this.irPosicao(posicao-2);
		novo.proximo = atual.proximo;
		atual.proximo = novo;
	}
	
	public No primeiroElemento() {
		return inicio;
	}
	
	public No ultimoElemento() {
		return fim;
	}
	
	public No elementoNaPosicao(int posi) {
		if(posi <= this.tamanho() && posi >-1) {
			this.irPosicao(posi);
			return atual;
		}
		return null;
	}
	
	public void removePrimeiro() {
		inicio=inicio.proximo;
	}
	
	public void removeUltimo() {
		this.irPosicao(this.tamanho()-2);
		System.out.println("atual : "+atual.valor);
		fim = atual;
		atual.proximo = null;
		
	}
	
	public void removeNaPosicao(int posi) {
		if(posi == 1) {
			this.removePrimeiro();
		}else if(posi > 1 && posi < this.tamanho()){
			this.irPosicao(posi-1);
			No temp =  atual.proximo;
			this.irPosicao(posi-2);
			atual.proximo=temp;
		}else if(posi == this.tamanho()) {
			this.removeUltimo();
		}
	}
	
	public void removeElemento(int elemento) {
		int posi = this.buscaElemento(elemento);
		if(posi > -1) {
			this.irPosicao(posi);
			No temp = atual.proximo;
			this.irPosicao(posi-1);
			atual.proximo=temp;
		}
	}
	
	public int buscaElemento(int v) {
		int cont=0;
		this.atual = inicio;
		
		while(this.atual != null && this.atual.valor != v) {
			cont++;
			this.atual = this.atual.proximo;
		}
		
		if(this.atual != null) {
			return cont;
		}else {
			return -1;
		}
		
	}
	
	public int tamanho() {
		int cont = 0;
		No aux = inicio;
		while(aux!=null) {
			cont++;
			aux=aux.proximo;
		}
		return cont;
	}
	
	public void irPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.atual = inicio;
			for(int i = 0 ; i < posicao;i++) {
				this.atual = this.atual.proximo;
			}
		}else {
			atual=inicio;
		}
	}
	
	public boolean estaVazio() {
		if(inicio == null) {
			return true;
		}else {
			return false;
		}
	}

}
