
public class Car implements Comparable<Car> {

	String model;
	String color;
	int year;
	
	public Car(String model, String color, int year)
	{
		this.model= model;
		this.color = color;
		this.year = year;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
