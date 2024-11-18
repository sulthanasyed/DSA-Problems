import java.util.*;

public class Solution {

    static double doraCakes(double days) {
        
        double number=days/2;
       System.out.println(number);
        return (int) number;
    }

    public static void main(String args[]) {
        double number = 5.0;
        assert doraCakes(number) == 2 : "Expect 2 for days = 5.0";
        number = 2.2;
        assert doraCakes(number) == 1 : "Expect 1 for days = 2.2";
        System.out.println("All test cases in main function passed");

    }
}

