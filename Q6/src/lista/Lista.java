package lista;

public class Lista {
	
	private int tamanho = 0;
	private int vtotal = 0;
	private int maior = 0;
	private int menor = 0;
	private int par = 0;
	private int impar = 0;
	
	private No primeiro = null;
	private No ultimo = null;
	private No atual = null;
	
	
	public Lista() {
	}
	
	public void inserirPrimeiro(int valor) {
		No novo = new No(valor);
		if(this.estaVazio()) {
			this.primeiro=novo;
			this.atual=novo;
			this.ultimo=novo;
			this.maior=novo.valor;
			this.menor=novo.valor;
			this.vtotal+=valor;
			this.tamanho+=1;
			this.imparEpar(valor);
		}else {
			novo.proximo=this.primeiro;
			this.primeiro=novo;
			this.vtotal+=valor;
			this.tamanho+=1;
			this.imparEpar(valor);
			this.maiorEmenor(valor);
		}
	}
	
	public void inserirUltimo(int valor) {
		No novo = new No(valor);
		if(this.estaVazio()) {
			this.primeiro=novo;
			this.atual=novo;
			this.ultimo=novo;
			this.maior=novo.valor;
			this.menor=novo.valor;
			this.vtotal+=valor;
			this.tamanho+=1;
			this.imparEpar(valor);
		}else {
			this.ultimo.proximo=novo;
			this.ultimo=novo;
			this.vtotal+=valor;
			this.tamanho+=1;
			this.imparEpar(valor);
			this.maiorEmenor(valor);
		}
	}
	
	public void inserirNaPosicao(int posicao,int valor) {
		if(posicao > 1 && posicao <= this.tamanho()) {
			No novo = new No(valor);
			this.irPosicao(posicao-2);
			novo.proximo = this.atual.proximo;
			this.atual.proximo = novo;
			this.vtotal+=valor;
			this.tamanho+=1;
			this.imparEpar(valor);
			this.maiorEmenor(valor);
		}else if(posicao == 1) {
			this.inserirPrimeiro(valor);
		}else if(posicao == this.tamanho()) {
			this.inserirUltimo(valor);
		}
	}
	
	public No primeiroElemento() {
		return this.primeiro;
	}
	
	public No ultimoElemento() {
		return this.ultimo;
	}
	
	public No elementoNaPosicao(int posi) {
		if(posi <= this.tamanho()) {
			this.irPosicao(posi);
			return atual;
		}
		return null;
	}
	
	public void removePrimeiro() {
		this.primeiro=this.primeiro.proximo;
		this.tamanho-=1;
		this.atualizarParametros();
	}
	
	public void removeUltimo() {
		this.irPosicao(this.tamanho()-2);
		this.ultimo = this.atual;
		this.atual.proximo = null;
		this.tamanho-=1;
		this.atualizarParametros();
	}
	
	public void removeNaPosicao(int posi) {
		if(posi == 1) {
			this.removePrimeiro();
		}else if(posi < this.tamanho()){
			this.irPosicao(posi-1);
			No temp =  this.atual.proximo;
			this.irPosicao(posi-2);
			this.atual.proximo=temp;
			this.tamanho-=1;
			this.atualizarParametros();
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
			this.atual.proximo=temp;
			this.tamanho-=1;
			this.atualizarParametros();
		}
	}
	
	public int buscaElemento(int v) {
		int cont=0;
		this.atual = this.primeiro;
		
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
	
	private void irPosicao(int posicao) {
		if(posicao <= this.tamanho()) {
			this.atual = this.primeiro;
			for(int i = 0 ; i < posicao;i++) {
				this.atual = this.atual.proximo;
			}
		}else {
			this.atual=this.primeiro;
		}
	}
	
	public int tamanho() {
		int cont = 0;
		No aux = this.primeiro;
		while(aux!=null) {
			cont++;
			aux=aux.proximo;
		}
		return cont;
	}
	
	public boolean estaVazio() {
		if(this.primeiro == null) {
			this.ultimo=null;
			return true;
		}else {
			return false;
		}
	}
	
	private void imparEpar(int valor) {
		if(valor % 2 != 0) {
			this.impar+=1;
		}else {
			this.par+=1;
		}
	}
	
	private void maiorEmenor(int valor) {
		if(valor>this.maior) {
			this.maior=valor;
		}else if(valor < this.menor){
			this.menor=valor;
		}
	}

	public int getMaior() {
		return maior;
	}

	public int getMenor() {
		return menor;
	}

	public int getPar() {
		return par;
	}

	public int getImpar() {
		return impar;
	}
	
	public int vtotal() {
		return this.vtotal;
	}
	
	public float media() {
		return this.vtotal/this.tamanho;
	}
	
	private void atualizarParametros() {
		int cont=0;
		this.atual = this.primeiro;
		this.vtotal=0;
		this.par=0;
		this.impar=0;
		
		while(this.atual != null) {
			if(cont==0) {
				this.maior=this.atual.valor;
				this.menor=this.atual.valor;
			}
			cont++;
			this.maiorEmenor(this.atual.valor);
			this.imparEpar(this.atual.valor);
			this.atual = this.atual.proximo;
		}
		
	}
	
}
