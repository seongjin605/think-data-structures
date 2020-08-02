package ci.chpater02;

public class _2_1 {
    static class Node {
        Node next = null;
        int data;

        public Node(int d) {
            data = d;
        }

        void appendToTail(int d) {
            Node end = new Node(d);
            Node n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
        }

//        void deleteDups(Node n) {
//            HashSet set = new HashSet();
//            Node previous = null;
//            while (n != null) {
//                if (set.contains(n.data)) {
//                    previous.next = n.next;
//                } else {
//                    set.add(n.data);
//                    previous = n;
//                }
//                n = n.next;
//            }
//        }

        void deleteDups(Node head) {
            Node current = head;
            while (current != null) {
                Node runner = current;
                while (runner.next != null) {
                    if (runner.next.data == current.data) {
                        runner.next = runner.next.next;
                    } else {
                        runner = runner.next;
                    }
                }
                current = current.next;
            }

        }
    }

    public static void main(String[] args) {
        Node n = new Node(0);
        n.appendToTail(1);
        n.appendToTail(2);
        n.appendToTail(2);
        n.deleteDups(n);
        System.out.println(n.data);

    }
}
