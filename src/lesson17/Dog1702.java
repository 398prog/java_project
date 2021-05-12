package lesson17;

public class Dog1702 {
	private String gender;
	private String breed;


	public Dog1702() {
		gender = "オス";
		breed = "チワワ";
		System.out.println("犬を作成しました。");
	}

	public Dog1702(String gender,String breed) {
		this.gender = gender;
		this.breed = breed;
		System.out.println("犬を作成しました。");
	}
	public void show() {
		System.out.println("性別は"+gender+"です。");
		System.out.println("犬種は"+breed+"です。");
	}




}
