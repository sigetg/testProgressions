/*
 * Author: Amittai Aviram - aviram@bc.edu and George Sigety - sigetyg@bc.edu
 */
abstract public class Progression<T> {
  protected T current;

  public Progression(T start) {
    current = start;
  }

  public T nextValue() {
    T answer = current;
    advance();
    return answer;
  }
  abstract protected void advance();

  public void printProgression(int n) {
    System.out.print(nextValue());
    for (int i = 1; i < n; ++i) {
      System.out.print(" " + nextValue());
    }
    System.out.println();
  }
}
