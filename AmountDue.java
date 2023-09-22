package OOP;

class AmountDue {
	private double tax = 0.12;
	
	public double computeAmountDue(double price) {
		tax = price * 0.12;
		price += tax;
		System.out.println("Amount due is " + price);
		return price;
	}
	
	public double computeAmountDue(double quantity, double orderPrice) {
		orderPrice *= quantity;
		tax = orderPrice * 0.12;
		orderPrice += tax;
		System.out.println("Amount due is " + orderPrice);
		return orderPrice;
	}

	public double computeAmountDue(double itemPrice, double orderQuantity, double discount) {
		itemPrice *= orderQuantity;
		itemPrice -= discount;
		tax =  itemPrice * 0.12;
		itemPrice += tax;
		System.out.println("Amount due is " + itemPrice);
		return itemPrice;
	}
}
