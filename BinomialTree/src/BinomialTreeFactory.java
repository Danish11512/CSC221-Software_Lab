// Created By Danish Faruqi
//CSC 22100 - R

public final class BinomialTreeFactory {
    public static Node create(int T, int P){

        if (T == 0) { // base case
            return null;
        }
        else { // recursively create the nodes with P probabilities
            Node NodeUp = create(T-1, P);
            Node NodeDown = create(T-1, P);
            return new Node(P, NodeUp, NodeDown);


        }
    }

}

// p stays constant
//just create a tree with P as the value everywhere