// Created By Danish Faruqi
//CSC 22100 - R


public class Node {

     Node  Up = null;;
     Node Down = null;;
    private int Probablity;

    Node(int Value, Node UpNode, Node DownNode)
    {
        this.Probablity = Value;
        this.Up = UpNode;
        this.Down = DownNode;

    }

    //Get Functions
    public int getProbablity() {
        return Probablity;
    }

    public Node getUp() {
        return Up;
    }

    public Node getDown() {
        return Down;
    }

    //Set Functions

    public void setUp(Node up) {
        Up = up;
    }

    public void setDown(Node down) {
        Down = down;
    }
    public void setProbablity(int Value){
        Probablity = Value;
    }
}
