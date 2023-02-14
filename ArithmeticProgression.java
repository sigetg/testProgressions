/*
 * Author: Amittai Aviram - aviram@bc.edu and George Sigety - sigetyg@bc.edu
 */
public class ArithmeticProgression extends Progression<Long> {
  private long increment;
  public ArithmeticProgression(long start, long increment) {
    super(start);
    this.increment = increment;
  }
  public ArithmeticProgression(long increment) {
    this(0, increment);
  }
  public ArithmeticProgression() {
    this(0, 1);
  }
  @Override
  protected void advance() {
    current += increment;
  }
  public static void main(String[] args) {
    ArithmeticProgression progression1 = new ArithmeticProgression(1, 2);
    ArithmeticProgression progression2 = new ArithmeticProgression(3);
    ArithmeticProgression progression3 = new ArithmeticProgression();
    progression1.printProgression(10);
    progression2.printProgression(10);
    progression3.printProgression(10);
  }
}
