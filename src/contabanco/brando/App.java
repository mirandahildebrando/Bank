package contabanco.brando;

public class App {

	public static void main(String[] args) {
		System.out.println("Ola mundo");
		
		// Criar uma conta (agencia, conta, nome)
		//Limitar o nome = 12 caracteres
		
		Account account = new Account("0001", "1234", "Brando");
		
		//Sacar valores
		// Não pode sacar mais do que tem
		boolean succed = account.withDraw( 200.0);
		if (!succed) {
			System.out.println("Voce nao tem saldo suficiente para sacar!");
		}
		
		
		account.deposit(100);
		account.deposit(50);
		account.deposit(100);
		
		
		if(!account.withDraw(200)) {
			System.out.println("Voce nao tem saldo suficiente para sacar!");
		} else {
			System.out.println("Saque efetuado");
		}
		
		//Depositar
		//Informara para o usuário as operações (sauqe, deposito)

	}

}
