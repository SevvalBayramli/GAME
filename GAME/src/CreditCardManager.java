
public class CreditCardManager extends BaseSaleManager {
	
	ICheckMemberService iCheckMemberService;
	
	public CreditCardManager(ICheckMemberService iCheckMemberService) {
		this.iCheckMemberService=iCheckMemberService;
	}
	public CreditCardManager() {
		
	}
	
	@Override
	public boolean Verification(Member member) {
		if(iCheckMemberService.Verification(member)==true) {
			System.out.println("��leminiz ba�ar�yla ger�ekle�ti!");
		}
		else {
			System.out.println("��eleminiz ger�ekle�emedi!");
		}
		
		return true;
		
	}

}
