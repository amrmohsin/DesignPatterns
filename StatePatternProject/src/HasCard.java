public class HasCard implements VendingMachineState {
	
	VendingMachine vendingMachine;
	
	public HasCard(VendingMachine newVendingMachine){
		
		vendingMachine = newVendingMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Can't inset multiple cards at the same time!");
		
	}

	public void ejectCard() {
		
		System.out.println("Ejecting card....");
		vendingMachine.setATMState(vendingMachine.getNoCardState());
		
	}

	public void requestItem(int reqestedItem) {
		
		System.out.println("You have not entered your PIN");
		
		
	}

	public void insertPin(int pinEntered) {
		
		if(pinEntered == 1234){
			
			System.out.println("Valid pin....");
			vendingMachine.correctPinEntered = true;
			vendingMachine.setATMState(vendingMachine.getHasPin());
			
		} else {
			
			System.out.println("Invalid PIN entered!");
			vendingMachine.correctPinEntered = false;
			System.out.println("Ejecting card....");
			vendingMachine.setATMState(vendingMachine.getNoCardState());
			
		}	
	}	
}