package designpatterns.chainofresponsibility.dispenser;

public final class Dispenser extends AbstractDispenser {

	public Dispenser(Dispensable next, int value) {
		super(next, value);
	}

	public void dispense(Currency currency) {
		
		if(currency.getAmount() >= this.BILL_VALUE) {
			int num = currency.getAmount()/this.BILL_VALUE;
			int rem = currency.getAmount()%this.BILL_VALUE;
			this.print(num);
			if(rem > 0) this.next.dispense(new Currency(rem));
		} else {
			this.next.dispense(currency);
		}
		
	}

}
