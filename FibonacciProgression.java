/*
 * Author: Amittai Aviram - aviram@bc.edu and George Sigety - sigetyg@bc.edu
 */
public class FibonacciProgression extends Progression<Long> {
  private long previous;
  public FibonacciProgression(long first, long second) {
    super(first);
    previous = second - first;
  }
  public FibonacciProgression() {
    this(0, 1);
  }
  @Override
  protected void advance() {
    long next = previous + current;
    previous = current;
    current = next;
  }
  public long third() {
    return previous + current;
  }
  public static void main(String[] args) {
    FibonacciProgression progression1 = new FibonacciProgression(1, 2);
    FibonacciProgression progression2 = new FibonacciProgression();
    progression1.printProgression(10);
    progression2.printProgression(10);
  }
}
