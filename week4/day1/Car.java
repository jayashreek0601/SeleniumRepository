package week4.day1;

public class Car extends Vehicle {
	public void playMusic() {
		System.out.println("Play Music");
		super.start();
	}

	public static void main(String[] args) {
		Car car=new Car();
		car.playMusic();

	}

}
