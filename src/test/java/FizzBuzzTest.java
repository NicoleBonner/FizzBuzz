import org.fizzbuzz.FizzBuzzMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    //Write a program that prints the numbers from 1 to 100 and for multiples of '3' print “Fizz” instead of the number and for the multiples of '5' print “Buzz”, for multiples of both prints "FizzBuzz"
    //1 = 1
    //3 = fizz
    //15 =fizzbuzz./gradle jar

    @Test
    //Test 1 - Test if number is less than zero;
    public void invalidNumberEntered () {
        Assertions.assertEquals("Invalid number, FizzBuzz only converts numbers greater than 0", FizzBuzzMethods.convert(-2));
    }

    @Test
    //Test 2 - Test to check given when a multiple of 3 only is called, then print "Fizz"
    public void multipleOf3OnlyPrintsFizzTest () {
        Assertions.assertEquals("Fizz", FizzBuzzMethods.convert(6));
    }

    //Test 3 - Test to check given when a multiple of 5 only is called, then print "Buzz"
    @Test
    public void multipleOf5OnlyPrintsBuzzTest () {
        Assertions.assertEquals("Buzz", FizzBuzzMethods.convert(10));

    }

    //Test 4 - Test to check given when a multiple of both 3 and 5, return FizzBuzz
    @Test
    public void multipleOfBoth3And5PrintsFizzBuzzTest () {
        Assertions.assertEquals("FizzBuzz", FizzBuzzMethods.convert(30));
    }

    @Test
    //Test 5  - test to check given when a number is not a multiple of 3, 5 or both, return a string value
    public void numberIsNotAMultipleOfThreeOrFiveTest () {
        Assertions.assertEquals("11", FizzBuzzMethods.convert(11));
    }

    @Test
    //Test 6 - Test list returns random numbers between 1 -100
    public void listLoopsThroughNumbersFrom1to100 () {
        for (int i=1; i<=100;i++ ){
            System.out.println(FizzBuzzMethods.convert(i));
        }
    }

//    @Disabled
//    @Test
//    //Test 8 - EX1 test
//    public void countOfFizzBuzzBetweenTwoNumbersTest(){
//        Assertions.assertEquals(2, FizzBuzz.countOfFizzBuzzBetweenTwoNumbersTest(1, 5));
//    }

}
