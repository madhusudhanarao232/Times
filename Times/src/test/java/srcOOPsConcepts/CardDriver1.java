package srcOOPsConcepts;

public class CardDriver1 {

	public static void main(String[] args) {
	 DebitCard dc=new DebitCard();
	 SwippingMachime sm=new SwippingMachime();
	 sm.swipeCard(dc);
	 CreditCard cc=new CreditCard();
	 sm.swipeCard(cc);

	}

}
