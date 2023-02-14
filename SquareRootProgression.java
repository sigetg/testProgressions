/*
 * Author: George Sigety - sigetyg@bc.edu
 */

import java.lang.Math;

 public class SquareRootProgression extends Progression<Double> {

   public SquareRootProgression(double start) {
     super(start);
   }
   public SquareRootProgression() {
     this(65536.0);
   }

   @Override
   protected void advance() {
     current = Math.sqrt(current);
   }

 }
