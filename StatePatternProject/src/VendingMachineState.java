public interface VendingMachineState {
	
	// Different states expected
	// HasCard, NoCard, HasSelection, NoSelection
	
	void insertCard();
	
	void ejectCard();
	
	void insertPin(int pinEntered);
	
	void requestItem(int requestedItem);
	
}