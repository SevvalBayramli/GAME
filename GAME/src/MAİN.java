
public class MA�N {

	public static void main(String[] args) {

		Member member=new Member();
		member.setFirstName("�evval");
		member.setLastName("Bayraml�");
		member.setDateOfTime(2002);
		
		SaveMemberManager saveMemberManager =new SaveMemberManager(member);
		BaseOfferManager firstOffer= new FirstOffer();
		firstOffer.Suitability(member);
		
		BaseOfferManager secondOffer= new SecondOffer();
		secondOffer.Suitability(member);
		
		BaseSaleManager crediCardManager=new CreditCardManager();
		crediCardManager.Verification(member);
	}

}
