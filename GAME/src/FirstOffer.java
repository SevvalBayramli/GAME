
public class FirstOffer extends BaseOfferManager {
	@Override
	public void Suitability(Member member) {
		if(member.getDateOfTime()<2004)
			System.out.println(member.getFirstName()+" "+member.getLastName()+" se�ili kampanyaya kat�labilir.");
		else
			System.out.println(member.getFirstName()+" "+member.getLastName()+" se�ili kampanyaya kat�lamaz.");
		
	}
	
	
	

}
