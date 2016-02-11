package perulib;

public class perulib {

  public static double N1;
  public static double N2;
  public static double N3;

  public static float Redondeo(double N1) {
    return (float) (N1 / 1000);
  }

  public static float Redondeo(double N1, double N2) {
    return (float) (Math.rint(N1 * 100) / 100);
  }

}
