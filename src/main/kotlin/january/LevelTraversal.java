package january;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class LevelTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<> ();
        Queue<TreeNode> queue = new LinkedList<> ();
        if (root == null) {
            return new ArrayList();
        }
        queue.add(root);
        while (!queue.isEmpty()) {

            int treeLength = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < treeLength; i++) {
                TreeNode current = queue.poll();
                tempList.add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }

            }
            result.add(tempList);

        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNodeV2 = new TreeNode (3);
        treeNodeV2.left = new TreeNode (9);
        treeNodeV2.right = new TreeNode (20);
        treeNodeV2.right.left = new TreeNode (15);
        treeNodeV2.right.right = new TreeNode (7);

        LevelTraversal lt = new LevelTraversal ();
        var result = lt.levelOrder (treeNodeV2);
        System.out.println (result);
    }
}

