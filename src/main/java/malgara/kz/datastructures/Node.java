package malgara.kz.datastructures;

public class Node {

    Node left;
    Node right;
    int value;

    Node(int value) {
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
