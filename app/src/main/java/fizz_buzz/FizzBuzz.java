package fizz_buzz;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.play(1));
    }

    public String play(int number) {
        if(number % 15 == 0) {
            return "FizzBuzz";
        } else if(number % 5 == 0){
            return "Buzz";
        } else if(number % 3 == 0){
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }
}
