import java.util.*;

public class Solution {
     String fruit;
     String arr[]={"banana","orange","apple"};
     public Solution()
     {
         int ind=new Random().nextInt(arr.length);
         this.fruit=arr[ind];
     }

     public String GetFruit()
     {
         return this.fruit;
     }
      public static void main(String args[]) {
        Solution obj1 = new Solution();
        System.out.println(obj1.GetFruit());
        Solution obj2 = new Solution();
        System.out.println(obj2.GetFruit());
    }
}

