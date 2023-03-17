package entities;

public class Acount {

	private int number;
	private String holder;
	private double balance;

	public Acount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Acount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void wthidraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Acount [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
	
}
