package lesson11;

public class Practice1112 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=5;i<=20;i++) {
			
			if(i == 8) {
				continue;
			}else if(i == 10) {
				break;
			}else {
				System.out.print(i+"\s");
			}
		}
	}

}
