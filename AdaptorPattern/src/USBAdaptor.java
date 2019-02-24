
public class USBAdaptor {

	Mouse mouse = new Mouse();
	
	public void ConnectA() {
		
		mouse.ConnectB();
		System.out.println("USB Adaptor receives the requests from the Mouse and sends them to the computer");
	}
}
