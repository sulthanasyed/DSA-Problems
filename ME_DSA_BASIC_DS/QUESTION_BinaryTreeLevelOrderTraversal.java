import java.io.*;
import java.util.*;
import crio.ds.Tree.TreeNode;

/*
Definition of TreeNode
class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}

Use new TreeNode(data) to create new Node
*/
class Solution {
    public List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root) {
    //1.create an empty queue
    Queue<TreeNode> queue=new LinkedList<>();
    //2.define ans list
    List<List<Integer>> ans=new LinkedList<>();
    //3.insert root node to queue
    queue.add(root);
    //4.for every level
    while(!queue.isEmpty()){
        //i.cal9culate no of nodes=size of queue
        int size=queue.size();
        //ii.create an empty sublist
        List<Integer> subList=new LinkedList<>();
        //iii.for every node
        for(int i=0;i<size;i++){
             //a.remove from queue
            TreeNode node=queue.poll();
            //b.add value to sublist
             subList.add((int)node.val);
            //c.add left child to the queue if present 
            if(node.left!=null){
                queue.add(node.left);
            }
            //d.add right child to the queue if present
            if(node.right!=null){
                queue.add(node.right);
            }
         //iv.add the sublist to the ans
            
        }
        ans.add(subList);
    }
     return ans;
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