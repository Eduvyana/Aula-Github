package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Dados vect [] = new Dados [n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.print("Digite a altura: ");
			double altura = sc.nextDouble();
			
			vect [i] = new Dados (name,idade,altura);
			System.out.println("Pessoas: " + i +"," + name +"," + idade +" anos," + altura+" M"  );
		}
		
		
		
		
		sc.close();
	}

}
