import java.util.*;

public class Solution {

    public static int sumOfTwoArrays(int[] arr1, int[] arr2) {
        int s=0;
        for(int i:arr1)
        {
            s=s+i;
        }   
        for(int i:arr2)
        {
            s=s+i;
        }
        return s;
    } 

    public static void main(String args[]) {
        assert (sumOfTwoArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }) == 21) : "Expect 21 for {1,2,3},{4,5,6}";
        System.out.println("All test cases in main function passed");

    }
}

