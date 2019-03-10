public class VendingMachine {
	
	VendingMachineState hasCard;     
	VendingMachineState noCard;
	VendingMachineState hasCorrectPin;
	VendingMachineState vendingMachineOutOfItems;
	
	VendingMachineState vendingMachineState;
	
	int itemsInMachine = 10; //Number of items available in vending machine 
	boolean correctPinEntered = false;
	
	public VendingMachine(){
		
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasSelection(this);
		vendingMachineOutOfItems = new NoSelection(this);
		
		vendingMachineState = noCard;
		
		if(itemsInMachine < 0){
			
			vendingMachineState = vendingMachineOutOfItems;
			
		}
		
	}
	
	void setATMState(VendingMachineState newVendingMachineState){
		
		vendingMachineState = newVendingMachineState;
		
	}
	
	public void setItemsInMachine(int newItemsInMachine){
		
		itemsInMachine = newItemsInMachine;
		
	}
	
	public void insertCard() {
		
		vendingMachineState.insertCard();
		
	}

	public void ejectCard() {
		
		vendingMachineState.ejectCard();
		
	}

	public void requestItem(int requestedItems) {
		
		vendingMachineState.requestItem(requestedItems);
		
	}

	public void insertPin(int pinEntered){
		
		vendingMachineState.insertPin(pinEntered);
		
	}
	
	public VendingMachineState getYesCardState() { return hasCard; }
	public VendingMachineState getNoCardState() { return noCard; }
	public VendingMachineState getHasPin() { return hasCorrectPin; }
	public VendingMachineState getNoItemState() { return vendingMachineOutOfItems; }
	
}