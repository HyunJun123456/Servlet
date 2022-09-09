package test;

public class Counter {
	private int no;

	public Counter(int no) {
		super();
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
	
	public static void main (String[] args) {
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			
			counter = null;
			
			System.gc();
		}
	}
}
