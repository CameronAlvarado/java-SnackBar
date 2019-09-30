package snackbarApp;

public class Main
{
	// fields - information
	// methods - do, behaviors

	public static void main(String[] args) // <-- every java program needs this
	{
                Customer cus1 = new Customer("Jane", 45.25);
                Customer cus2 = new Customer("Bob", 33.14);

                VendingMachine vm1 = new VendingMachine("Food");
                VendingMachine vm2 = new VendingMachine("Drink");
                VendingMachine vm3 = new VendingMachine("Office");

                // public Snack(String name, int quantity, double cost, int vendingMachineId)
                Snack snk1 = new Snack("Chips", 36, 1.75, vm1.getId());
                Snack snk2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
                Snack snk3 = new Snack("Pretzel", 30, 2.00, vm1.getId());

                Snack snk4 = new Snack("Soda", 24, 2.50, vm2.getId());
                Snack snk5 = new Snack("Water", 20, 2.75, vm2.getId());

                // System.out.println();
                double proc1; 
                proc1 = cus1.buy(snk4.buySnack(3));
                System.out.println(proc1);
                System.out.println("should be 37.75 " + cus1.getCash()); // should be 37.75
                System.out.println("should be 21 " + snk4.getQuantity()); // should be 21

                double proc2;
                proc2 = cus1.buy(snk3.buySnack(1));
                System.out.println("2. " + cus1.getCash()); // should be 37.75
                System.out.println("2. " + snk3.getQuantity()); // should be 21

                double proc3;
                proc3 = cus2.buy(snk4.buySnack(2));
                System.out.println("3. " + cus2.getCash());
                System.out.println("3. " + snk4.getQuantity());

                // double proc4;
                // proc4 = cus1.setCash(10.0);
                // System.out.println("4. " + cus2.getCash());
	}
}