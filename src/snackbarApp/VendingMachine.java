package snackbarApp;

public class VendingMachine
{
	// fields first
	private static int maxId = 0;
	private int id;
	private String name;

	// constructor - same name as the class, no return type. Already Void
	// initial state of the object - current initial value of all the fields 
	public VendingMachine(String name)
	{
		maxId++;

		id = maxId;

		this.name = name;
	}

	// methods - getters and setters
	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName() // getters conventionally have 'get' and camelcase
	{
		return name;
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
	// }
}