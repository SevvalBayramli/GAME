
public class OfferManager implements IOfferService{

	@Override
	public void Add(Offer offer) {
		System.out.println(offer.getOfferName()+" isimli kampanya ba�ar�yla eklendi!");
	}

	@Override
	public void Remove(Offer offer) {
		System.out.println(offer.getOfferName()+" isimli kampanya silindi!");
	}

	@Override
	public void Update(Offer offer) {
		System.out.println(offer.getOfferName()+" isimli kampanya ba�ar�yla g�ncellendi!");
	}
	
	

}
