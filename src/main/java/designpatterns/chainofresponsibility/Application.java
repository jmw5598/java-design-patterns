package designpatterns.chainofresponsibility;

import designpatterns.chainofresponsibility.dispenser.Currency;
import designpatterns.chainofresponsibility.dispenser.Dispensable;
import designpatterns.chainofresponsibility.dispenser.DispenserFactory;

public class Application {
	
	public static void main(String[] args) {
		Dispensable dispenser = DispenserFactory.getDispenser();
		dispenser.dispense(new Currency(238));
	}

}
