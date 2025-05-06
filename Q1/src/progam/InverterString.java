package progam;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Pilha;

public class InverterString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		ArrayList<Character> resultado = new ArrayList<Character>();
		Pilha pilha = new Pilha();
		
		System.out.printf("Digite a frase aqui :");
		frase = sc.nextLine();
		
		System.out.println("Mostrar string : "+frase);
		
		for (int i = 0 ; i < frase.length() ; i++) {
			if(frase.charAt(i) != ' ' && frase.charAt(i) != '.' ) {
				pilha.empilhar(frase.charAt(i));
			}else {
				while(!pilha.estaVazio()) {
					resultado.add(pilha.desempilhar());
				}
				if (frase.charAt(i) == ' ') {
					resultado.add(' '); 
				} else if (frase.charAt(i) == '.') {
					resultado.add('.'); 
				}
			}
		}
		
		System.out.println("--------------------------------");
		System.out.printf("Resultado : ");
		for (int i = 0 ; i < resultado.size() ; i++) {
			System.out.printf("%c",resultado.get(i));
		}
		
		sc.close();
	}

}
