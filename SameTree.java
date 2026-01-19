import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class SameTree {

        public static List<Integer> recursiveInorder(){
            if (root == null) return;

            recursiveInorder(root.left, ls);
            ls.add(root.val);
            recursiveInorder(root.right, ls);
    }

    public List<Integer> inorder(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        recursiveInorder(root, ls);
        return ls;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pl = inorder(p);
        List<Integer> ql = inorder(q);

        if (pl.size() != ql.size()) return false;

        for (int i = 0; i < pl.size(); i++) {
            if (!pl.get(i).equals(ql.get(i))) {
                return false;
            }
        }
        return true;
    public static void main(String[] args) {
        
    }
}
