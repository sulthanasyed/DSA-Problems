import java.util.*;

public class Solution {

    static boolean isMagicSquare(int[][] arr) {
        int dsum=0,adsum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i==j)
                dsum+=arr[i][j];
                if((i+j) == (arr.length-1))
                adsum+=arr[i][j];
            }
        }
        if(dsum!=adsum)
        {
            return false;
        }
        int rowsum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                rowsum+=arr[i][j];
            }
            if(rowsum!=dsum)
            {
                return false;
            }
            rowsum=0;
        }
        int columnsum=0;
        for(int j=0;j<arr[0].length;j++)
        {
            for(int i=0;i<arr.length;i++)
            {
                columnsum+=arr[i][j];

            }
            if(columnsum!=dsum){
                return false;
            }
            columnsum=0;
        }
        return true;
    }
        
    public static void main(String args[]) {

        int[][] arr1 = {{4,9,2}, {3,5,7}, {8,1,6}};
        assert isMagicSquare(arr1) == true : "Expect true for arr = {{4,9,2}, {3,5,7}, {8,1,6}}";

        int[][] arr2 = {{4,9,2}, {3,5,9}, {8,1,6}};
        assert isMagicSquare(arr2) == false : "Expect false for arr = {{4,9,2}, {3,5,9}, {8,1,6}}";
        System.out.println("All test cases in main function passed");

    }
}

