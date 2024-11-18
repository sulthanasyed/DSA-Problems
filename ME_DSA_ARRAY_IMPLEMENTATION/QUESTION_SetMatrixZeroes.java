import java.io.*;
import java.util.*;

class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rows[] = new int[n];
        int cols[] = new int[m];
        
        for(int i=0; i< m ; i++)
            cols[i] = 1;
    
        for(int i=0; i< n ; i++)
            rows[i] = 1;

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                // System.out.println(matrix[i][j]);
                if(matrix[i][j] == 0) {
                    rows[j] = 0;
                    cols[i] = 0;
                }
            }
        }

         for(int i = 0 ; i < n ; ++i) {
            for(int j = 0 ; j < m ; ++j) {
                if(rows[i] == 0 || cols[j] ==0) {
                    matrix[j][i] = 0;
                }
            }
         }

     }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }

        in.close();
        new SetMatrixZeroes().setMatrixZeroes(matrix);

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
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