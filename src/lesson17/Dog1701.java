package lesson17;

public class Dog1701 {
	private String gender;
	private String breed;


	public Dog1701(String gender,String breed) {
		this.gender = gender;
		this.breed = breed;
	}

	public void show() {
		System.out.println("性別は"+gender+"です。");
		System.out.println("犬種は"+breed+"です。");
	}




}
