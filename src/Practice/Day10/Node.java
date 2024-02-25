package Practice.Day10;

import java.util.Stack;

public class Node {
    private int parent;
    private Node root;
    Node leftSon;
    Node rightSon;

    public Node() {
    }

    public Node(int parent) {
        this.parent = parent;
    }

    public int getParent() {
        return this.parent;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    public void insertNode(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;//устанавливаем корневой элемент
        } else {
            Node currentNode = root;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (value < currentNode.getParent()) {
                    currentNode = currentNode.getLeftSon();
                    if (currentNode == null) {
                        parentNode.setLeftSon(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightSon();
                    if (currentNode == null) {
                        parentNode.setRightSon(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void printTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int gaps = 32;
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getParent());
                    localStack.push(temp.getLeftSon());
                    localStack.push(temp.getRightSon());
                    if (temp.getLeftSon() != null || temp.getRightSon() != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("**");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps = gaps / 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println(separator);
    }
}
