package contabanco.brando;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Bank santander = new Bank("0001");
		// C = Criar conta
		// E = Sair (exit)
		while(true) {
			System.out.println("O que deseja fazer ? C = Criar conta, E = Sair");
			String op = scanner.nextLine();
			
			if (op.equals("C")){
				System.out.println("Digite o seu nome: ");
				String name = scanner.nextLine();
				Account account = santander.generateAccount(name);
				System.out.println(account);
			} else if (op.equals("E")) {
				break;
			} else {
				System.out.println("Comando inválido, tente novamente!");
			}
		}

	}

}
