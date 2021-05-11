package lesson14;

public class Human1406 {

	String sayFullname(String sei,String mei) {
		String fullname = sei + mei;
		return fullname;
	}

	double calcBmi(double weight,double height) {
		double bmi = weight / (height / 100) * (height / 100);
		return bmi;
	}
}
