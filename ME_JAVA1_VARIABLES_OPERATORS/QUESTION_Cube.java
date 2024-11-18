import java.util.*;

public class Solution {

    public static int findCube(int a) {
        int b=a*a*a;
        return b;
    }

    public static void main(String args[]) {
        assert (findCube(3) == 27) : "Expect 27 for a = 3";
        System.out.println("All test cases in main function passed");
    }
}

