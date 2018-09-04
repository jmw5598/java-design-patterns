package designpatterns.chainofresponsibility.dispenser;

public class DispenserFactory {
	
	public static Dispensable getDispenser() {
		Dispensable d1 = new Dispenser(null, 1);
		Dispensable d5 = new Dispenser(d1, 5);
		Dispensable d10 = new Dispenser(d5, 10);
		Dispensable d20 = new Dispenser(d10, 20);
		Dispensable d50 = new Dispenser(d20, 50);
		return d50;
	}
	
}
