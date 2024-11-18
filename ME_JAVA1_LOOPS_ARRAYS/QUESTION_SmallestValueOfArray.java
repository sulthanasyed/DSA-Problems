import java.util.*;

public class Solution {

    static int smallestValueOfArray(int[] numbers, String toReturn) {
    int min=Integer.MAX_VALUE;
    int index=-1;
    for(int i=0;i<numbers.length;i++)
      {
          if(numbers[i]<min)
          {
            min=numbers[i];
            index=i;
          }  
      }
      if(toReturn.equals("value")){
          return min;
      }
      return index;
      
    }



    public static void main(String args[]) {
        assert (1 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "value")) : "Expect 1 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        assert (3 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "index")) : "Expect 3 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        System.out.println("All test cases in main function passed");

    }
}

