package contabanco.brando;

import java.util.List;
import java.util.ArrayList;

public class Bank {
	
	private String ag;
	
	private List<Account> accounts;
	
	public Bank(String ag) {
		this.ag = ag;
		this.accounts = new ArrayList<>();
	}

}
