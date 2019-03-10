public class NoSelection implements VendingMachineState {
	
	VendingMachine vendingMachine;
	
	public NoSelection(VendingMachine newVendingMachine){
		
		vendingMachine = newVendingMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Invalid selection!");
		System.out.println("Your card has been ejected");
		
	}

	public void ejectCard() {
		
		System.out.println("Invalid selection!");
		System.out.println("Card doesn't exist");
		
	}

	public void requestItem(int requestedItem) {
		
		System.out.println("Invalid selection!");
		
	}

	public void insertPin(int pinEntered) {
		
		System.out.println("Invalid selection!");
		
	}	
}