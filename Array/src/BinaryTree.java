import sun.reflect.generics.tree.Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
 }

public class BinaryTree {

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        List<Integer> resultado = new ArrayList<>();
        while (!nodes.isEmpty()){
            TreeNode current = nodes.pop();
            if (current == null) continue;
            resultado.add(current.val);
            if (current.right != null){
                nodes.push(current.right);
            }
            if (current.left != null){
                nodes.push(current.left);
            }
        }
        return resultado;


    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode current = root;
        List<Integer> resultado = new ArrayList<>();
        while(!nodes.isEmpty() || current != null){
            if (current != null){
                nodes.push(current);
                current = current.left;
            } else {
                TreeNode node = nodes.pop();
                resultado.add(node.val);
                current = node.right;
            }
        }
        return resultado;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode current = root;
        List<Integer> resultado = new ArrayList<>();
        if (root == null) return resultado;
        TreeNode prev = null;
        nodes.push(current);
        while (!nodes.isEmpty()){
            current = nodes.peek();
            if (prev == null || prev.left == current || prev.right == current){
                if (current.left != null){
                    nodes.push(current.left);
                } else if (current.right != null){
                    nodes.push(current.right);
                } else {
                    nodes.pop();
                    resultado.add(current.val);
                }
            } else if (current.left == prev){
                if (current.right != null){
                    nodes.push(current.right);
                } else {
                    nodes.pop();
                    resultado.add(current.val);
                }
            } else if (current.right == prev){
                nodes.pop();
                resultado.add(current.val);
            }

            prev = current;

        }
        return  resultado;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        TreeNode current = root;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(current);
        List<List<Integer>> resultado = new ArrayList<>();
        int nodeCount;
        int level = 0;
        while (!nodes.isEmpty()){
            nodeCount = nodes.size();
            resultado.add(level,new ArrayList<>());
            while (nodeCount > 0) {
                current = nodes.peek();

                resultado.get(level).add(current.val);
                nodes.remove();
                if (current.left != null){
                    nodes.add(current.left);
                }
                if (current.right != null){
                    nodes.add(current.right);
                }
                nodeCount--;
            }
            level++;
        }

        return resultado;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        BinaryTree binaryTree = new BinaryTree();

        System.out.println(Arrays.toString(binaryTree.levelOrder(root).toArray()));

    }
}
