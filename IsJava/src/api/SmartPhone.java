package api;

public class SmartPhone {
	private String company;
	private String os;
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company+", "+os;
	}
	
	public static void main(String args[]) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
	}
}
