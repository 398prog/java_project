package lesson18;

public class Bike1801 {

	public static int sum = 0;
	private String num;

	public Bike1801(String num){
		sum++;
	}

	public static void showSum() {
		System.out.println("バイクの合計は"+sum+"台です。");
	}
}
