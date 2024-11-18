import java.util.*;

public class Solution {

    static String hidePhoneNumber(String s) {
        char c;
        String s1 = new String();
        for(int i=0;i<s.length()-3;i++){
            s1 = s1.concat("*");
        }
       s1 = s1.concat(s.substring(s.length()-3, s.length()));
        return s1;
    }


    public static void main(String args[]) {
        assert (hidePhoneNumber("9090213229").equals("*******229")) : "Expect \"*******229\" when s= \"9090213229\"";
        System.out.println("All test cases in main function passed");

    }
}

