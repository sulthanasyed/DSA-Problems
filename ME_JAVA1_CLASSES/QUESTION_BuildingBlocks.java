import java.util.*;

public class Solution {
    int length;
    int width;
    int height;

    public Solution(int[] arr){
      this.length=arr[1];
      this.width=arr[0];
      this.height=arr[2];

    }

            
        public int getWidth(){
        
            return this.width;
        }
        public int getHeight(){
            return this.height;
        }
        public int getLength(){
            return this.length;

        }
        public int getVolume(){
            return width*height*length;
        }
        public int getSurfaceArea(){
       return 2*((length*height)+(length*width)+(width*height));
        
        }
          
    

    public static void main(String args[]) {
        Solution block = new Solution(new int[] { 3, 4, 2 });
        assert block.getLength() == 4 : "Expect length = 4 for Solution([3, 4, 2])";
        assert block.getWidth() == 3 : "Expect width = 3 for Solution([3, 4, 2])";
        assert block.getHeight() == 2 : "Expect height = 2 for Solution([3, 4, 2])";
        assert block.getVolume() == 24 : "Expect volume = 24 for Solution([3, 4, 2])";
        assert block.getSurfaceArea() == 52 : "Expect surface area = 52 for Solution([3, 4, 2])";
        System.out.println("All test cases in main function passed");
    }
}

