
public abstract class BaseSaleManager implements ICheckMemberService{


	@Override
	public boolean Verification(Member member) {
		System.out.println("Kullan�c� do�ruland�");
		return true;
	}
	

}
