package data.structure;

import java.util.NoSuchElementException;

public class Queue<T> {

    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T item) {
        QueueNode<T> t = new QueueNode<>(item);
        // 끝이 존재하면 끝의 다음 노드를 현재 입력한 데이터로 변경.
        if(last != null) {
            last.next = t;
        }
        last = t;
        if(first == null) {
            first = last;
        }
    }

    public T remove() {
        if(first == null) throw new NoSuchElementException();
        // first를 백업
        T item = first.data;
        first = first.next;
        return item;
    }

    public T peek() {
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove()); // 1 remove
        System.out.println(q.remove()); // 2 remove
        System.out.println(q.peek()); // 3 peek
        System.out.println(q.isEmpty()); // false
        System.out.println(q.remove()); // 3 remove
        System.out.println(q.isEmpty()); // false
        System.out.println(q.remove());  // 4 remove
        System.out.println(q.isEmpty()); // true

    }
}
