public class Node {
    int val;
    Node left;
    Node right;
    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    Node(int val) {
        this.val = val;
    }
}
