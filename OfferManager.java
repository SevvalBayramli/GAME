
public class OfferManager implements IOfferService{

	@Override
	public void Add(Offer offer) {
		System.out.println(offer.getOfferName()+" isimli kampanya başarıyla eklendi!");
	}

	@Override
	public void Remove(Offer offer) {
		System.out.println(offer.getOfferName()+" isimli kampanya silindi!");
	}

	@Override
	public void Update(Offer offer) {
		System.out.println(offer.getOfferName()+" isimli kampanya başarıyla güncellendi!");
	}
	
	

}
