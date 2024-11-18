import java.util.*;

public class Solution {

    static int modeFrequency(int[] arr) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(Integer i:arr)
        {
            int occurence = map.getOrDefault(i, 0);
            map.put(i,++occurence);
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue().intValue() > max) {
                max = e.getValue().intValue();
            }

        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 3, 3, 3, 1 };
        assert (modeFrequency(arr) == 4) : "Expect 4 for arr = { 3, 3, 3, 3, 1 }";
        System.out.println("All test cases in main function passed");
    }
}

