package training;

public class FizzBuzz {
    /**
     * fizzBuzzメソッド.<br>
     * 引数が3の倍数の場合、"Fizz"を、
     * 引数が5の倍数の場合、"Buzz"を、
     * 引数が3の倍数かつ5の倍数の場合、"FizzBuzz"を返す。
     */
    public String doFizzBuzz(int num) {

        String result = "";
        if (num % 15 == 0) {
            result = "FizzBuzz";
        } else if (num % 3 == 0) {
            result = "Fizz";
        } else if (num % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(num);
        }
        return result;
    }
}
