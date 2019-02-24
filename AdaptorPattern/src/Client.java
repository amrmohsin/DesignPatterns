
public class Client {

	public static void main(String[] args) {

		USBAdaptor usb = new USBAdaptor();
		usb.ConnectA();
		
		System.out.println("Client/Computer gets the signal!");
	}

}
