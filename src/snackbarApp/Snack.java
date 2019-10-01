package snackbarApp;

public class Snack
{
	// fields first - state
	private static int maxId = 0;
	private int id;
	private String name;
	private double quantity; // real number - float
	private double cost; // real number - float	
	private int vendingMachineId;

	// constructor - same name as the class, no return type. Already Void
	// initial state of the object - current initial value of all the fields 
	public Snack(String name, double quantity, double cost, int vendingMachineId)
	{
		maxId++;

		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
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

    public void setCost(Double cost)
    {
        this.cost = cost;
    }

    public double getCost()
    {
        return cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int id)
    {
        this.vendingMachineId = id;
    }

   	public double getQuantity()
	{
		return quantity;
	}

	// other methods
	public double setQuantity(double quantity)
	{	
		return this.quantity = quantity;
	}

	public double buySnack(double quantity)
	{
		setQuantity(this.quantity - quantity);
		return cost * quantity;
	}

	public Double getTotal(Double quantity)
	{
		return quantity * cost;
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
