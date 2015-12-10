package leetcode.maxhowell;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
    	if(root == null){
    		return null;
    	}
    	bft(root);
    	return root;
    }
    private void bft(TreeNode travel){
    	TreeNode tmp = travel.left;
    	travel.left = travel.right;
    	travel.right = tmp;
    	tmp = null;
    	if(travel.right != null){
    		bft(travel.right);
    	}
    	if(travel.left != null){
    		bft(travel.left);
    	}
    }
}
