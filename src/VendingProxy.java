public class VendingProxy {
	private VendingMachine vm;

	public VendingProxy(VendingMachine newVm){
		vm = newVm;
	}

	public void printMenu(){
		vm.printMenu();
	}

	public void typeCode(){
		vm.typeCode();
	}

	public void insertMoney(){
		vm.insertMoney();
	}

	public void printOptions(){
		vm.printOptions();
	}
}
