
public class USBAdaptor {

	Mouse mouse = new Mouse();
	
	public void ConnectA() {
		
		mouse.ConnectB();
		System.out.println("USB Adaptor converts those mouse signals coming from the Mouse");
		System.out.println("USB Adaptor Sending new converted signal to computer\n");
	}
}
