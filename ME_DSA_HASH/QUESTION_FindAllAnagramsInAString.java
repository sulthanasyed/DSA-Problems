import java.util.*;

// Implement your solution here
class FindAllAnagramsInAString {
    boolean isIdentical(Map<Character, Integer> a, Map<Character, Integer> b){
        for(char curr_char : a.keySet()){
            int curr_char_cnta = a.get(curr_char);
            int curr_char_cntb = b.getOrDefault(curr_char, 0);
            if(curr_char_cnta != curr_char_cntb) {
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
     Map<Character, Integer> pmp = new HashMap<>();
     Map<Character, Integer> smp = new HashMap<>();
     int k = p.length();
     for(int i=0; i<k; i++){
         char  curr_char = p.charAt(i);
         pmp.put(curr_char, pmp.getOrDefault(curr_char, 0) + 1);
        }
        int s_length = s.length();
        if (s_length < k) {
            return new ArrayList<>();
        }

     for(int i =0; i<k-1; i++){
         char curr_char = s.charAt(i);
         smp.put(curr_char, smp.getOrDefault(curr_char, 0) + 1);
     }   
      List<Integer> answer = new ArrayList<>();
      for(int i = k-1; i<s.length(); i++){
          char curr_char = s.charAt(i);
          smp.put(curr_char, smp.getOrDefault(curr_char, 0) + 1);
          boolean isMatch = isIdentical(pmp, smp);
          if(isMatch) {
              answer.add(i - k + 1);
          }
          char rem_char = s.charAt(i - k + 1);
          smp.put(rem_char, smp.get(rem_char) - 1);
          if(smp.get(rem_char) == 0) {
              smp.remove(rem_char);
          }
      }
       return answer;
           
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    String[] input = new String[2]; 
	    input = scanner.nextLine().split(" ");
        String s = input[0];
        String p = input[1];
        scanner.close();

        List<Integer> result = new FindAllAnagramsInAString().findAnagrams(s,p);
	    System.out.println(result.size());
        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d ", result.get(i));
        }
    }
}

/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output

Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving and see if you can recollect solving similar problems in the past
      a. Obvious logic (this would only test ability to convert logic to code)
      b. Figuring out logic
      c. Knowledge of specific algorithm, data structure or pattern
      d. Knowledge of specific domain or concepts
      e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one based on the TC/SC requirements
3. Get to a point where you can explain your approach to a 10 year old

Milestone 3 : Come up with an Instruction Manual for a 10 year old
1. Take a stab at the high-level logic & write it down like a detailed Instruction Manual for a 10 Year old where each line of the manual can be expanded into a logical line(s) of code.
2. Try to offload logic out of the main section as much as possible by delegating to functions.

Milestone 4: Code by expanding your 10 Year Olds "Instruction Manual
1. Run your code snippets at every logical step to test correctness (Helps avoid debugging larger pieces of code later)
2. Make sure you name the variables, functions clearly.
3. Use libraries as much as possible

Milestone 5: Prove that your code works using custom test cases
1. Make sure you check boundary conditions and other test cases you noted in Milestone 1
      a. If compiler is not available, dry run your code on a whiteboard or paper
2. Suggest optimizations if applicable during interviews
*/