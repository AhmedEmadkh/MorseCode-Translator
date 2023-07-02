package morsecode;
public class Node {

    char letter;
    String morse;
    Node RightChild;
    Node LeftChild;

    public Node(Node left, Node right) {
        LeftChild = left;
        RightChild = right;

    }

    public void setMorse(String morse) {
        this.morse = morse;
    }

    public String getMorse() {
        return morse;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

}
