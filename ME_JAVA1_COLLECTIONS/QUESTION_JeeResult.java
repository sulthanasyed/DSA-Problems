import java.util.*;

public class Solution {

    static String jeeResult(String marks) {
    String array[]=marks.split(" ");
    int min=Integer.parseInt(array[0]);
    int max=Integer.parseInt(array[0]);
    for(int i=1;i<array.length;i++)
    {
      int j=Integer.parseInt(array[i]);
      max=Math.max(max,j);
      min=Math.min(min,j);

    }
    return max+" "+min;
    }


    public static void main(String args[]) {

      assert (jeeResult("4 2 -13 4 5").equals("5 -13")) :  "Expect \"5 -13\" for s=\"4 2 -13 4 5\"" ;
      System.out.println("All test cases in main function passed");

    }
}

