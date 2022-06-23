//To obtain number of elements in an ArrayList we use size() method.
import java.util.ArrayList;

public class ArrayList5 {
   public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(1);
      numbers.add(7);
      numbers.add(5);
      numbers.add(6);
      System.out.println("Number of elements in ArrayList: "+numbers.size());
   }
}