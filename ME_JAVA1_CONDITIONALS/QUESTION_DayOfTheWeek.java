import java.util.*;

public class Solution {

  public static String dayOfTheWeek(int day) {
    String s;
    switch(day)

    {
      case 1:s="Monday";
      break;
      case 2:s= "Tuesday";
      break;
      case 3:s= "Wednesday";
      break;
      case 4:s= "Thursday";
      break;
      case 5:s= "Friday";
      break;
      case 6:s= "Saturday";
      break;
      case 7:s= "Sunday";
      break;
      default:s="Invalid";
    }
    return s;
  }

  public static void main(String args[]) {
        assert (dayOfTheWeek(6).equals("Saturday")) : "Expect Saturday for day = 6";
        System.out.println("All test cases in main function passed");
    }
}

