package api;

public class Member3 implements Comparable<Member3>{
	String name;
	Member3(String name){
		this.name = name;
	}

	@Override
	public int compareTo(Member3 o) {
		return name.compareTo(o.name);
	}
}
