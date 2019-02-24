
public class USBAdaptor {

	Phone mouse = new Phone();
	
	public void ConnectA() {
		
		mouse.ConnectB();
		System.out.println("USB Adaptor receives the requests from the Mouse and sends them to the computer");
	}
}
