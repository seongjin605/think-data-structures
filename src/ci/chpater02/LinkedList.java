package ci.chpater02;

public class LinkedList {
    static class Node {
        Node next = null;
        int data;

        public Node(int d) {
            data = d;
        }

        void appendToTail(int d) {
            Node end = new Node(d);
            Node n = this;
            while(n.next != null) {
                n = n.next;
            }
            n.next = end;
        }
    }

    public static void main(String[] args) {
        Node n = new Node(0);
        n.appendToTail(1);
        System.out.println(n.next.data);
    }
}
