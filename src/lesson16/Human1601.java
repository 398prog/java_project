package lesson16;

public class Human1601 {
	private String name;
	private int age;
	private double height;


	public void setProfile(String name) {
		this.name = name;

		System.out.println("名前を"+this.name+"にしました。");
	}

	public void setProfile(int age) {
		this.age = age;
		System.out.println("年齢を"+this.age+"歳にしました。");
	}

	public void setProfile(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("名前を"+this.name+"に、年齢を"+this.age+"歳にしました。");
	}

	public void setInformation(int age,double height) {
		this.age = 22;
		this.height = 170.5;
	}

	public void setInformation(int age) {
		this.age = 22;
	}

	public void setInformation(double height) {
		this.height = 170.5;
	}
}
