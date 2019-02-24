
public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		return instance;	
	}
	
	public void ShowMessage() {
		if (instance != null) {
			System.out.println("Got one object");
		 instance = null;
		}
		
		else {
			System.out.println("Can't get more than one object!");

		}
	}
}
