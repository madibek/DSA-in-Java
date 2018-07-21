package malgara.kz.datastructures;

public class Node {

    public Node left;
    public Node right;
    public int value;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}
