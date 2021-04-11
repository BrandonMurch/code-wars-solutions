public class Suite2 {
  public static String game(long n) {
    long result = (long)Math.pow(n, 2);
    if (result % 2 != 0) {
      return "[" + result +  ", 2]";
    }
    return "[" + result/2 + "]";
  }
}
