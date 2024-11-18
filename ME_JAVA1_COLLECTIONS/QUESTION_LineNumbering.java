import java.util.*;

public class Solution {

    static List<String> lineNumbering(List<String> lines) {
      
      List<String> s = new ArrayList<String>();
      int lineno = 1;
      for(String eachLine:lines)
      {
        s.add(lineno + " " + eachLine);
        lineno++;
      }
      return s;
    }

    public static void main(String args[]) {

      assert (lineNumbering(Arrays.asList("Hi", "Hello", "Hey")).equals(Arrays.asList("1 Hi", "2 Hello", "3 Hey"))) : "Expect [\"1 Hi\", \"2 Hello\", \"3 Hey\"] for lines = [\"Hi\", \"Hello\", \"Hey\"]";
      System.out.println("All test cases in main function passed");

    }
}

