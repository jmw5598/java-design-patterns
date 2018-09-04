package designpatterns.chainofresponsibility.dispenser;

public class Currency {
	
	private final int amount;
	
	public Currency(final int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
}
