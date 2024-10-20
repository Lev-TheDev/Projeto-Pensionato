package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

/* O pensionato possui dez quartos para alugar, enumerados de 0 a 9.
 * Os dez quartos estão vazios. Indicar quantos quartos serão alugados.
 * Registrar nome e e-mail no cadastro, bem como o número do quarto.
 * Imprimir um relatório das ocupações.
 */


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		System.out.println("------------------------------");
		System.out.print("       Hello, dear! \nWelcome to my boarding house!\n");
		System.out.println("------------------------------");
		System.out.print("\nHow many rooms do you want to rent? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("\nOK! Just help me fill these ID informations.\n");
		System.out.print("\n-----//-----//-----//-----");
		
		for(int i=0; i<n; i++) {
			System.out.println("\nRent #" + (i+1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numberId = sc.nextInt();
			sc.nextLine();
			vect[numberId] = new Room(name, email, numberId);
			System.out.print("-----//-----//-----//-----");
		}
		System.out.println();
		System.out.println("\nThank you! It's perfect! \nBusy rooms:");
		for(int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}
		System.out.println("\nHave a nice stay!");
		System.out.println("\nSee you soon!");
		
		sc.close();
	}
}
