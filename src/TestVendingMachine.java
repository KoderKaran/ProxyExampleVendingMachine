public class TestVendingMachine {
	public static void main(String[] args){
		VendingMachine vm = new VendingMachine();
		VendingProxy vmp = new VendingProxy(vm);
		vmp.printOptions();
		while(true){
			vmp.printMenu();
		}
	}
}
