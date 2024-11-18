import java.util.*;

public class Solution {

    static List chessProdigy(int[] rating) {
        int sum = 0;
        List<Integer> output = new ArrayList<Integer>();
        for(int i = rating.length-1; i >=0 ; i--) {
            if(rating[i] > sum) {
                output.add(rating[i]);
            }
            sum += rating[i];
        }
        Collections.reverse(output);
        return output;
    }

    public static void main(String args[]) {

        assert Arrays.asList(27, 8, 3).equals(chessProdigy(new int[] { 16, 27, 1, 3, 8, 3 })) : "Expect {27, 8, 3} for array={16, 27, 1, 3, 8, 3}";
        System.out.println("All test cases in main function passed");

    }
}

