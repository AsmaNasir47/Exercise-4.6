package Fruit;

public class localApple extends Apple {
	
    private String taste;
    
	public localApple(String name, int q, double p, String t) {
		super(name, q, p);
		this.taste = t;
	}
	public String tasteLocalApple() {
		return this.taste;
	}
	
	public double calprice() {
		return super.price * super.quantity;
	}
}
