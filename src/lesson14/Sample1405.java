package lesson14;

public class Sample1405 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human1405 human = new Human1405();
		Phone1405 phone1 = new Phone1405();
		phone1.phoneName = "Applephone";

		Phone1405 phone2 = new Phone1405();
		phone2.phoneName = "Androidphone";

		human.buyPhone(phone1);
		human.buyPhone(phone2);

	}

}
