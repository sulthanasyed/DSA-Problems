import java.util.*;

public class Solution {

    static String chessGrandmaster(String[] x) {
      int c=0;
      for(int i=0;i<x.length;i++)
      {
        if(x[i].equals("Win")){
          c=c+1;
        }
      }
      if(c==0){
      return "Master";
      }
      else if(c<=4){
      return "International Master";
      }
      else{
      return "Grand Master";
      }    
    }


    public static void main(String args[]) {
        assert chessGrandmaster(new String[] { "Loss", "Loss", "Loss" }).equals("Master") : "Expect \"Master\" for no wins";
        assert chessGrandmaster(new String[] { "Win", "Win", "Win" }).equals("International Master") : "Expect \"International Master\" for 3 wins";
        assert chessGrandmaster(new String[] { "Win", "Win", "Win", "Win", "Win" }).equals("Grand Master") : "Expect \"Grand Master\" for 5 wins";
      System.out.println("All test cases in main function passed");

    }
}

