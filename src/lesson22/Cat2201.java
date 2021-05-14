package lesson22;

public class Cat2201 implements BarkingAnimal2201, FourLeggedAnimal2201 {

	//鳴き声を表示

	public void bark() {
		System.out.println("にゃー");
	}

	//歩く動作を表示

	public void walk() {
		System.out.println("猫は歩きました。");
	}
}
