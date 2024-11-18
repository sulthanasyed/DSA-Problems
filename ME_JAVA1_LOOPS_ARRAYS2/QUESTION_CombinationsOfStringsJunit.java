import java.util.*;


public class Solution {

    public static String[] combineAllStrings(String[] s1, String[] s2){
        String[] s=new String[s1.length * s2.length]; 
        int ind=0;
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s2.length;j++)
            {
                
            
                s[ind]=s1[i]+s2[j];
                ind++;
                
            }
        }
       
        return s;
       
    }

    public static void main(String args[]) {

        String input1[] = {"a", "c", "e"};
        String input2[] = {"b", "d", "f"};
        String output[] = {"ab", "ad", "af", "cb", "cd", "cf", "eb", "ed", "ef"};
        assert Arrays.equals(combineAllStrings(input1, input2), output) : "Expect [\"ab\", \"ad\", \"af\", \"cb\", \"cd\", \"cf\", \"eb\", \"ed\", \"ef\"] for input1 = [\"a\", \"c\", \"e\"] and input2 = [\"b\", \"d\", \"f\"]";
        System.out.println("All test cases in main function passed");

    }
}

