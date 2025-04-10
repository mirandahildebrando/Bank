package contabanco.brando;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Account account = new Account("0001", "1234", "Brando");
		// D = Deposito
		// S = Saque 
		// E = Sair (exit)
		while(true) {
			System.out.println("O que deseja fazer ? D= Deposito, S= Saque, E= Sair da conta");
			String op = scanner.nextLine();
			
			if (op.equals("D")) {
				System.out.println("Qual valor deseja depositar ? ");
				double value = scanner.nextDouble();
				account.deposit(value);
				scanner.nextLine();
			} else if (op.equals("S")) {
				System.out.println("Qual valor deseja sacar ? ");
				double value = scanner.nextDouble();
				if (!account.withDraw(value)) {
					System.out.println("Ops! Não foi possível sacar o valor R$ " + account.withDraw(value));
					scanner.nextLine();
				}
			} else if (op.equals("E")) {
				break;
			} else {
				System.out.println("Comando invalido, tente novamente!");
			}
		}
		
		scanner.close();

	}

}
