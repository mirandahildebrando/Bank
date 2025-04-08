package contabanco.brando;

public class Account {
	
	private static final int MAX_LENGTH = 12;
	
	private String ag;
	private String cc;
	private String name;
	 
	 private double balance;
	

	
	private Log logger;
	
	public Account(String ag, String cc, String name) {
		this.ag = ag;
		this.cc = cc;
		setName(name);
		logger = new Log();
	}
	
	public void setName(String name) {
		if(name.length() > MAX_LENGTH) {
			this.name = name.substring(0, MAX_LENGTH);
		} else {
			this.name = name;
		}
		
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public boolean withDraw(double value) {
		if (balance < value) {
			return false;
		} else {
			balance -= value;
		}
		balance -= value;
		return false;
		
	}
	
	
}
