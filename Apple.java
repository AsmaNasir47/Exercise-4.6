package Fruit;

public class Apple extends Fruit {

	protected int quantity;
	protected double price;
	
	    public Apple (String name, int q, double p) {
	    	
		super(name);
		this.quantity = q;
		this.price = p;
		
		//System.out.println("Apple constructor is invoked");
		
		if (this.quantity < 10) {
			totPrice(); //overloading with no arguments
			System.out.println(name);
			System.out.println("If quantity LESS than 10, Total price: RM" + totPrice());
		
		}
			else if (this.quantity > 10 && this.quantity < 100) {
			double pp = 1.99; 
			totalPrice(pp); //overloading with 1 argument
			System.out.println(name);
			System.out.println("If quantity MORE than 10, Total price: RM" + totalPrice(pp));
		}
		
			else {
			double pp = 0.99; 
			double dd;
			
			Discount aa = new AppleDiscount();//create new object
			System.out.println("Discount : " + aa.rateOfDiscount());
			dd = aa.rateOfDiscount();
			totalPrice(dd, pp); //overloading with 2 arguments
			System.out.println(name);
			System.out.println("If quantity MORE than 100, Total price: RM" + totalPrice(dd,pp));
		}
		
	}
		
		public double totPrice() {
			return this.quantity * this.price;
		}
		
		public double totalPrice(double pr) {
			return pr * this.quantity;
		}
		
		public double totalPrice(double qq, double pr) {
			return (pr * this.quantity) * qq;
		}	
		
		public String toString() { //overriding method
			return "\nQuantity " + quantity + "Price " + price;
		}
}

