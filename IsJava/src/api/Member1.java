package api;

public class Member1 implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	
	
	public Member1(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member1 getMember() {
		Member1 cloned = null;
		try {
			cloned = (Member1) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
		}
		return cloned;
	}
	
	public static void main (String[] agrs) {
		//원본 객체 생성
		Member1 original = new Member1("blue", "홍길동", "12345", 25, true);
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member1 cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: "+cloned.id);
		System.out.println("name: "+cloned.name);
		System.out.println("password: "+cloned.password);
		System.out.println("age: "+cloned.age);
		System.out.println("adult: "+cloned.adult);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: "+original.id);
		System.out.println("name: "+original.name);
		System.out.println("password: "+original.password);
		System.out.println("age: "+original.age);
		System.out.println("adult: "+original.adult);
	}
}
