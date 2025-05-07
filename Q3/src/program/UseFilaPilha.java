package program;

import fila.Fila;
import pilha.Pilha;

public class UseFilaPilha {

	public static void main(String[] args) {
		Pilha pilha1 = new Pilha();
		Pilha pilha2 = new Pilha();
		Fila fila = new Fila();
		
		System.out.println("pilha1 empilhando dados...");
		pilha1.empilhar(1);
		pilha1.empilhar(2);
		pilha1.empilhar(3);
		pilha1.empilhar(4);
		
		System.out.println("pilha2 empilhando dados...");
		pilha2.empilhar(8);
		pilha2.empilhar(7);
		pilha2.empilhar(6);
		pilha2.empilhar(5);
		
		System.out.println("Adicionando pilhas a fila...");
		fila.inserir(pilha1);
		fila.inserir(pilha2);
		
		System.out.println("removeInteiroPilha : "+fila.removeInteiroPilha());
		System.out.println("removeInteiroPilha : "+fila.removeInteiroPilha());
		System.out.println("removeInteiroPilha : "+fila.removeInteiroPilha());
		System.out.println("removeInteiroPilha : "+fila.removeInteiroPilha());
	

		System.out.println("Mostrnado topo da pilha dentro da fila : "+fila.mostrarPrimeiro().pilha.mostrarTopo().valor);
		
		
		
	}

}
