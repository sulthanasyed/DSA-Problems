import java.io.*;
import java.util.*;

public class ValidParenthesis {
    // Implement your solution here
    public String isValid(String s) {
        Stack<String> stack= new Stack<>();
        String arr[]=s.split("");
        String valid="true";
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("(")||arr[i].equals("[") || arr[i].equals("{")){
                stack.push(arr[i]);
            }
            else if(arr[i].equals(")")|| arr[i].equals("]")||arr[i].equals("}")){
                if(stack.isEmpty()){
                    valid="false";
                    break;
                }
                else{
                    String a=stack.pop();
                    if ((arr[i].equals(")") && a.equals("(")) || (arr[i].equals("]") && a.equals("["))
							|| (arr[i].equals("}") && a.equals("{")))
                    valid="true";
                    else{
                        valid="false";
                        break;
                    }
                }
            }
        }
        if(valid.equals("true") && stack.isEmpty()) {
            valid = "true";
        } else {
            valid = "false";
        }
        return valid;
    }
 
    // NOTE: Please do not modify this function
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = in.readLine();
        String result = new ValidParenthesis().isValid(parenthesis);
        System.out.print(String.valueOf(result));
    }
}

/* 
  Crio Methodology
  
  Milestone 1: Understand the problem clearly
  1. Ask questions & clarify the problem statement clearly.
  2. *Type down* an example or two to confirm your understanding of the input/output & extend it to test cases
  
  Milestone 2: Finalize approach & execution plan
  1. Understand what type of problem you are solving.
       a. Obvious logic, tests ability to convert logic to code
       b. Figuring out logic
       c. Knowledge of specific domain or concepts
       d. Knowledge of specific algorithm
       e. Mapping real world into abstract concepts/data structures
  2. Brainstorm multiple ways to solve the problem and pick one
  3. Get to a point where you can explain your approach to a 10 year old
  4. Take a stab at the high-level logic & *type it down*.
  5. Try to offload processing to functions & keeping your main code small.
  
  Milestone 3: Code by expanding your pseudocode
  1. Have frequent runs of your code, dont wait for the end
  2. Make sure you name the variables, functions clearly.
  3. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
  4. Use libraries as much as possible
  
  Milestone 4: Prove to the interviewer that your code works with unit tests
  1. Make sure you check boundary conditions
  2. Time & storage complexity
  3. Suggest optimizations if applicable
  */