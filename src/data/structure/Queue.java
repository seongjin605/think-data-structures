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
        QueueNode<T> t = new QueueNode(item);
        if(last != null) {
            last.next = t;
        }
        last = t;
        if(first == null) {
            first = last;
        }
    }

    public T remove() {
        // if empty throw
        if(first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if(first == null) {
            last = null;
        }
        return data;
    }

    // peek
    public T peek() {
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return first == null;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        System.out.println(q.peek());
    }
}
