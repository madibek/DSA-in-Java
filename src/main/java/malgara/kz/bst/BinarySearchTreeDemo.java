package malgara.kz.bst;

public class BinarySearchTreeDemo {

    public static void main(String[] args) {
        System.out.println(BinarySearchTreeDemo.class.getName());

        BinarySearchTree tree = new BinarySearchTree();
        tree.add(4);
        tree.add(2);
        tree.add(3);
        tree.add(0);
        tree.add(1);

        tree.add(40);
        tree.add(20);
        tree.add(30);
        tree.add(5);
        tree.add(10);

        tree.traverse();

        int search = 10;
        if (!tree.contains(tree.getRoot(), search)) {
            System.out.println(search + " is not found in the tree");
        }

        Node node = tree.findNode(tree.getRoot(), search);
        if (node == null) {
            System.out.println(search + " is not found");
        }

        search = 2;
        if (tree.contains(tree.getRoot(), search)) {
            System.out.println(search + " is found in the tree");
        }

        node = tree.findNode(tree.getRoot(), search);
        if (node != null) {
            System.out.println("Node with value " + search + " found. " + node);
        }

        Node parentOf2 = tree.findParent(tree.getRoot(), search);
        System.out.println("Parent of 2 is " + parentOf2);

        System.out.println("tree size: " + tree.size());

        System.out.println("Removing items: 3, 100, 10, 4");
        tree.remove(3);
        tree.remove(100);
        tree.remove(10);
        tree.remove(4);

        System.out.println("tree size after removing: " + tree.size());
        tree.traverse();

        System.out.println("Min node - " + tree.findMin(tree.getRoot()));
        System.out.println("Max node - " + tree.findMax(tree.getRoot()));



    }
}
