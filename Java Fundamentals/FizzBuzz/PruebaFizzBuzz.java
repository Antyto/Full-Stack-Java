package FizzBuzz;

public class PruebaFizzBuzz {

    public static void main(String args[]) {

        FizzBuzz fB = new FizzBuzz();
        String output = fB.fizzBuzz(3);
        System.out.println(output);
        output = fB.fizzBuzz(5);
        System.out.println(output);
        output = fB.fizzBuzz(15);
        System.out.println(output);
        output = fB.fizzBuzz(2);
        System.out.println(output);
    }
}