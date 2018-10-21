import java.util.ArrayList;

public class Solution {

  public static void main(String[] args) {
    // i, j, k
    System.out.println(beautifulDays(20, 23, 6));
  }

  // Complete the beautifulDays function below.
  static int beautifulDays(int startingDayNumber, int endingDayNumber, int divisor) {
    int[] numbers = generateNumbers(startingDayNumber, endingDayNumber);

    int beautifulNumbersCount = 0;
    for (int number : numbers) {
      if (isBeautifulDay(number, divisor)) {
        beautifulNumbersCount += 1;
      }
    }
    return beautifulNumbersCount;
  }

  private static int[] generateNumbers(int startNumber, int endNumber) {
    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = startNumber; i <= endNumber; i++) {
      numbers.add(i);
    }
    int[] numbersInt = new int[numbers.size()];
    for (int i = 0; i < numbers.size(); i++) {
      numbersInt[i] = numbers.get(i);
    }
    return numbersInt;
  }

  private static boolean isBeautifulDay(int dayNumber, int divisor) {
    int absoluteDifference = Math.abs(dayNumber - getReversedNumber(dayNumber));
    return absoluteDifference % divisor == 0;
  }

  private static int getReversedNumber(int number) {
    int n = number;
    int reversedNumber = 0;
    while (n != 0) {
      reversedNumber = reversedNumber * 10;
      reversedNumber = reversedNumber + n % 10;
      n = n / 10;
    }
    return reversedNumber;
  }

}
