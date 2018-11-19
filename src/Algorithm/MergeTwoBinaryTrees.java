package Algorithm;

/**
 * leetcode 617
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

 You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 Input:
 Tree 1                     Tree 2
 1                         2
 / \                       / \
 3   2                     1   3
 /                           \   \
 5                             4   7
 Output:
 Merged tree:
 3
 / \
 4   5
 / \   \
 5   4   7



 * Created by Jimersy Lee on 2017/6/14.
 */
public class MergeTwoBinaryTrees {
    public static void main(String[] args){
        MergeTwoBinaryTrees m=new MergeTwoBinaryTrees();

    }




    public TreeNode mergeTrees(TreeNode t1,TreeNode t2){
            //节点不定长,采用递归的方式
            if(t1==null && t2==null){
                return null;
            }
            //先算第一个节点的和
            int sum=(t1==null?0:t1.val)+(t2==null?0:t2.val);
            //new第一个节点
            TreeNode T=new TreeNode(sum);
            T.left=mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
            T.right=mergeTrees(t1==null?null:t1.right,t2==null?null:t2.right);
            return T;
        }
}




class TreeNode{
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x){
       val=x;
   }
}




