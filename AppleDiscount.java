package Fruit;

class AppleDiscount implements Discount {
	public float rateOfDiscount() {
		return 9.15f;
	}
}

class importAppleDiscount implements Discount {
	public float rateOfDiscount() {
		return 8.15f;
	}
}

class localAppleDsicount implements Discount {
	public float rateOfDiscount() {
		return 7.15f;
	}
}
