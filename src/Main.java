public class Main {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("green");
		Car car3 = new Car(2008, "red");
		Car car4 = new Car(234.5, 999, "yellow");
		Car car5 = new Car(2015, 250, 891, "grey");

		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		System.out.println(car4.toString());
		System.out.println(car5.toString());

	}
}