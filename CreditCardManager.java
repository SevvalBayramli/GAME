

public class CreditCardManager extends BaseSaleManager implements ICreditCardService {

	double FinalPrice;
	boolean a;
	@Override
	public boolean AddCreditCard() {
		System.out.println("Kart�n�z ba�ar�yla eklendi!");
		return a=true;
	}
	
	@Override
	public void Sale(Member member,Game game,Offer offer) {
		if(a==true) {
			FinalPrice=((game.getPrice()/4)*3);
		System.out.println("Sat�� ba�ar�yla ger�ekle�ti!");
		System.out.println("�ndirimli fiyat� "+FinalPrice+"TL'dir");
		}
		else {
			System.out.println("Sat�� ger�ekle�medi!");
		}
	}

	
		
}
	

