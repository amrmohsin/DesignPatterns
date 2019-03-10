public class TestVendingMachine {
	
	public static void main(String[] args){
		
		VendingMachine vendingMachine = new VendingMachine();
		
		vendingMachine.insertCard();
		
		vendingMachine.ejectCard();
		
		vendingMachine.insertCard();
		
		vendingMachine.insertPin(1234);
		
		vendingMachine.requestItem(9);
		
		vendingMachine.insertCard();
		
		vendingMachine.insertPin(1234);
		
	}	
}