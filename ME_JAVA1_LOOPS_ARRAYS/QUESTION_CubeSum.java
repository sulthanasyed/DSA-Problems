import java.util.*;

public class Solution {

    public static int cubeSum(int[] arr) {
      int s=0,c=1;
      for(int n:arr)
      {
        if(n%2==0){
        c=n*n*n;
        s=s+c;
        }
      }
      return s;
    }

    public static void main(String args[]) {

      assert cubeSum(new int[] { 1, 2, 3, 4 }) == 72 : "Expect 72 for {1,2,3,4}";
      System.out.println("All test cases in main function passed");

    }
}

