package malgara.kz.datastructures.bst;

import malgara.kz.datastructures.Node;

public class BinarySearchTree {

    Node root;
    private int count = 0;

    public void add(int value) {

        if (root == null) {
            root = new Node(value);
        } else {
            addNode(root, value);
        }

        count++;

    }

    public boolean contains(Node root, int value) {

        if (root == null) {
            return false;
        }

        if (value == root.value) {
            return true;
        }

        if (value < root.value) {
            return contains(root.left, value);
        } else {
            return contains(root.right, value);
        }

    }

    // the most complicated method is this class ((
    public boolean remove(int value) {

        if (root == null) {
            return false;
        }

        if (count == 1) {

            // the only node in the BST
            root = null;
            count--;
            return true;
        }

        Node nodeToRemove = findNode(root, value);

        if (nodeToRemove == null) {
            // node not found is the BST
            return false;
        }

        Node parent = findParent(root, value);

        if (nodeToRemove.left == null && nodeToRemove.right == null) {
            // nodeToRemove is leaf node, no child nodes
            if (value < parent.value) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (nodeToRemove.left != null && nodeToRemove.right == null) {
            // nodeToRemove has left child, but not right child
            if (value < parent.value) {
                parent.left = nodeToRemove.left;
            } else {
                parent.right = nodeToRemove.left;
            }
        } else if (nodeToRemove.left == null && nodeToRemove.right != null) {
            // nodeToRemove has not left child, but has right child
            if (value < parent.value) {
                parent.left = nodeToRemove.right;
            } else {
                parent.right = nodeToRemove.right;
            }
        } else {

            // nodeToRemove has both children
//            first approach
//            Node largestLeftNode = nodeToRemove.right;
//            while (largestLeftNode.left != null) {
//
//                // find largest value of left child of nodeToRemove
//                largestLeftNode = largestLeftNode.left;
//            }
//
//            Node largestParent = findParent(nodeToRemove, largestLeftNode.value);
//            // set largest parent's right pointer of largest value to null
//            largestParent.left = null;
//            nodeToRemove.value = largestLeftNode.value;


//            second approach
            // find min node in right sub tree of nodeToRemove
            Node minNode = findMin(nodeToRemove.right);

            Node minNodeParent = findParent(nodeToRemove, minNode.value);
            // set minNode to null
            minNodeParent.left = null;

            // replace nodeToRemove value with minNode value
            nodeToRemove.value = minNode.value;

        }

        count--;
        return true;
    }

    public void traverse() {
        System.out.println("Tree nodes (in inorder):");
        inorder(root);
    }

    public void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.println(root);
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) {

        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root);
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }

    public int size() {

        return count;
    }

    public Node getRoot() {
        return root;
    }

    private void addNode(Node root, int value) {

        if (value < root.value) {
            if (root.left == null) {
                root.left = new Node(value);
            } else {
                addNode(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(value);
            } else {
                addNode(root.right, value);
            }
        }
    }

    public Node findNode(Node root, int value) {

        if (root == null) {
            return null;
        }

        if (value == root.value) {
            return root;
        }

        if (value < root.value) {
            return findNode(root.left, value);
        } else {
            return findNode(root.right, value);
        }

    }

    public Node findParent(Node root, int value) {

        if (value == root.value) {
            return  null;
        }

        if (value < root.value) {
            if (root.left == null) {
                return null;
            }

            if (value == root.left.value) {
                return root;
            }

            return findParent(root.left, value);

        } else {

            if (root.right == null) {
                return null;
            }

            if (value == root.right.value) {
                return root;
            }

            return findParent(root.right, value);
        }

    }

    public Node findMin(Node root) {

        if (root == null) {
            return  null;
        }

        if (root.left == null) {
            return root;
        }

        return findMin(root.left);

    }

    public Node findMax(Node root) {

        if (root == null) {
            return null;
        }

        if (root.right == null) {
            return root;
        }

        return findMax(root.right);

    }
}
