package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10]; //cria um vetor de 10 posições
									//inicialmente nulas
		
		System.out.println("Quantos quartos serão alugados: ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i<=n ; i++) {
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine(); //limpa a quebra de linha no buffer
			String name = sc.nextLine(); //depois lê até a quebra de linha
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int numRoom = sc.nextInt();
			
			Rent rent = new Rent(name, email); //instancia o objeto
			
			vect [numRoom] = rent;  //atribui a referencia do objeto para
									// o vetor na posição que o usuario digitar
		}
		
		System.out.println("Quartos alugados: ");
		for (int i = 0 ; i < 10 ; i++) {
			if (vect[i] != null) {		//imprimir apenas os quartos ocupados
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}
