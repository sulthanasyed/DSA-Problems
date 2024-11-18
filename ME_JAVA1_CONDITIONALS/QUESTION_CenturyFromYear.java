import java.util.*;

public class Solution {

  public static int findCenturyFromYear(int a) {
  
    if(a>99)
    {
      int b=a/100;
      int r=a%100;
         if(r!=0)
          {
             b=b+1;
             return b;
          }      
         else 
            return b;
    }
    else
      return 1;
  }

  public static void main(String args[]) {
        assert (findCenturyFromYear(1705) == 18) : "Expect 18 for a = 1705";
        System.out.println("All test cases in main function passed");

    }
}

