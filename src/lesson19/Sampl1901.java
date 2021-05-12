package lesson19;

public class Sampl1901 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			String mailAddress = "hanako@mail.com.jp";

			String userName = mailAddress.substring(0,mailAddress.indexOf("@"));

			System.out.println("メールアドレス："+mailAddress);
			System.out.println("ユーザ名："+userName);

	}

}
