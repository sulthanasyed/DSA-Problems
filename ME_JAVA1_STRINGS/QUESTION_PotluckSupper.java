import java.util.*;

public class Solution {

    static boolean potluckSupper(String name, String dish) {
        char ch=name.charAt(0);
        char ch1=name.charAt(name.length()-1);
        char d=dish.charAt(0);
        char d1=dish.charAt(dish.length()-1);
        if((ch==d)&&(ch1==d1))
        return true;
        else
        return false;
    }

    public static void main(String args[]) {
        String name = "jake";
        String dish = "jaffa cake";
        assert (potluckSupper(name, dish) == true) : "Expect true for name = \"jake\" and dish = \"jaffa cake\"";
        dish = "butterscotch mousse";
        assert (potluckSupper(name, dish) == false) : "Expect false for name = \"jake\" and dish = \"butterscotch mousse\"";
        System.out.println("All test cases in main function passed");

    }
}

