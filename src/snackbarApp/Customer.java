package snackbarApp;

public class Customer
{
	// fields first
	private static int maxId = 0;
	private int id;
	private String name;
	private Double cashOnHand;

	// constructor - same name as the class, no return type. Already Void
	// initial state of the object - current initial value of all the fields 
	public Customer(String name, Double cashOnHand)
	{
		maxId++;

		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	// methods - getters and setters
	public double setCash(Double cash)
	{
		return cashOnHand = cash;
	}

	public double buy(Double cash)
	{
		setCash(this.cashOnHand - cash);
		return cashOnHand;
	}

	public String getName() // getters conventionally have 'get' and camelcase
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCash()
	{
		return cashOnHand;
	}

	// Object -> Employee 
	// @Override
	// public String toString()
	// {
 //        String rtnStr = "id: " + id + "\n" +
 //                "name: " + name + "\n" +
 //                "quantity: " + quantity + "\n" +
 //                "cost: " + cost + "\n" +
 //                "vendingMachineId: " + vendingMachineId  + "\n" +
 //        return rtnStr;
}