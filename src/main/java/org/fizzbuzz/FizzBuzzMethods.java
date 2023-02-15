package org.fizzbuzz;

public class FizzBuzzMethods {

    public static void main(String[] args) {
        //FizzBuzzMethods fizzbuzz = new FizzBuzzMethods(); //can delete as it's static
        String result = FizzBuzzMethods.convert(15); //FizzBuzzMethods.convert
        //String result save method to avaliable and output to console
        System.out.println(result);
    }

    public static String convert(int numToReturnFizzBuzz) {

        for (int i = 1; i <= 100; i++) { //enhanced for loop used to use objects
            if (numToReturnFizzBuzz <= 0) {
                return "Invalid number, FizzBuzz only converts numbers greater than 0";
            }
            if (numToReturnFizzBuzz % 3 == 0 && numToReturnFizzBuzz % 5 == 0) {
                return "FizzBuzz";
            }
            if (numToReturnFizzBuzz % 3 == 0) {
                return "Fizz";
            }
            if (numToReturnFizzBuzz % 5 == 0) {
                return "Buzz";
            }
            else
                return String.valueOf(numToReturnFizzBuzz);// converting int number to a string
        }
        return "FizzBuzz finished"; // research more info on this
    }
}
