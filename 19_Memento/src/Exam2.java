class ATCMediator implements IATCMediator
{
	private Flight flight;
	private Runway runway;
	public boolean land;

	public void registerRunway(Runway runway)
	{
		this.runway = runway;
	}

	public void registerFlight(Flight flight)
	{
		this.flight = flight;
	}

	public boolean isLandingOk()
	{
		return land;
	}

	@Override
	public void setLandingStatus(boolean status)
	{
		land = status;
	}
}

interface Command
{
	void land();
}

interface IATCMediator
{

	public void registerUser(User runway);

	public void registerDriver(Driver flight);

	public boolean isAvailable();

	public void setAvailableStatus(boolean status);
}

class Driver implements Command
{
	private IATCMediator atcMediator;

	public Driver(IATCMediator atcMediator)
	{
		this.atcMediator = atcMediator;
	}

	public void land()
	{
		if (atcMediator.isAvailable())
		{
			System.out.println("Successfully get the customer");
			atcMediator.setAvailableStatus(true);
		}
		else
			System.out.println("busy");
	}

	public void getReady()
	{
		System.out.println("Ready for landing.");
	}

}

class User implements Command
{
	private IATCMediator atcMediator;

	public Runway(IATCMediator atcMediator)
	{
		this.atcMediator = atcMediator;
		atcMediator.setLandingStatus(true);
	}

	@Override
	public void land()
	{
		System.out.println("Landing permission granted.");
		atcMediator.setLandingStatus(true);
	}

}

class MediatorDesignPattern
{
	public static void main(String args[])
	{

		IATCMediator atcMediator = new ATCMediator();
		Flight sparrow101 = new Flight(atcMediator);
		Runway mainRunway = new Runway(atcMediator);
		atcMediator.registerFlight(sparrow101);
		atcMediator.registerRunway(mainRunway);
		sparrow101.getReady();
		mainRunway.land();
		sparrow101.land();
		
	}
}
