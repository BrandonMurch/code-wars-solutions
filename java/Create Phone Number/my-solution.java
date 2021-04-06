public class Kata {
  public static String createPhoneNumber(int[] numbers) {

// Code starts here
    String numberString = createString(numbers);
    return "(" + numberString.substring(0, 3) + ") "
      + numberString.substring(3, 6) + "-"
      + numberString.substring(6, 10);
  }

    private static String createString(int[] numbers) {
    StringBuilder result = new StringBuilder();
    for (int number : numbers) {
      result.append(String.valueOf(number));
    }
    return result.toString();
  }
// Code ends here

}
