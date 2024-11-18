import java.util.*;

public class Solution {

    public static int findFriendSeatNo(String[] arr1, String[] arr2) {
        String  s=null;
        int k=-1;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]=="Mridula")
             s=arr1[i-1];
        }
        for(int j=0;j<arr2.length;j++){
           if(arr2[j]==s)
             k=j;
        }

           return k;
        
    }

    public static void main(String args[]) {

        String arr1[] = {"Raghu", "Goli", "Farhat", "Mridula", "Rahul"};
        String arr2[] = {"Mridula", "Raghu", "Goli", "Farhat"};
        assert findFriendSeatNo(arr1, arr2) == 3 : "Expect 3 for ([\"Raghu\", \"Goli\", \"Farhat\", \"Mridula\", \"Rahul\"],[\"Mridula\", \"Raghu\", \"Goli\", \"Farhat\"])";
        System.out.println("All test cases in main function passed");

    }
}

