package designpatterns.chainofresponsibility.dispenser;

public abstract class AbstractDispenser implements Dispensable {
	
	protected final Dispensable next;
	protected final int BILL_VALUE;
	
	public AbstractDispenser(Dispensable next, final int value) {
		this.BILL_VALUE = value;
		this.next = next;
	}
	
	protected void print(int count) {
		System.out.println("Dispensing " + count + " $" + BILL_VALUE + " dollar bills");
	}
	
}
