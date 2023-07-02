package morsecode;

public class Tree {

    Node root;

    public Tree() {
        root = new Node(null, null);
    }

    public void insert(char letter, String code) {
        Node current = root;

        for (int i = 0; i < code.length(); i++) {
            String CharNumICode = code.substring(i, i + 1);
            if (CharNumICode.equals(".")) {
                if (current.LeftChild == null) {
                    current.LeftChild = new Node(null, null);             // creat children for LeftChild
                }
                current = current.LeftChild;
            } else if (CharNumICode.equals("-")) {
                if (current.RightChild == null) {
                    current.RightChild = new Node(null, null);            // creat children for RightChild
                }
                current = current.RightChild;
            }

        }
        current.setLetter(letter);
        current.setMorse(code);
    }

    public void PostOrder(Node node) {
        if (node == null) {
            return;
        }

        PostOrder(node.LeftChild);
        PostOrder(node.RightChild);

        System.out.print(node.letter + " ");

    }

    public void PostOrderTrav() {
        PostOrder(root);
    }

    public boolean find(Node node, String morseCode) {
        if (node == null) {
            return false;
        }
        boolean found = false;
        found = find(node.LeftChild, morseCode);
        if (!found) {
            found = find(node.RightChild, morseCode);
        }
        if (node.morse != null && node.morse.equals(morseCode)) {
            System.out.print(" " + node.letter + " ");
            return true;
        }
        return found;
    }

    public void find(String morseCode) {
        boolean found = find(root, morseCode);
        if (!found) {
            System.out.print("Code Not Found. ");
        }
    }
}
