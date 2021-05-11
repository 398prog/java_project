package lesson14;

public class Sample1406 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human1406 satou = new Human1406();
		String fullname = satou.sayFullname("佐藤","一郎");
		double bmi = satou.calcBmi(70.0,175.0);

		System.out.println(fullname+"のBMIは"+bmi+"です。");


	}

}
