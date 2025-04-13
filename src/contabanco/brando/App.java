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
		
		Account account = new Account ("0001", "1234", "Seu barriga");
		// D = Deposito
		// S = Saque
		// E = Sair (exit)
		
		while(true) {
			System.out.println("O que deseja fazer ? D=Depositar, S=Sacar, E=Sair");
			String op = scanner.nextLine();
			scanner.nextLine();
			
			if (op.equals("D")) {
				System.out.println("Qual valor deseja depositar ?");
				double value = scanner.nextDouble();
				account.deposit(value);
			} else if (op.equals("S")) {
				System.out.println("Qual valor deseja sacar ?");
				double value = scanner.nextDouble();
				if (!account.withDraw(value)) {
					
				}
			} else if (op.equals("E")) {
				break;	
		    } else {
		    	System.out.println("Comando invalido, tente novamente");
		    }
		}

	}

}
