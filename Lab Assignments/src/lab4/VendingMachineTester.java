package lab4;

public class VendingMachineTester 
{

	public static void main(String[] args) 
	{
		VendingMachine vend = new VendingMachine();
		VendingMachineMenu menu = new VendingMachineMenu();
		
		menu.run(vend);
	}

}
