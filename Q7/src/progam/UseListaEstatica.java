package progam;

import lista.Lista;

public class UseListaEstatica {

	public static void main(String[] args) {
		Lista listaEstatica = new Lista();
		
		listaEstatica.inserir(10);
		listaEstatica.inserir(5);
		listaEstatica.inserir(20);
		listaEstatica.inserir(15);

        System.out.println("Lista após inserções:");
        listaEstatica.exibir();

        listaEstatica.remover(10);
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        System.out.println("Lista após remover 10:");
        listaEstatica.exibir(); 

        listaEstatica.remover(5);
        listaEstatica.remover(20);
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        System.out.println("Lista após remover 5 e 20:");
        listaEstatica.exibir(); 

	}

}
