public class Refactoring_tachBien {
    public static void main(String[] args) {
        String fizzbuzz = fizzBuzz(100);
        System.out.println(fizzbuzz);
    }
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}