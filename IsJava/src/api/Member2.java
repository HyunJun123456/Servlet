package api;

import java.util.Arrays;

public class Member2 implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	public Member2(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	public Member2 getMember2() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//먼저 얕은 복사를 해서 name, age를 복제한다.
		Member2 cloned = (Member2) super.clone();
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public static void main(String[] args) {
		//원본 객체 생성
		Member2 original = new Member2("홍길동", 25, new int[] {90,90}, new Car("소나타"));
		
		//복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member2 cloned = original.getMember2();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜져";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: "+cloned.name);
		System.out.println("age: "+cloned.age);
		System.out.print("scores: {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: "+cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name: "+original.name);
		System.out.println("age: "+original.age);
		System.out.print("scores: {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: "+original.car.model);
	}
}
