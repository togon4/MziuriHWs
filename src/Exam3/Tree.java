package Exam3;

public class Tree {
    Node root;

    public Tree(int rootValue){
        this.root = new Node(rootValue);
    }

    public void addNode(Node parent, int childValue){
        Node child = new Node(childValue);
        parent.addChild(child);
    }
    public void printTree(Node node, String indent){
        if(node == null) return;
        System.out.println(indent + node.value);

        for(Node child : node.children){
            printTree(child, indent + "   ");
        }
    }


    public void printTree() {
        printTree(root, "");
    }
}

