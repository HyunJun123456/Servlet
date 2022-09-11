package api;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			//Class clazz = Class.forName("api.SendAction");
			Class clazz = Class.forName("api.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}
