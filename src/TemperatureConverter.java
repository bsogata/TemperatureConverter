/**
 * Created by Branden Ogata on 2/2/2015.
 */
public class TemperatureConverter {
  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println("Two arguments required.");
      System.exit(-1);
    }
    if (args.length != 2) {
      System.out.println("Illegal second argument");
      System.exit(-1);
    }

    String type = args[0];
    double result = 0.0;
    int temp = 0;

    try {
      temp = Integer.parseInt(args[1]);
    }
    catch (NumberFormatException e) {
      System.out.println("Illegal second argument");
      System.exit(-1);
    }

    if (type.equals("-C")) {
      // Celsius -> F
      result = (temp * (9.0 / 5.0)) + 32;
      System.out.println(temp + "C = " + result + "F");
    }
    else if (type.equals("-F")) {
      // F -> C
      result = (temp - 32) * (5.0 / 9.0);
      System.out.println(temp + "F = " + result + "C");
    }
    else {
      System.out.println("Illegal first argument");
      System.exit(-1);
    }
  }
}
