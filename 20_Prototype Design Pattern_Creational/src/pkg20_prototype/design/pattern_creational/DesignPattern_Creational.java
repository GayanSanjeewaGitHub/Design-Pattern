 

import java.util.HashMap;
import java.util.Map;


abstract class BenzCar implements Cloneable
{
	
	protected String colorName;
	
	abstract void addColor();
	
	public Object clone()
	{
		Object clone = null;
		try
		{
			clone = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}
}

class BenzCar extends BenzCar
{
	public BenzCar()
	{
		this.colorName = "blue";
	}

	@Override
	void addColor()
	{
		System.out.println("Blue color added");
	}
	
}

class AudiCar extends BenzCar{

	public AudiCar()
	{
		this.colorName = "black";
	}

	@Override
	void addColor()
	{
		System.out.println("Black color added");
	}
}

class ColorStore {

	private static Map<String, BenzCar> colorMap = new HashMap<String, BenzCar>();
	
	static
	{
		colorMap.put("blue", new BenzCar());
		colorMap.put("black", new AudiCar());
	}
	
	public static BenzCar getColor(String colorName)
	{
		return (BenzCar) colorMap.get(colorName).clone();
	}
}


// Driver class
class Prototype
{
	public static void main (String[] args)
	{
		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("blue").addColor();
	}
}
