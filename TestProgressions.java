/*
 * Author: Amittai Aviram - aviram@bc.edu and George Sigety - sigetyg@bc.edu
 */

public class TestProgressions {
  public static void main(String[] args) {
    int x = 8;
    try {
      int i;
      if (args.length > 0) {
        for (i=0; i < 1; i++) {
          x = Integer.parseInt(args[i]);
        }
      }
      Progression progressions[] = new Progression[10];
      progressions[0] = new ArithmeticProgression(3, 2);
      progressions[1] = new ArithmeticProgression(3);
      progressions[2] = new ArithmeticProgression();
      progressions[3] = new GeometricProgression(2, 3);
      progressions[4] = new GeometricProgression(5);
      progressions[5] = new GeometricProgression();
      progressions[6] = new FibonacciProgression(2, 3);
      progressions[7] = new FibonacciProgression();
      progressions[8] = new SquareRootProgression(1000000.0);
      progressions[9] = new SquareRootProgression();
      for (Progression p : progressions) {
        p.printProgression(x);
      }
    }
    catch(NumberFormatException e) {
      System.out.println("Please enter an integer command-line argument");
      System.out.println("to determine the size of the progressions to be printed.");
      System.out.println("Use no argument for the default size of 8.");
      return;
    }

  }
}
