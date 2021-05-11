package lesson14;

public class Sample1407 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human1407 satou = new Human1407();
		String[] showHobbies = satou.tellHobbies();

		for(int i=0;i<showHobbies.length;i++) {
			System.out.println((i+1)+"つ目の趣味は"+showHobbies[i]+"です。");
		}



	}

}
