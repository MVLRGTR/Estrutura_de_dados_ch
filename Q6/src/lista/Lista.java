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
		if(this.primeiro == null) {
			this.primeiro=novo;
			this.atual=novo;
			this.ultimo=novo;
			this.maior=novo.valor;
			this.menor=novo.valor;
			this.vtotal+=valor;
			this.tamanho+=1;
			this.maiorEmenor(valor);
			this.imparEpar(valor);
		}else {
			novo.proximo=this.primeiro;
			this.primeiro=novo;
			this.vtotal+=valor;
		}
	}
	
	public void inserirUltimo(int valor) {
		No novo = new No(valor);
		if(this.primeiro == null) {
			this.primeiro=novo;
			this.atual=novo;
			this.ultimo=novo;
			this.maior=novo.valor;
			this.menor=novo.valor;
			this.vtotal+=valor;
			this.tamanho+=1;
			this.maiorEmenor(valor);
			this.imparEpar(valor);
		}else {
			novo.proximo=this.primeiro;
			this.primeiro=novo;
			this.vtotal+=valor;
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
	
}
