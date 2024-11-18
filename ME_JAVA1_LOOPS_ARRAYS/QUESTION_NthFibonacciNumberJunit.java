import java.util.*;

public class Solution {

    static int getNthFibonacciNumber(int N) {
       int f,n1=0,n2=1;
       for(int i=0;i<N;i++)
       {
           f=n1+n2;
           n1=n2;
           n2=f;
           
       }      
       
        return n1;
    }

    public static void main(String args[]) {

        assert (getNthFibonacciNumber(3) == 2) : "Expect \"2\" for N = 3";
        assert (getNthFibonacciNumber(4) == 3) : "Expect \"3\" for N = 4";
        System.out.println("All test cases in main function passed");


    }
}

