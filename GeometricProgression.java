/*
 * Author: Amittai Aviram - aviram@bc.edu and George Sigety - sigetyg@bc.edu
 */
public class GeometricProgression extends Progression<Long> {
  private long base;
  public GeometricProgression(long start, long base) {
    super(start);
    this.base = base;
  }
  public GeometricProgression(long base) {
    this(1, base);
  }
  public GeometricProgression() {
    this(1, 2);
  }
  @Override
  protected void advance() {
    current *= base;
  }
  public static void main(String[] args) {
    GeometricProgression progression1 = new GeometricProgression(2, 3);
    GeometricProgression progression2 = new GeometricProgression(3);
    GeometricProgression progression3 = new GeometricProgression();
    progression1.printProgression(10);
    progression2.printProgression(10);
    progression3.printProgression(10);
  }
}
