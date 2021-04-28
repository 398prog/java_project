package lesson07;

public class Practice0703 {

	public static void main(String[] args) {
		int[][] score = {{86,67,56},{98,66,70},{100,87,68}};
		int i,j;

		for(i=0;i<3;++i) {
			for(j=0;j<3;++j) {

				if(j == 0) {
					System.out.println((i+1)+"番目の人の国語の点数は"+score[i][j]+"点です。");
				}else if(j == 1) {
					System.out.println((i+1)+"番目の人の数学の点数は"+score[i][j]+"点です。");
				}else if(j == 2){
					System.out.println((i+1)+"番目の人の英語の点数は"+score[i][j]+"点です。");
				}else {
					System.out.println("error");
				}

			}
		}

	}

}
