import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution {

    public static boolean checkPrime(int n) {
         int rem=0,res=0;
         if(n<=1)
         return false;
        for(int i=2;i<n-1;i++)
        {
           //    rem=n%i;
             //  if(rem==0)
               //res=res+1;
             if(n%i==0)
        //}
       //  if(res==2)
         //return true;
         return false;
        // else
         //return false;
        }
       return true;
    }


    public static void main(String args[]) {
        int n = 3;
        assert checkPrime(n) == true : "Expect true for n = 3";
        System.out.println("All test cases in main function passed");
    }
}

