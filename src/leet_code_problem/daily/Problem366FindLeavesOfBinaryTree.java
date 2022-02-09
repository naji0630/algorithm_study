package leet_code_problem.daily;

import com.sun.source.tree.Tree;
import java.util.ArrayList;
import java.util.List;

public class Problem366FindLeavesOfBinaryTree {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeNode start = new TreeNode(0, root, null);
        while(start.left != null){
            List<Integer> list = new ArrayList<>();
            dfs(root, start, list, true);
            ans.add(list);
        }
        return ans;
    }

    public void dfs(TreeNode root, TreeNode parent, List<Integer> values, boolean isLeft){
        if(root.left == null && root.right == null){
            if(isLeft){
                parent.left = null;
            }else{
                parent.right = null;
            }
            values.add(root.val);
        }
        if(root.left != null){
            dfs(root.left, root, values, true);
        }
        if(root.right != null){
            dfs(root.right, root, values, false);
        }
    }
}
