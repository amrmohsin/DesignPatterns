public class NoCard implements VendingMachineState {
	
	VendingMachine vendingMachine;
	
	public NoCard(VendingMachine newVendingMachine){
		
		vendingMachine = newVendingMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Please enter your pin");
		vendingMachine.setATMState(vendingMachine.getYesCardState());
		
	}

	public void ejectCard() {
		
		System.out.println("You didn't enter a card");
		
	}

	public void requestItem(int requestedItem) {
		
		System.out.println("You have not entered your card");
		
	}

	public void insertPin(int pinEntered) {
		
		System.out.println("You have not entered your card");
		
	}
}