package pilha;

public class Pilha {
	
	public No topo = null;
	private int tamanho = 0;
	private int vtotal = 0;
	private int maior = 0;
	private int menor = 0;
	private int par = 0;
	private int impar = 0;
	
	public Pilha() {
	}
	
	public void empilhar(int valor) {
		No novo = new No(valor);
		
		if(this.estaVazio()) {
			this.maior=novo.valor;
			this.menor=novo.valor;
		}
		
		this.tamanho+=1;
		this.vtotal+=valor;
		this.maiorEmenor(valor);
		
		if(this.topo==null) {
			this.topo=novo;
		}else {
			novo.proximo = topo;
			this.topo = novo;
		}
	}
	
	public int desempilhar() {
		int retVal = topo.valor;
		this.tamanho-=1;
		this.vtotal-=retVal;
		this.topo = this.topo.proximo;
		return retVal;
	}
	
	public boolean estaVazio() {
		if(topo == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public int valorTotal() {
		return this.vtotal;
	}
	
	public int tamanho() {
		return this.tamanho;
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
	
	public int vMaior() {
		return this.maior;
	}
	
	public int vMenor() {
		return this.menor;
	}
	
	public float media() {
		return this.vtotal/this.tamanho;
	}

	public int getPar() {
		return par;
	}

	public int getImpar() {
		return impar;
	}
	
}
