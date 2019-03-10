public class HasSelection implements VendingMachineState {
	
	VendingMachine vendingMachine;
	
	public HasSelection(VendingMachine newVendingMachine){
		
		vendingMachine = newVendingMachine;
		
	}

	public void insertCard() {
		
		System.out.println("Card has already been entered!");
		
	}

	public void ejectCard() {
		
		System.out.println("Card has been ejected");
		vendingMachine.setATMState(vendingMachine.getNoCardState());
		
	}

	public void requestItem(int requestedItem) {
		
		if(requestedItem > vendingMachine.itemsInMachine){
			
			System.out.println("Item is not available");
			System.out.println("Your card has been ejected");
			vendingMachine.setATMState(vendingMachine.getNoCardState());
			
		} else {
			
			System.out.println("Item:" + requestedItem + " is provided by the vending machine");
			vendingMachine.setItemsInMachine(vendingMachine.itemsInMachine - requestedItem);
			
			System.out.println("Card has been ejected");
			vendingMachine.setATMState(vendingMachine.getNoCardState());
			
			if(vendingMachine.itemsInMachine <= 0){ 
				
				vendingMachine.setATMState(vendingMachine.getNoItemState());
				
			}
		} 
	}

	public void insertPin(int pinEntered) {
		
		System.out.println("PIN has already been entered!");
		
	}	
}