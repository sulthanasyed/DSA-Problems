import java.util.*;

public class Solution {


    static String indexCapitalisation(String s, int[] ind) {
      String str="";
      char[] carr=s.toCharArray();
      for(int i=0;i<ind.length;i++)
      {
          if(ind[i]<s.length())
          {
              carr[ind[i]]=Character.toUpperCase(carr[ind[i]]);        
          }
      } 
      String strr=new String();
      String strn=strr.valueOf(carr);
      return strn;  
    }

     
    public static void main(String args[]) {
        String s = "learn by doing";
        int[] ind = new int[] { 0, 6, 9 };
        assert (indexCapitalisation(s, ind).equals("Learn By Doing")) : "Expect \"Learn By Doing\" for s = \"learn by doing\" and ind = [0, 6, 9]";

        System.out.println("All test cases in main function passed");

    }
}

