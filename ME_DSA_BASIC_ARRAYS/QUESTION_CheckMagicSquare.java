import java.util.*;

class CheckMagicSquare {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String checkMagicSquare(int n, int[][] grid) {
      int sum=0,sum1=0,sum2=0,s1=0,s2=0,s3=0,s4=0,s5=0,i,j;
       if(n==1){
           return "Yes";
       }
        //first row
        for(i=0;i<n;i++){
             sum=sum+grid[0][i];
        }
        //second row
        for(i=0;i<n;i++){
             sum1=sum1+grid[1][i];
        }
        if(sum!=sum1){
               return "No";
        }
        else{
            //third row
            for(i=0;i<n;i++){
                 sum2=sum2+grid[2][i];
            }
            if(sum2!=sum1)
             return "No";
            else{
                //first col
                for(j=0;j<n;j++){
                    s1=s1+grid[j][0];
                }
                //second col
                for(j=0;j<n;j++){
                    s2=s2+grid[j][1];
                }
                //third col
                for(j=0;j<n;j++){
                    s3=s3+grid[j][2];
                }
                if(s1!=s2 || s2!=s3)
                 return "No";
                else{
                    //diagnol
                    for(i=0;i<n;i++){
                        s4=s4+grid[i][i];
                    }
                    //anti-diagonal
                    for(i=0;i<n;i++){
                        
                        s5=s5+grid[i][n-i-1];
                        
                    }
                    if(s4!=s1 || s5!=s1)
                     return "No";
                    else
                     return "Yes";
                }
              } 
        }
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