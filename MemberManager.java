
public class MemberManager implements IMemberService, ICheckRealMember{

	boolean a;
	@Override
	public boolean CheckRealMember(Member member) {
		System.out.println("Kullan�c� kontrol edildi!");
		return a=true;
	}
	
	@Override
	public void Add(Member member) {
		if(a==true) {
		System.out.println(member.getId()+" idli kullan�c� eklendi!");
		}
		else {
			System.out.println(member.getId()+" idli kullan�c� eklenmedi!");
		}
	}

	@Override
	public void Remove(Member member) {
		System.out.println(member.getId()+" idli kullan�c� silindi!");
		
	}

	@Override
	public void Update(Member member) {
		System.out.println(member.getId()+" idli kullan�c� g�ncellendi!");
		
	}



}
