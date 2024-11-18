import java.util.*;

public class Solution {

  public static String checkBloodDonationEligiblity(int age, int weight) {
    if(age>=18)
    {
       if(weight>50)
       return "Eligible";
       else
       return "NotEligible";
    }
    else
    return "UnderAge";

  }

  public static void main(String args[]) {
        assert (checkBloodDonationEligiblity(25, 55) == "Eligible") : "Expect Eligible for a = 25, b = 55";
        System.out.println("All test cases in main function passed");

    }
}

