package fizz_buzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testInputtingOneReturnsOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.play(1);
        Assert.assertEquals("1", actual);
    }

    @Test
    public void testInputtingThreeReturnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.play(3);
        Assert.assertEquals("Fizz", actual);
    }

    @Test
    public void testInputtingFiveReturnsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.play(5);
        Assert.assertEquals("Buzz", actual);
    }

    @Test
    public void testInputtingFifteenReturnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.play(15);
        Assert.assertEquals("FizzBuzz", actual);
    }

    @Test
    public void testInputtingSevenReturnsSeven() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.play(7);
        Assert.assertEquals("7", actual);
    }
}
