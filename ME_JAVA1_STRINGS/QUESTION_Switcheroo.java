import java.util.*;

public class Solution {

    static String switcheroo(String s) {
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='a')
        {
            System.out.println(s);

            s = s.replace('a','d');
        }
    }
     System.out.println(s);
    for(int j=0;j<s.length();j++){
        if(s.charAt(j)=='b'){
         s = s.replace('b','a');
        }
    } System.out.println(s);
    for(int k=0;k<s.length();k++){
        if(s.charAt(k)=='d'){ 
       s =  s.replace('d','b');
        }
    }
    System.out.println(s);
    return s;
    }
    public static void main(String args[]) {
        String s = "aabacbaa";
        assert (switcheroo(s).equals("bbabcabb")) : "Expect \"bbabcabb\" for s = \"aabacbaa\"";
        System.out.println("All test cases in main function passed");

    }
}

