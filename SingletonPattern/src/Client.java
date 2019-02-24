/*Simple example to illustrate how the Singleton Design Pattern Works 

In this example, it is noticeable that only one object could be created
which is what the Singleton Design is all about (:
*/
public class Client {

	public static void main(String[] args) {


		Singleton object1 = Singleton.getInstance();
		Singleton object2 = Singleton.getInstance();
		Singleton object3 = Singleton.getInstance();
		object1.ShowMessage();
		object2.ShowMessage();
		object3.ShowMessage();
	}

}
