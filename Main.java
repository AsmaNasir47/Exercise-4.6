package Fruit;

import java.text.DecimalFormat;

public class Main {

private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	public static void main(String[] args) {
		
		//Fruit f = new Fruit(""); //no need new object for super class
			
		System.out.println();
		
		Apple a = new Apple("Apple", 5, 2.99);
				
		localApple l = new localApple("Red apple", 5, 1.99, "sweet");
		
		importApple i = new importApple("Green Apple", 5, 4.99, "Red");
		
		/*Dragonfruit d = new Dragonfruit("Dragonfruit", 2, 10.6);
		System.out.println("The total weight of dragonfruit is : " + d.totWeight() + "kg");
		
		System.out.println();
		
		Grape g = new Grape("Grape", 4, 13.6);
		System.out.println("The total weight of grape is : " + g.totWeight() + "kg");
	    */
	}
}
