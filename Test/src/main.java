import java.util.LinkedList;

public class main {
 public static void main(String [] args) {
	 LinkedList <Car> cars = new LinkedList<>();
	 
	 Car carOne = new Car("a","b", 11);
	 Car carTwo = new Car("a","b", 14);
	 Car carThree = new Car("a","b", 31);
	 
	 cars.add(carThree);
	 cars.add(carOne);
	 cars.add(carTwo);
 }
}
