public class Car {

	private int year;
	private double speed;
	private int weight;
	private String color;

	public Car() {}

	public Car(String color) {
		this.color = color;
	}

	public Car(int year, String color) {
		this(color);
		this.year = year;
	}

	public Car(double speed, int weight, String color) {
		this.speed = speed;
		this.weight = weight;
		this.color = color;
	}

	public Car(int year, double speed, int weight, String color) {
		this(speed, weight, color);
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car{" +
				"year=" + year +
				", speed=" + speed +
				", weight=" + weight +
				", color='" + color + '\'' +
				'}';
	}
}
