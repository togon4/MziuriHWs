package Exam3;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int value;
    List<Node> children;

    public Node(int value){
        this.children = new ArrayList<>();
        this.value = value;
    }

    public void addChild(Node child){
        this.children.add(child);
    }
}
